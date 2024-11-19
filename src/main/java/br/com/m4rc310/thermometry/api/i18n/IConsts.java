package br.com.m4rc310.thermometry.api.i18n;


import br.com.m4rc310.gql.annotations.MConstants;

@MConstants
public interface IConsts {
	//--------------------------------------------------
	// ********** ARGUMENT **********
	//--------------------------------------------------
	// @GraphQLArgument(name=ARGUMENT$control, description=DESC$argument_control)
	public static final String ARGUMENT$control = "${argument.control}";

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
	public static final String DESC$argument_control = "${desc.argument.control}";
	public static final String DESC$date_audity_insertion = "${desc.date.audity.insertion}";
	public static final String DESC$date_audity_register = "${desc.date.audity.register}";
	public static final String DESC$date_heart_beat = "${desc.date.heart.beat}";
	public static final String DESC$description_thermo_device = "${desc.description.thermo.device}";
	public static final String DESC$description_thermo_silo = "${desc.description.thermo.silo}";
	public static final String DESC$dto_control = "${desc.dto.control}";
	public static final String DESC$dto_control_param = "${desc.dto.control.param}";
	public static final String DESC$enum_action = "${desc.enum.action}";
	public static final String DESC$enum_identify_item = "${desc.enum.identify.item}";
	public static final String DESC$enum_state = "${desc.enum.state}";
	public static final String DESC$enumvalue_internal_led = "${desc.enumvalue.internal.led}";
	public static final String DESC$enumvalue_state_off = "${desc.enumvalue.state.off}";
	public static final String DESC$enumvalue_state_on = "${desc.enumvalue.state.on}";
	public static final String DESC$enumvalue_toggle_relay = "${desc.enumvalue.toggle.relay}";
	public static final String DESC$field_action_param = "${desc.field.action.param}";
	public static final String DESC$field_thermo_device = "${desc.field.thermo.device}";
	public static final String DESC$field_thermo_silo = "${desc.field.thermo.silo}";
	public static final String DESC$identify_item = "${desc.identify.item}";
	public static final String DESC$indicator_device_linked = "${desc.indicator.device.linked}";
	public static final String DESC$indicator_registered = "${desc.indicator.registered}";
	public static final String DESC$mutation_call_action_test = "${desc.mutation.call.action.test}";
	public static final String DESC$mutation_thermo_device = "${desc.mutation.thermo.device}";
	public static final String DESC$mutation_thermo_silo = "${desc.mutation.thermo.silo}";
	public static final String DESC$name_manufacturer = "${desc.name.manufacturer}";
	public static final String DESC$number_audity_register = "${desc.number.audity.register}";
	public static final String DESC$number_serial = "${desc.number.serial}";
	public static final String DESC$number_thermo_silo = "${desc.number.thermo.silo}";
	public static final String DESC$number_version = "${desc.number.version}";
	public static final String DESC$query_app_info = "${desc.query.app.info}";
	public static final String DESC$query_list_all_devices = "${desc.query.list.all.devices}";
	public static final String DESC$query_request_devices = "${desc.query.request.devices}";
	public static final String DESC$query_test_app = "${desc.query.test.app}";
	public static final String DESC$query_verify_device = "${desc.query.verify.device}";
	public static final String DESC$subscription_control = "${desc.subscription.control}";
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
	// ********** DTO **********
	//--------------------------------------------------
	// @GraphQLQuery(name=DTO$control, description=DESC$dto_control)
	public static final String DTO$control = "${dto.control}";
	// @GraphQLQuery(name=DTO$control_param, description=DESC$dto_control_param)
	public static final String DTO$control_param = "${dto.control.param}";

	//--------------------------------------------------
	// ********** ENUM **********
	//--------------------------------------------------
	// @GraphQLQuery(name=ENUM$action, description=DESC$enum_action)
	public static final String ENUM$action = "${enum.action}";
	// @GraphQLQuery(name=ENUM$identify_item, description=DESC$enum_identify_item)
	public static final String ENUM$identify_item = "${enum.identify.item}";
	// @GraphQLQuery(name=ENUM$state, description=DESC$enum_state)
	public static final String ENUM$state = "${enum.state}";

	//--------------------------------------------------
	// ********** ENUMVALUE **********
	//--------------------------------------------------
	// @GraphQLQuery(name=ENUMVALUE$internal_led, description=DESC$enumvalue_internal_led)
	public static final String ENUMVALUE$internal_led = "${enumvalue.internal.led}";
	// @GraphQLQuery(name=ENUMVALUE$state_off, description=DESC$enumvalue_state_off)
	public static final String ENUMVALUE$state_off = "${enumvalue.state.off}";
	// @GraphQLQuery(name=ENUMVALUE$state_on, description=DESC$enumvalue_state_on)
	public static final String ENUMVALUE$state_on = "${enumvalue.state.on}";
	// @GraphQLQuery(name=ENUMVALUE$toggle_relay, description=DESC$enumvalue_toggle_relay)
	public static final String ENUMVALUE$toggle_relay = "${enumvalue.toggle.relay}";

	//--------------------------------------------------
	// ********** FIELD **********
	//--------------------------------------------------
	// @GraphQLArgument(name=FIELD$action_param, description=DESC$field_action_param)
	public static final String FIELD$action_param = "${field.action.param}";
	// @GraphQLArgument(name=FIELD$thermo_device, description=DESC$field_thermo_device)
	public static final String FIELD$thermo_device = "${field.thermo.device}";
	// @GraphQLArgument(name=FIELD$thermo_silo, description=DESC$field_thermo_silo)
	public static final String FIELD$thermo_silo = "${field.thermo.silo}";

	//--------------------------------------------------
	// ********** IDENTIFY **********
	//--------------------------------------------------
	// @GraphQLQuery(name=IDENTIFY$item, description=DESC$identify_item)
	public static final String IDENTIFY$item = "${identify.item}";

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
	// @GraphQLMutation(name=MUTATION$call_action_test, description=DESC$mutation_call_action_test)
	public static final String MUTATION$call_action_test = "${mutation.call.action.test}";
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
	// @GraphQLQuery(name=QUERY$list_all_devices, description=DESC$query_list_all_devices)
	public static final String QUERY$list_all_devices = "${query.list.all.devices}";
	// @GraphQLQuery(name=QUERY$request_devices, description=DESC$query_request_devices)
	public static final String QUERY$request_devices = "${query.request.devices}";
	// @GraphQLQuery(name=QUERY$test_app, description=DESC$query_test_app)
	public static final String QUERY$test_app = "${query.test.app}";
	// @GraphQLQuery(name=QUERY$verify_device, description=DESC$query_verify_device)
	public static final String QUERY$verify_device = "${query.verify.device}";

	//--------------------------------------------------
	// ********** SUBSCRIPTION **********
	//--------------------------------------------------
	// @GraphQLSubscription(name=SUBSCRIPTION$control, description=DESC$subscription_control)
	public static final String SUBSCRIPTION$control = "${subscription.control}";
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
