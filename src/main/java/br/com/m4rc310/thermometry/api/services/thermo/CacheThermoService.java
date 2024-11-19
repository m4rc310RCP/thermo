package br.com.m4rc310.thermometry.api.services.thermo;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import br.com.m4rc310.thermometry.api.dto.DtoControl;
import br.com.m4rc310.thermometry.api.services.MService;

@Service
@EnableCaching
public class CacheThermoService extends MService {
	
}
