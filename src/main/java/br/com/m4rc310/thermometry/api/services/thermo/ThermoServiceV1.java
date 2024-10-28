package br.com.m4rc310.thermometry.api.services.thermo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.reactivestreams.Publisher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.com.m4rc310.gql.websocket.MStopConnection;
import br.com.m4rc310.thermometry.api.model.thermo.ThermoDevice;
import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.GraphQLSubscription;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@Service
@GraphQLApi
@EnableScheduling
public class ThermoServiceV1 extends MService {

	private Map<String, ThermoDevice> mapRequestDevice = new HashMap<>();
	
	private static final String KEY_REQUSTED_DEVICES = "key_requsted_devices";

	@GraphQLQuery(name = INDICATOR$registered, description = DESC$indicator_registered)
	public Boolean isRegistered(@GraphQLContext ThermoDevice device) {
		try {
			return thermoDeviceRepository.existsBySerialNumber(device.getSerialNumber());
		} catch (Exception e) {
			return false;
		}
	}
	
	@GraphQLQuery(name=QUERY$request_devices, description=DESC$query_request_devices)
	public List<ThermoDevice> getRequestDevices() {
		return new ArrayList<>(mapRequestDevice.values());
	}
	
	@GraphQLQuery(name=QUERY$list_all_devices, description=DESC$query_list_all_devices)
	public List<ThermoDevice> listAllDevices(){
		return thermoDeviceRepository.findAll();
	}
	
	
	@GraphQLQuery(name=QUERY$verify_device, description=DESC$query_verify_device)
	public ThermoDevice getThermoDevice(
			@GraphQLArgument(name=NUMBER$serial, description=DESC$number_serial) String numberSerial
			) {
		ThermoDevice defaultDevice = new ThermoDevice();
		defaultDevice.setSerialNumber(numberSerial);
		return thermoDeviceRepository.findById(numberSerial).orElse(defaultDevice);
	}
	
	@GraphQLSubscription(name=SUBSCRIPTION$requested_register_device, description=DESC$subscription_requested_register_device)
	public Flux<List<ThermoDevice>> subsRequestDevices() {
		 return flux.publishList(ThermoDevice.class, KEY_REQUSTED_DEVICES, getRequestDevices());
	}
	

	@GraphQLSubscription(name = SUBSCRIPTION$request_register_device, description = DESC$subscription_request_register_device)
	public Publisher<ThermoDevice> requestRegister(
			@GraphQLArgument(name = FIELD$thermo_device, description = DESC$field_thermo_device) ThermoDevice device) {
		String serial = device.getSerialNumber();
		
		if (isRegistered(device)) {
			return null;
		}

		mapRequestDevice.put(serial, device);			
		callListPublishThermoDevice();
		
		return flux.publish(ThermoDevice.class, serial, device);
	}
	
	@GraphQLMutation(name=MUTATION$thermo_device, description=DESC$mutation_thermo_device)
	public ThermoDevice storeThermoDevice(
			@GraphQLArgument(name = FIELD$thermo_device, description = DESC$field_thermo_device)
			ThermoDevice device) {
		
		ThermoDevice local = thermoDeviceRepository.findById(device.getSerialNumber()).orElse(device);
		cloneAtoB(local, device);
		device = thermoDeviceRepository.save(device);
		
		String serial = device.getSerialNumber();
		mapRequestDevice.remove(serial);
		
		callPublishDevice(device);
		callListPublishThermoDevice();
		
		return device;
	}

	@Scheduled(cron = "*/10 * * * * *")
	@MStopConnection
	public void updateRequestDevices() {
		Class<ThermoDevice> type = ThermoDevice.class;
	    Iterator<Map.Entry<String, ThermoDevice>> iterator = mapRequestDevice.entrySet().iterator();

	    while (iterator.hasNext()) {
	        Map.Entry<String, ThermoDevice> entry = iterator.next();
	        String key = entry.getKey();
	        boolean influx = false;
	        
	        for (String skey : flux.getKeys(type)) {
	            skey = skey.replace(type.getSimpleName() + "-", "");
	            if (skey.equals(key)) {
	                influx = true;
	                break;
	            }
	        }

	        if (!influx) {
	            iterator.remove();
	        }
	    }
	    
	    callListPublishThermoDevice();
	}
	
	private void callPublishDevice(ThermoDevice device) {
		try {
			String serial = device.getSerialNumber();
			flux.callPublish(ThermoDevice.class, serial, device);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void callListPublishThermoDevice() {
		flux.callListPublish(ThermoDevice.class, KEY_REQUSTED_DEVICES, getRequestDevices());		
	}

}
