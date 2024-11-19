package br.com.m4rc310.thermometry.api.dto;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLEnumValue;

public enum EnumAction implements IConsts {
	@GraphQLEnumValue(name=ENUMVALUE$toggle_relay, description=DESC$enumvalue_toggle_relay)
	TOGGLE_RELAY
}
