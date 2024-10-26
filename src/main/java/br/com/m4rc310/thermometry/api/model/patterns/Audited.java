package br.com.m4rc310.thermometry.api.model.patterns;

import java.io.Serializable;
import java.util.Date;

import br.com.m4rc310.gql.mappers.annotations.MDate;
import br.com.m4rc310.thermometry.api.i18n.IConsts;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = IConsts.TYPE$audited)
@GraphQLType(name = IConsts.TYPE$audited, description = IConsts.DESC$type_audited)
public class Audited implements Serializable, IConsts {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = NUMBER$audity_register)
	@GraphQLQuery(name = NUMBER$audity_register, description = DESC$number_audity_register)
	private Long numberRegister;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name=DATE$audity_register)
	@MDate()
	@GraphQLQuery(name=DATE$audity_register, description=DESC$date_audity_register)
	private Date dateRegister;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name=DATE$audity_insertion)
	@MDate()
	@GraphQLQuery(name=DATE$audity_insertion, description=DESC$date_audity_insertion)
	private Date dateInsertion;
}
