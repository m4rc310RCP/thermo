package br.com.m4rc310.thermometry.api.model.thermo.silo;

import java.io.Serializable;

import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name=IConsts.TYPE$thermo_silo)
@GraphQLType(name=IConsts.TYPE$thermo_silo, description=IConsts.DESC$type_thermo_silo)
public class ThermoSilo implements Serializable, IConsts {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = NUMBER$thermo_silo)
	@GraphQLQuery(name=NUMBER$thermo_silo, description=DESC$number_thermo_silo)
	private Long number;
	
	
	@Column(name = DESCRIPTION$thermo_silo)
	@GraphQLQuery(name=DESCRIPTION$thermo_silo, description=DESC$description_thermo_silo)
	private String description;
}
