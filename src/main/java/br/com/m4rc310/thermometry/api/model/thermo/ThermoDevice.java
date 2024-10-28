package br.com.m4rc310.thermometry.api.model.thermo;

import java.io.Serializable;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import br.com.m4rc310.thermometry.api.model.patterns.IAudited;
import io.leangen.graphql.annotations.GraphQLIgnore;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = IConsts.TYPE$thermo_device)
@GraphQLType(name = IConsts.TYPE$thermo_device)
public class ThermoDevice implements Serializable, IConsts, IAudited {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = NUMBER$serial)
	@GraphQLQuery(name = NUMBER$serial, description = DESC$number_serial)
	private String serialNumber;
	
	@Column(name = NAME$manufacturer, length = 50)
	@GraphQLQuery(name=NAME$manufacturer, description=DESC$name_manufacturer)
	private String manufacturer;
	
	@Column(name = DESCRIPTION$thermo_device, length = 200)
	@GraphQLQuery(name=DESCRIPTION$thermo_device, description=DESC$description_thermo_device)
	private String description;
	
	@Column(name = NUMBER$audity_register)
	@GraphQLIgnore
	private Long numberRegister;
}
