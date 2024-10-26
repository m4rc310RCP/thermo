package br.com.m4rc310.thermometry.api.services.thermo;

import java.util.ArrayList;
import java.util.List;

import org.reactivestreams.Publisher;

import br.com.m4rc310.thermometry.api.model.thermo.ThermoDevice;
import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.GraphQLSubscription;
import reactor.core.publisher.Flux;


//@Slf4j
//@Service
//@GraphQLApi
public class ThermoService extends MService {
	
	private static final String KEY_REQUESTS_REGISTER_DEVICE = "requests_register_devices";
	
	
	@GraphQLMutation(name = MUTATION$thermo_device, description = DESC$mutation_thermo_device)
	public ThermoDevice store(
			@GraphQLArgument(name = FIELD$thermo_device, description = DESC$field_thermo_device) ThermoDevice device) {

		ThermoDevice local = thermoDeviceRepository.findById(device.getSerialNumber()).orElse(device);

		cloneAtoB(local, device);
		
		try {
			flux.callPublish(ThermoDevice.class, device.getSerialNumber(), device);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return thermoDeviceRepository.save(device);
	}

	@GraphQLQuery(name = INDICATOR$registered, description = DESC$indicator_registered)
	public Boolean isRegistered(@GraphQLContext ThermoDevice device) {
		try {
			return thermoDeviceRepository.existsBySerialNumber(device.getSerialNumber());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@GraphQLQuery(name = QUERY$verify_device, description = DESC$query_verify_device)
	public ThermoDevice hasRegistered(
			@GraphQLArgument(name = NUMBER$serial, description = DESC$number_serial) String serial) {
		ThermoDevice device = new ThermoDevice();
		device.setSerialNumber(serial);
		return thermoDeviceRepository.findById(serial).orElse(device);
	}


	@GraphQLSubscription(name = SUBSCRIPTION$request_register_device, description = DESC$subscription_request_register_device)
	public Publisher<ThermoDevice> requestThermoDeviceRegister(
			@GraphQLArgument(name = NUMBER$serial, description = DESC$number_serial) String serial) {
		Publisher<ThermoDevice> request = flux.publish(ThermoDevice.class, serial);
		return request;
	}
	
	@GraphQLQuery(name=QUERY$request_devices, description=DESC$query_request_devices)
	public List<ThermoDevice> listRequestDevices() {
		List<ThermoDevice> list = new ArrayList<>();
		
		flux.getKeys(ThermoDevice.class).forEach(serial -> {
			String serialNumber = serial.replace(String.format("%s-", ThermoDevice.class.getSimpleName()), "");
			ThermoDevice device = new ThermoDevice();
			device.setSerialNumber(serialNumber);
			list.add(device);
		});
		
		return list;
	}
	
	
//	@WsStopConnection
//	public void callListPublishRegisterDevice()  {
//		List<ThermoDevice> list = listRequestDevices();
//		flux.callListPublish(ThermoDevice.class, KEY_REQUESTS_REGISTER_DEVICE, list);
//	}
//	
//	
	@GraphQLSubscription(name=SUBSCRIPTION$requested_register_device, description=DESC$subscription_requested_register_device)
	public Flux<List<ThermoDevice>> listRequestsDeviceResters() {
		List<ThermoDevice> list = listRequestDevices();
		return flux.publishList(ThermoDevice.class, KEY_REQUESTS_REGISTER_DEVICE, list);
	}
	
}
