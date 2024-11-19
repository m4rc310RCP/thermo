package br.com.m4rc310.thermometry.api.services.thermo;

import org.reactivestreams.Publisher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.com.m4rc310.thermometry.api.dto.DtoControl;
import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLSubscription;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@GraphQLApi
@EnableScheduling
public class ThermoServiceV2 extends MService {
	
	//private Map<String, Map<String, DtoControl>> mapDtoControl = new HashMap<>();
	
	
	@GraphQLMutation(name=MUTATION$call_action_test, description=DESC$mutation_call_action_test)
	public DtoControl callAction(
			@GraphQLArgument(name=NUMBER$serial, description=DESC$number_serial)
			String serialNumber,
			@GraphQLArgument(name=ARGUMENT$control, description=DESC$argument_control)
			DtoControl control) {
		try {
			flux.callPublish(serialNumber, control);			
		} catch (Exception e) {
			
		}
		return control;
	}
	
	
	@GraphQLSubscription(name = "${subscription.control}")
	public Publisher<DtoControl> requestRegister(
			@GraphQLArgument(name=NUMBER$serial, description=DESC$number_serial)
			String serialNumber) {
		return flux.publish(DtoControl.class, serialNumber);
	}
	
//	@GraphQLSubscription(name="")
//	public Flux<List<DtoControl>> subsRequestDevices(
//			@GraphQLArgument(name=NUMBER$serial, description=DESC$number_serial)
//			String serialNumber) {
//		 return flux.publishList(DtoControl.class, serialNumber, getRequestDevices());
//	}
	
	
}
