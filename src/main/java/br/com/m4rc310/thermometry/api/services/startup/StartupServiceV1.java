package br.com.m4rc310.thermometry.api.services.startup;

import org.springframework.stereotype.Service;

import br.com.m4rc310.thermometry.api.services.MService;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class StartupServiceV1 extends MService {
	@GraphQLQuery(name=NUMBER$version, description=DESC$number_version)
	public String appVersion() {
		return "v1.0.0";
	}
}
