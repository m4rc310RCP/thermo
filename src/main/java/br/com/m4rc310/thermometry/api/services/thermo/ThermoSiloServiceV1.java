package br.com.m4rc310.thermometry.api.services.thermo;

import br.com.m4rc310.thermometry.api.model.thermo.silo.ThermoSilo;
import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;

//@Service
//@GraphQLApi
public class ThermoSiloServiceV1 extends MService{
	
	@GraphQLMutation(name=MUTATION$thermo_silo, description=DESC$mutation_thermo_silo)
	public ThermoSilo storeSilo(
			@GraphQLArgument(name=FIELD$thermo_silo, description=DESC$field_thermo_silo)
			ThermoSilo silo) {
		Long number = silo.getNumber();
		ThermoSilo local = new ThermoSilo();
		if (number != null) {
			local = thermoSiloRepository.findById(number).orElse(silo);
		}
		
		cloneAtoB(local, silo);			
		return thermoSiloRepository.saveAndFlush(silo);
	}
}
