package br.com.m4rc310.thermometry.api.i18n;


import br.com.m4rc310.gql.annotations.MConstants;

@MConstants
public interface IConsts {
	//--------------------------------------------------
	// ********** DATE **********
	//--------------------------------------------------
	// @GraphQLQuery(name=DATE$audity_insertion, description=DESC$date_audity_insertion)
	public static final String DATE$audity_insertion = "${date.audity.insertion}";
	// @GraphQLQuery(name=DATE$audity_register, description=DESC$date_audity_register)
	public static final String DATE$audity_register = "${date.audity.register}";
	// @GraphQLQuery(name=DATE$heart_beat, description=DESC$date_heart_beat)
	public static final String DATE$heart_beat = "${date.heart.beat}";

	//--------------------------------------------------
	// ********** DESC **********
	//--------------------------------------------------
	public static final String DESC$date_audity_insertion = "${desc.date.audity.insertion}";
	public static final String DESC$date_audity_register = "${desc.date.audity.register}";
	public static final String DESC$date_heart_beat = "${desc.date.heart.beat}";
	public static final String DESC$description_thermo_device = "${desc.description.thermo.device}";
	public static final String DESC$description_thermo_silo = "${desc.description.thermo.silo}";
	public static final String DESC$field_thermo_device = "${desc.field.thermo.device}";
	public static final String DESC$field_thermo_silo = "${desc.field.thermo.silo}";
	public static final String DESC$indicator_device_linked = "${desc.indicator.device.linked}";
	public static final String DESC$indicator_registered = "${desc.indicator.registered}";
	public static final String DESC$mutation_thermo_device = "${desc.mutation.thermo.device}";
	public static final String DESC$mutation_thermo_silo = "${desc.mutation.thermo.silo}";
	public static final String DESC$name_manufacturer = "${desc.name.manufacturer}";
	public static final String DESC$number_audity_register = "${desc.number.audity.register}";
	public static final String DESC$number_serial = "${desc.number.serial}";
	public static final String DESC$number_thermo_silo = "${desc.number.thermo.silo}";
	public static final String DESC$number_version = "${desc.number.version}";
	public static final String DESC$query_app_info = "${desc.query.app.info}";
	public static final String DESC$query_request_devices = "${desc.query.request.devices}";
	public static final String DESC$query_test_app = "${desc.query.test.app}";
	public static final String DESC$query_verify_device = "${desc.query.verify.device}";
	public static final String DESC$subscription_info_app = "${desc.subscription.info.app}";
	public static final String DESC$subscription_request_register_device = "${desc.subscription.request.register.device}";
	public static final String DESC$subscription_requested_register_device = "${desc.subscription.requested.register.device}";
	public static final String DESC$type_audited = "${desc.type.audited}";
	public static final String DESC$type_dto_app_info = "${desc.type.dto.app.info}";
	public static final String DESC$type_thermo_silo = "${desc.type.thermo.silo}";

	//--------------------------------------------------
	// ********** DESCRIPTION **********
	//--------------------------------------------------
	// @GraphQLQuery(name=DESCRIPTION$thermo_device, description=DESC$description_thermo_device)
	public static final String DESCRIPTION$thermo_device = "${description.thermo.device}";
	// @GraphQLQuery(name=DESCRIPTION$thermo_silo, description=DESC$description_thermo_silo)
	public static final String DESCRIPTION$thermo_silo = "${description.thermo.silo}";

	//--------------------------------------------------
	// ********** FIELD **********
	//--------------------------------------------------
	// @GraphQLArgument(name=FIELD$thermo_device, description=DESC$field_thermo_device)
	public static final String FIELD$thermo_device = "${field.thermo.device}";
	// @GraphQLArgument(name=FIELD$thermo_silo, description=DESC$field_thermo_silo)
	public static final String FIELD$thermo_silo = "${field.thermo.silo}";

