package br.com.m4rc310.thermometry.api.dto;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLEnumValue;

public enum EnumState implements IConsts{
	@GraphQLEnumValue(name=ENUMVALUE$state_on, description=DESC$enumvalue_state_on)
	ON, 
	@GraphQLEnumValue(name=ENUMVALUE$state_off, description=DESC$enumvalue_state_off)
	OFF
}
