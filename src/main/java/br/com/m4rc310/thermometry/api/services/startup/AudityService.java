package br.com.m4rc310.thermometry.api.services.startup;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.com.m4rc310.gql.mappers.annotations.MDate;
import br.com.m4rc310.thermometry.api.model.patterns.Audited;
import br.com.m4rc310.thermometry.api.model.patterns.IAudited;
import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@GraphQLApi
@EnableScheduling
public class AudityService extends MService{
	
	@MDate
	@GraphQLQuery(name=DATE$audity_register, description=DESC$date_audity_register)
	public Date getAudityRegister(@GraphQLContext IAudited audited) {
		try {
			Audited audit = auditedRepository.findById(audited.getNumberRegister()).orElseThrow();
			return audit.getDateRegister();
		} catch (Exception e) {
			return null;
		}
	}

	@MDate
	@GraphQLQuery(name=DATE$audity_insertion, description=DESC$date_audity_insertion)
	public Date getAudityInsertion(@GraphQLContext IAudited audited) {
		try {
			Audited audit = auditedRepository.findById(audited.getNumberRegister()).orElseThrow();
			return audit.getDateInsertion();
		} catch (Exception e) {
			return null;
		}
	}
	
}
