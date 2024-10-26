package br.com.m4rc310.thermometry.api.services;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import br.com.m4rc310.thermometry.api.model.patterns.Audited;
import br.com.m4rc310.thermometry.api.model.patterns.AuditedRepository;
import br.com.m4rc310.thermometry.api.model.patterns.IAudited;
import br.com.m4rc310.thermometry.api.model.thermo.ThermoDeviceRepository;
import br.com.m4rc310.thermometry.api.model.thermo.silo.ThermoSiloRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MService extends br.com.m4rc310.gql.services.MService implements IConsts {

	@Autowired
	protected ThermoDeviceRepository thermoDeviceRepository;

	@Autowired
	protected AuditedRepository auditedRepository;
	
	@Autowired
	protected ThermoSiloRepository thermoSiloRepository;

	@Transactional
	protected <T> void cloneAtoB(T a, T b) {
		if (a != null && b != null) {
			flux.cloneAtoB(a, b);
			if (b instanceof IAudited) {
				storeHistoric((IAudited) b);
			}
		}
	}

	@Transactional
	protected void storeHistoric(IAudited entity) {
		Long numberRegister = entity.getNumberRegister();

		Audited audited ;
		
		if (Objects.isNull(numberRegister)) {
			audited = new Audited();
			audited.setDateInsertion(new Date());
			audited.setDateRegister(new Date());
		}else {
			audited = auditedRepository.findById(numberRegister).orElse(new Audited());
			audited.setDateRegister(new Date());
		}
		
		audited = auditedRepository.save(audited);
		entity.setNumberRegister(audited.getNumberRegister());
	}

}
