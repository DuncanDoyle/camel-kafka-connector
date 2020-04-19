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
package org.apache.camel.kafkaconnector.cometd;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCometdSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_COMETD_PATH_HOST_CONF = "camel.source.path.host";
    public static final String CAMEL_SOURCE_COMETD_PATH_HOST_DOC = "Hostname";
    public static final String CAMEL_SOURCE_COMETD_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_COMETD_PATH_PORT_DOC = "Host port number";
    public static final Integer CAMEL_SOURCE_COMETD_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_PATH_CHANNEL_NAME_CONF = "camel.source.path.channelName";
    public static final String CAMEL_SOURCE_COMETD_PATH_CHANNEL_NAME_DOC = "The channelName represents a topic that can be subscribed to by the Camel endpoints.";
    public static final String CAMEL_SOURCE_COMETD_PATH_CHANNEL_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_ALLOWED_ORIGINS_CONF = "camel.source.endpoint.allowedOrigins";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_ALLOWED_ORIGINS_DOC = "The origins domain that support to cross, if the crosssOriginFilterOn is true";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_ALLOWED_ORIGINS_DEFAULT = "*";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BASE_RESOURCE_CONF = "camel.source.endpoint.baseResource";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BASE_RESOURCE_DOC = "The root directory for the web resources or classpath. Use the protocol file: or classpath: depending if you want that the component loads the resource from file system or classpath. Classpath is required for OSGI deployment where the resources are packaged in the jar";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BASE_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_CROSS_ORIGIN_FILTER_ON_CONF = "camel.source.endpoint.crossOriginFilterOn";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DOC = "If true, the server will support for cross-domain filtering";
    public static final Boolean CAMEL_SOURCE_COMETD_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_FILTER_PATH_CONF = "camel.source.endpoint.filterPath";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_FILTER_PATH_DOC = "The filterPath will be used by the CrossOriginFilter, if the crosssOriginFilterOn is true";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_FILTER_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_INTERVAL_CONF = "camel.source.endpoint.interval";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_INTERVAL_DOC = "The client side poll timeout in milliseconds. How long a client will wait between reconnects";
    public static final Integer CAMEL_SOURCE_COMETD_ENDPOINT_INTERVAL_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_JSON_COMMENTED_CONF = "camel.source.endpoint.jsonCommented";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_JSON_COMMENTED_DOC = "If true, the server will accept JSON wrapped in a comment and will generate JSON wrapped in a comment. This is a defence against Ajax Hijacking.";
    public static final Boolean CAMEL_SOURCE_COMETD_ENDPOINT_JSON_COMMENTED_DEFAULT = true;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_LOG_LEVEL_CONF = "camel.source.endpoint.logLevel";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_LOG_LEVEL_DOC = "Logging level. 0=none, 1=info, 2=debug. One of: [0] [1] [2]";
    public static final Integer CAMEL_SOURCE_COMETD_ENDPOINT_LOG_LEVEL_DEFAULT = 1;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_MAX_INTERVAL_CONF = "camel.source.endpoint.maxInterval";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_MAX_INTERVAL_DOC = "The max client side poll timeout in milliseconds. A client will be removed if a connection is not received in this time.";
    public static final Integer CAMEL_SOURCE_COMETD_ENDPOINT_MAX_INTERVAL_DEFAULT = 30000;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_MULTI_FRAME_INTERVAL_CONF = "camel.source.endpoint.multiFrameInterval";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_MULTI_FRAME_INTERVAL_DOC = "The client side poll timeout, if multiple connections are detected from the same browser.";
    public static final Integer CAMEL_SOURCE_COMETD_ENDPOINT_MULTI_FRAME_INTERVAL_DEFAULT = 1500;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_TIMEOUT_CONF = "camel.source.endpoint.timeout";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_TIMEOUT_DOC = "The server side poll timeout in milliseconds. This is how long the server will hold a reconnect request before responding.";
    public static final Integer CAMEL_SOURCE_COMETD_ENDPOINT_TIMEOUT_DEFAULT = 240000;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_COMETD_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_SESSION_HEADERS_ENABLED_CONF = "camel.source.endpoint.sessionHeadersEnabled";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_SESSION_HEADERS_ENABLED_DOC = "Whether to include the server session headers in the Camel message when creating a Camel Message for incoming requests.";
    public static final Boolean CAMEL_SOURCE_COMETD_ENDPOINT_SESSION_HEADERS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_COMETD_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_COMETD_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_COMETD_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_EXTENSIONS_CONF = "camel.component.cometd.extensions";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_EXTENSIONS_DOC = "To use a list of custom BayeuxServer.Extension that allows modifying incoming and outgoing requests.";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_EXTENSIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.cometd.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_COMETD_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.cometd.basicPropertyBinding";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_COMETD_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SECURITY_POLICY_CONF = "camel.component.cometd.securityPolicy";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SECURITY_POLICY_DOC = "To use a custom configured SecurityPolicy to control authorization";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SECURITY_POLICY_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.cometd.sslContextParameters";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEY_PASSWORD_CONF = "camel.component.cometd.sslKeyPassword";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEY_PASSWORD_DOC = "The password for the keystore when using SSL.";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEYSTORE_CONF = "camel.component.cometd.sslKeystore";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEYSTORE_DOC = "The path to the keystore.";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEYSTORE_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_PASSWORD_CONF = "camel.component.cometd.sslPassword";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_PASSWORD_DOC = "The password when using SSL.";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_SSL_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.cometd.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_COMETD_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_COMETD_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelCometdSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCometdSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_COMETD_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_COMETD_PATH_HOST_DOC);
        conf.define(CAMEL_SOURCE_COMETD_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_COMETD_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_COMETD_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_COMETD_PATH_CHANNEL_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_PATH_CHANNEL_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_COMETD_PATH_CHANNEL_NAME_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_ALLOWED_ORIGINS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_ENDPOINT_ALLOWED_ORIGINS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_ALLOWED_ORIGINS_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_BASE_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_ENDPOINT_BASE_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_BASE_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_CROSS_ORIGIN_FILTER_ON_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_FILTER_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_ENDPOINT_FILTER_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_FILTER_PATH_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_COMETD_ENDPOINT_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_JSON_COMMENTED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_ENDPOINT_JSON_COMMENTED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_JSON_COMMENTED_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_LOG_LEVEL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_COMETD_ENDPOINT_LOG_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_LOG_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_MAX_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_COMETD_ENDPOINT_MAX_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_MAX_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_MULTI_FRAME_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_COMETD_ENDPOINT_MULTI_FRAME_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_MULTI_FRAME_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_COMETD_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_SESSION_HEADERS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_ENDPOINT_SESSION_HEADERS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_SESSION_HEADERS_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_COMETD_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_EXTENSIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_COMPONENT_EXTENSIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_EXTENSIONS_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_SECURITY_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_COMPONENT_SECURITY_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_SECURITY_POLICY_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEYSTORE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEYSTORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_SSL_KEYSTORE_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_SSL_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COMETD_COMPONENT_SSL_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_SSL_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_COMETD_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COMETD_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COMETD_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}