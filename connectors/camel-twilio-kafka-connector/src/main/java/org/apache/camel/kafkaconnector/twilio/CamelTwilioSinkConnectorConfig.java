/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.twilio;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelTwilioSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_TWILIO_PATH_API_NAME_CONF = "camel.sink.path.apiName";
    public static final String CAMEL_SINK_TWILIO_PATH_API_NAME_DOC = "What kind of operation to perform One of: [ACCOUNT] [ADDRESS] [APPLICATION] [AVAILABLE_PHONE_NUMBER_COUNTRY] [CALL] [CONFERENCE] [CONNECT_APP] [INCOMING_PHONE_NUMBER] [KEY] [MESSAGE] [NEW_KEY] [NEW_SIGNING_KEY] [NOTIFICATION] [OUTGOING_CALLER_ID] [QUEUE] [RECORDING] [SHORT_CODE] [SIGNING_KEY] [TOKEN] [TRANSCRIPTION] [VALIDATION_REQUEST] [ADDRESS_DEPENDENT_PHONE_NUMBER] [AVAILABLE_PHONE_NUMBER_COUNTRY_LOCAL] [AVAILABLE_PHONE_NUMBER_COUNTRY_MOBILE] [AVAILABLE_PHONE_NUMBER_COUNTRY_TOLL_FREE] [CALL_FEEDBACK] [CALL_FEEDBACK_SUMMARY] [CALL_NOTIFICATION] [CALL_RECORDING] [CONFERENCE_PARTICIPANT] [INCOMING_PHONE_NUMBER_LOCAL] [INCOMING_PHONE_NUMBER_MOBILE] [INCOMING_PHONE_NUMBER_TOLL_FREE] [MESSAGE_FEEDBACK] [MESSAGE_MEDIA] [QUEUE_MEMBER] [RECORDING_ADD_ON_RESULT] [RECORDING_TRANSCRIPTION] [RECORDING_ADD_ON_RESULT_PAYLOAD] [SIP_CREDENTIAL_LIST] [SIP_DOMAIN] [SIP_IP_ACCESS_CONTROL_LIST] [SIP_CREDENTIAL_LIST_CREDENTIAL] [SIP_DOMAIN_CREDENTIAL_LIST_MAPPING] [SIP_DOMAIN_IP_ACCESS_CONTROL_LIST_MAPPING] [SIP_IP_ACCESS_CONTROL_LIST_IP_ADDRESS] [USAGE_RECORD] [USAGE_TRIGGER] [USAGE_RECORD_ALL_TIME] [USAGE_RECORD_DAILY] [USAGE_RECORD_LAST_MONTH] [USAGE_RECORD_MONTHLY] [USAGE_RECORD_THIS_MONTH] [USAGE_RECORD_TODAY] [USAGE_RECORD_YEARLY] [USAGE_RECORD_YESTERDAY]";
    public static final String CAMEL_SINK_TWILIO_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_PATH_METHOD_NAME_CONF = "camel.sink.path.methodName";
    public static final String CAMEL_SINK_TWILIO_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation One of: [create] [delete] [fetch] [read] [update]";
    public static final String CAMEL_SINK_TWILIO_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_IN_BODY_CONF = "camel.sink.endpoint.inBody";
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_TWILIO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_TWILIO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_TWILIO_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_TWILIO_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.twilio.lazyStartProducer";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_TWILIO_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.twilio.basicPropertyBinding";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_TWILIO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_CONFIGURATION_CONF = "camel.component.twilio.configuration";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_REST_CLIENT_CONF = "camel.component.twilio.restClient";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_REST_CLIENT_DOC = "To use the shared REST client";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_REST_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_ACCOUNT_SID_CONF = "camel.component.twilio.accountSid";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_ACCOUNT_SID_DOC = "The account SID to use.";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_ACCOUNT_SID_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_PASSWORD_CONF = "camel.component.twilio.password";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_PASSWORD_DOC = "Auth token for the account.";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_TWILIO_COMPONENT_USERNAME_CONF = "camel.component.twilio.username";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_USERNAME_DOC = "The account to use.";
    public static final String CAMEL_SINK_TWILIO_COMPONENT_USERNAME_DEFAULT = null;

    public CamelTwilioSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelTwilioSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_TWILIO_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_TWILIO_PATH_API_NAME_DOC);
        conf.define(CAMEL_SINK_TWILIO_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_TWILIO_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SINK_TWILIO_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SINK_TWILIO_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWILIO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_TWILIO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWILIO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_TWILIO_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWILIO_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWILIO_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWILIO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_REST_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_COMPONENT_REST_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_REST_CLIENT_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_ACCOUNT_SID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_COMPONENT_ACCOUNT_SID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_ACCOUNT_SID_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_TWILIO_COMPONENT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWILIO_COMPONENT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWILIO_COMPONENT_USERNAME_DOC);
        return conf;
    }
}