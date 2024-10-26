package br.com.m4rc310.thermometry.api.dto;

import java.util.Date;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.Data;

@Data
@GraphQLType(name=IConsts.TYPE$dto_app_info, description=IConsts.DESC$type_dto_app_info)
public class DtoAppInfo implements IConsts {
	
	@GraphQLQuery(name=DATE$heart_beat, description=DESC$date_heart_beat)
	private Date dateHeartBeat;
	
	@GraphQLQuery(name=NUMBER$version, description=DESC$number_version)
	private String version;
}
