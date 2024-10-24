package br.com.m4rc310.thermometry.api.services.startup;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@GraphQLApi
@EnableScheduling
public class StartupService extends MService{
	
	@GraphQLQuery(name=QUERY$test_app, description=DESC$query_test_app)
	public String test() {
		return "OK";
	}
}
