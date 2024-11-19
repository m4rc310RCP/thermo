package br.com.m4rc310.thermometry.api.dto;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import br.com.m4rc310.thermometry.api.model.thermo.ThermoDevice;
import io.leangen.graphql.annotations.GraphQLEnumValue;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.Data;

@Data
@GraphQLType(name = "${dto.device}")
public class DtoDevice implements IConsts{
	
	@GraphQLQuery(name=NUMBER$serial, description=DESC$number_serial)
	private String serialNumber;
}