	//--------------------------------------------------
	// ********** INDICATOR **********
	//--------------------------------------------------
	// @GraphQLQuery(name=INDICATOR$device_linked, description=DESC$indicator_device_linked)
	public static final String INDICATOR$device_linked = "${indicator.device.linked}";
	// @GraphQLQuery(name=INDICATOR$registered, description=DESC$indicator_registered)
	public static final String INDICATOR$registered = "${indicator.registered}";

	//--------------------------------------------------
	// ********** MUTATION **********
	//--------------------------------------------------
	// @GraphQLMutation(name=MUTATION$thermo_device, description=DESC$mutation_thermo_device)
	public static final String MUTATION$thermo_device = "${mutation.thermo.device}";
	// @GraphQLMutation(name=MUTATION$thermo_silo, description=DESC$mutation_thermo_silo)
	public static final String MUTATION$thermo_silo = "${mutation.thermo.silo}";

	//--------------------------------------------------
	// ********** NAME **********
	//--------------------------------------------------
	// @GraphQLQuery(name=NAME$manufacturer, description=DESC$name_manufacturer)
	public static final String NAME$manufacturer = "${name.manufacturer}";

	//--------------------------------------------------
	// ********** NUMBER **********
	//--------------------------------------------------
	// @GraphQLQuery(name=NUMBER$audity_register, description=DESC$number_audity_register)
	public static final String NUMBER$audity_register = "${number.audity.register}";
	// @GraphQLQuery(name=NUMBER$serial, description=DESC$number_serial)
	public static final String NUMBER$serial = "${number.serial}";
	// @GraphQLQuery(name=NUMBER$thermo_silo, description=DESC$number_thermo_silo)
	public static final String NUMBER$thermo_silo = "${number.thermo.silo}";
	// @GraphQLQuery(name=NUMBER$version, description=DESC$number_version)
	public static final String NUMBER$version = "${number.version}";

	//--------------------------------------------------
	// ********** QUERY **********
	//--------------------------------------------------
	// @GraphQLQuery(name=QUERY$app_info, description=DESC$query_app_info)
	public static final String QUERY$app_info = "${query.app.info}";
	// @GraphQLQuery(name=QUERY$request_devices, description=DESC$query_request_devices)
	public static final String QUERY$request_devices = "${query.request.devices}";
	// @GraphQLQuery(name=QUERY$test_app, description=DESC$query_test_app)
	public static final String QUERY$test_app = "${query.test.app}";
	// @GraphQLQuery(name=QUERY$verify_device, description=DESC$query_verify_device)
	public static final String QUERY$verify_device = "${query.verify.device}";

	//--------------------------------------------------
	// ********** SUBSCRIPTION **********
	//--------------------------------------------------
	// @GraphQLSubscription(name=SUBSCRIPTION$info_app, description=DESC$subscription_info_app)
	public static final String SUBSCRIPTION$info_app = "${subscription.info.app}";
	// @GraphQLSubscription(name=SUBSCRIPTION$request_register_device, description=DESC$subscription_request_register_device)
	public static final String SUBSCRIPTION$request_register_device = "${subscription.request.register.device}";
	// @GraphQLSubscription(name=SUBSCRIPTION$requested_register_device, description=DESC$subscription_requested_register_device)
	public static final String SUBSCRIPTION$requested_register_device = "${subscription.requested.register.device}";

	//--------------------------------------------------
	// ********** TYPE **********
	//--------------------------------------------------
	// @GraphQLType(name=IConsts.TYPE$audited, description=IConsts.DESC$type_audited)
	public static final String TYPE$audited = "${type.audited}";
	// @GraphQLType(name=IConsts.TYPE$dto_app_info, description=IConsts.DESC$type_dto_app_info)
	public static final String TYPE$dto_app_info = "${type.dto.app.info}";
	// @GraphQLType(name=IConsts.TYPE$thermo_device, description=IConsts.DESC$type_thermo_device)
	public static final String TYPE$thermo_device = "${type.thermo.device}";
	// @GraphQLType(name=IConsts.TYPE$thermo_silo, description=IConsts.DESC$type_thermo_silo)
	public static final String TYPE$thermo_silo = "${type.thermo.silo}";


}
