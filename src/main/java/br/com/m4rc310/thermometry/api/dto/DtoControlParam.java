package br.com.m4rc310.thermometry.api.dto;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLEnumValue;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.Data;

@Data
@GraphQLType(name = IConsts.DTO$control_param, description = IConsts.DESC$dto_control_param)
public class DtoControlParam implements IConsts {

	@GraphQLQuery(name=ENUM$identify_item, description=DESC$enum_identify_item)
	private EnumItemIdentify id;

	@GraphQLQuery(name=ENUM$state, description=DESC$enum_state)
	private EnumState state;
}
