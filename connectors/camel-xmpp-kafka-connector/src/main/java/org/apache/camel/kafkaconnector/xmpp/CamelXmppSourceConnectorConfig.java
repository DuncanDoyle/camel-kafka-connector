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
package org.apache.camel.kafkaconnector.xmpp;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelXmppSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_XMPP_PATH_HOST_CONF = "camel.source.path.host";
    public static final String CAMEL_SOURCE_XMPP_PATH_HOST_DOC = "Hostname for the chat server";
    public static final String CAMEL_SOURCE_XMPP_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_XMPP_PATH_PORT_DOC = "Port number for the chat server";
    public static final Integer CAMEL_SOURCE_XMPP_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_PATH_PARTICIPANT_CONF = "camel.source.path.participant";
    public static final String CAMEL_SOURCE_XMPP_PATH_PARTICIPANT_DOC = "JID (Jabber ID) of person to receive messages. room parameter has precedence over participant.";
    public static final String CAMEL_SOURCE_XMPP_PATH_PARTICIPANT_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_LOGIN_CONF = "camel.source.endpoint.login";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_LOGIN_DOC = "Whether to login the user.";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_LOGIN_DEFAULT = true;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_NICKNAME_CONF = "camel.source.endpoint.nickname";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_NICKNAME_DOC = "Use nickname when joining room. If room is specified and nickname is not, user will be used for the nickname.";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_NICKNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_PUBSUB_CONF = "camel.source.endpoint.pubsub";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_PUBSUB_DOC = "Accept pubsub packets on input, default is false";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_PUBSUB_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_CONF = "camel.source.endpoint.room";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_DOC = "If this option is specified, the component will connect to MUC (Multi User Chat). Usually, the domain name for MUC is different from the login domain. For example, if you are supermanjabber.org and want to join the krypton room, then the room URL is kryptonconference.jabber.org. Note the conference part. It is not a requirement to provide the full room JID. If the room parameter does not contain the symbol, the domain part will be discovered and added by Camel";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_SERVICE_NAME_CONF = "camel.source.endpoint.serviceName";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_SERVICE_NAME_DOC = "The name of the service you are connecting to. For Google Talk, this would be gmail.com.";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_SERVICE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_TEST_CONNECTION_ON_STARTUP_CONF = "camel.source.endpoint.testConnectionOnStartup";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DOC = "Specifies whether to test the connection on startup. This is used to ensure that the XMPP client has a valid connection to the XMPP server when the route starts. Camel throws an exception on startup if a connection cannot be established. When this option is set to false, Camel will attempt to establish a lazy connection when needed by a producer, and will poll for a consumer connection until the connection is established. Default is true.";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DEFAULT = true;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CREATE_ACCOUNT_CONF = "camel.source.endpoint.createAccount";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CREATE_ACCOUNT_DOC = "If true, an attempt to create an account will be made. Default is false.";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_CREATE_ACCOUNT_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_RESOURCE_CONF = "camel.source.endpoint.resource";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_RESOURCE_DOC = "XMPP resource. The default is Camel.";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_RESOURCE_DEFAULT = "Camel";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_POLL_DELAY_CONF = "camel.source.endpoint.connectionPollDelay";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_POLL_DELAY_DOC = "The amount of time in seconds between polls (in seconds) to verify the health of the XMPP connection, or between attempts to establish an initial consumer connection. Camel will try to re-establish a connection if it has become inactive. Default is 10 seconds.";
    public static final Integer CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_POLL_DELAY_DEFAULT = 10;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_DOC_CONF = "camel.source.endpoint.doc";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_DOC_DOC = "Set a doc header on the IN message containing a Document form of the incoming packet; default is true if presence or pubsub are true, otherwise false";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_DOC_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_CONFIG_CONF = "camel.source.endpoint.connectionConfig";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_CONFIG_DOC = "To use an existing connection configuration. Currently org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration is only supported (XMPP over TCP).";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_CONFIG_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_XMPP_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_PASSWORD_DOC = "Password for login";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_PASSWORD_CONF = "camel.source.endpoint.roomPassword";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_PASSWORD_DOC = "Password for room";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_USER_CONF = "camel.source.endpoint.user";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_USER_DOC = "User name (without server name). If not specified, anonymous login will be attempted.";
    public static final String CAMEL_SOURCE_XMPP_ENDPOINT_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_XMPP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.xmpp.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_XMPP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_XMPP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_XMPP_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.xmpp.basicPropertyBinding";
    public static final String CAMEL_SOURCE_XMPP_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_XMPP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelXmppSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelXmppSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_XMPP_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_XMPP_PATH_HOST_DOC);
        conf.define(CAMEL_SOURCE_XMPP_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_XMPP_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_XMPP_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_XMPP_PATH_PARTICIPANT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_PATH_PARTICIPANT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_PATH_PARTICIPANT_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_LOGIN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_LOGIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_LOGIN_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_NICKNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_NICKNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_NICKNAME_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_PUBSUB_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_PUBSUB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_PUBSUB_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_SERVICE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_SERVICE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_SERVICE_NAME_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_TEST_CONNECTION_ON_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_CREATE_ACCOUNT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_CREATE_ACCOUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_CREATE_ACCOUNT_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_POLL_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_POLL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_POLL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_DOC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_DOC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_DOC_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_CONNECTION_CONFIG_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_ROOM_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_XMPP_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_XMPP_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SOURCE_XMPP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_XMPP_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_XMPP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_XMPP_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}