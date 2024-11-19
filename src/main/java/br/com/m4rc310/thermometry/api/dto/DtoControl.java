package br.com.m4rc310.thermometry.api.dto;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLIgnore;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.Data;

@Data
@GraphQLType(name=IConsts.DTO$control, description=IConsts.DESC$dto_control)
public class DtoControl implements IConsts{
	
	@GraphQLIgnore
	private DtoDevice device;
	
	@GraphQLQuery(name=ENUM$action, description=DESC$enum_action)
	private EnumAction action;
	
	@GraphQLQuery(name=FIELD$action_param, description=DESC$field_action_param)
	private DtoControlParam param;
}
