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
package org.apache.camel.kafkaconnector.ahc;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAhcSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AHC_PATH_HTTP_URI_CONF = "camel.sink.path.httpUri";
    public static final String CAMEL_SINK_AHC_PATH_HTTP_URI_DOC = "The URI to use such as http://hostname:port/path";
    public static final String CAMEL_SINK_AHC_PATH_HTTP_URI_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_BRIDGE_ENDPOINT_CONF = "camel.sink.endpoint.bridgeEndpoint";
    public static final String CAMEL_SINK_AHC_ENDPOINT_BRIDGE_ENDPOINT_DOC = "If the option is true, then the Exchange.HTTP_URI header is ignored, and use the endpoint's URI for request. You may also set the throwExceptionOnFailure to be false to let the AhcProducer send all the fault response back.";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_BRIDGE_ENDPOINT_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_ENDPOINT_BUFFER_SIZE_CONF = "camel.sink.endpoint.bufferSize";
    public static final String CAMEL_SINK_AHC_ENDPOINT_BUFFER_SIZE_DOC = "The initial in-memory buffer size used when transferring data between Camel and AHC Client.";
    public static final Integer CAMEL_SINK_AHC_ENDPOINT_BUFFER_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SINK_AHC_ENDPOINT_CONNECTION_CLOSE_CONF = "camel.sink.endpoint.connectionClose";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CONNECTION_CLOSE_DOC = "Define if the Connection Close header has to be added to HTTP Request. This parameter is false by default";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_CONNECTION_CLOSE_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_ENDPOINT_COOKIE_HANDLER_CONF = "camel.sink.endpoint.cookieHandler";
    public static final String CAMEL_SINK_AHC_ENDPOINT_COOKIE_HANDLER_DOC = "Configure a cookie handler to maintain a HTTP session";
    public static final String CAMEL_SINK_AHC_ENDPOINT_COOKIE_HANDLER_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_AHC_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_AHC_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AHC_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF = "camel.sink.endpoint.throwExceptionOnFailure";
    public static final String CAMEL_SINK_AHC_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC = "Option to disable throwing the AhcOperationFailedException in case of failed responses from the remote server. This allows you to get all responses regardless of the HTTP status code.";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT = true;
    public static final String CAMEL_SINK_AHC_ENDPOINT_TRANSFER_EXCEPTION_CONF = "camel.sink.endpoint.transferException";
    public static final String CAMEL_SINK_AHC_ENDPOINT_TRANSFER_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side, and if the caused Exception was send back serialized in the response as a application/x-java-serialized-object content type (for example using Jetty or Servlet Camel components). On the producer side the exception will be deserialized and thrown as is, instead of the AhcOperationFailedException. The caused exception is required to be serialized. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_AHC_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_ENDPOINT_BINDING_CONF = "camel.sink.endpoint.binding";
    public static final String CAMEL_SINK_AHC_ENDPOINT_BINDING_DOC = "To use a custom AhcBinding which allows to control how to bind between AHC and Camel.";
    public static final String CAMEL_SINK_AHC_ENDPOINT_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_CONF = "camel.sink.endpoint.clientConfig";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_DOC = "To configure the AsyncHttpClient to use a custom com.ning.http.client.AsyncHttpClientConfig instance.";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_OPTIONS_CONF = "camel.sink.endpoint.clientConfigOptions";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_OPTIONS_DOC = "To configure the AsyncHttpClientConfig using the key/values from the Map.";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AHC_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AHC_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_CONF = "camel.sink.endpoint.clientConfigRealmOptions";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DOC = "To configure the AsyncHttpClientConfig Realm using the key/values from the Map.";
    public static final String CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_AHC_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "Reference to a org.apache.camel.support.jsse.SSLContextParameters in the Registry. This reference overrides any configured SSLContextParameters at the component level. See Using the JSSE Configuration Utility. Note that configuring this option will override any SSL/TLS configuration options provided through the clientConfig option at the endpoint or component level.";
    public static final String CAMEL_SINK_AHC_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.ahc.lazyStartProducer";
    public static final String CAMEL_SINK_AHC_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AHC_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF = "camel.component.ahc.allowJavaSerializedObject";
    public static final String CAMEL_SINK_AHC_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC = "Whether to allow java serialization when a request uses context-type=application/x-java-serialized-object This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SINK_AHC_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.ahc.basicPropertyBinding";
    public static final String CAMEL_SINK_AHC_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AHC_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AHC_COMPONENT_BINDING_CONF = "camel.component.ahc.binding";
    public static final String CAMEL_SINK_AHC_COMPONENT_BINDING_DOC = "To use a custom AhcBinding which allows to control how to bind between AHC and Camel.";
    public static final String CAMEL_SINK_AHC_COMPONENT_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_COMPONENT_CLIENT_CONF = "camel.component.ahc.client";
    public static final String CAMEL_SINK_AHC_COMPONENT_CLIENT_DOC = "To use a custom AsyncHttpClient";
    public static final String CAMEL_SINK_AHC_COMPONENT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_COMPONENT_CLIENT_CONFIG_CONF = "camel.component.ahc.clientConfig";
    public static final String CAMEL_SINK_AHC_COMPONENT_CLIENT_CONFIG_DOC = "To configure the AsyncHttpClient to use a custom com.ning.http.client.AsyncHttpClientConfig instance.";
    public static final String CAMEL_SINK_AHC_COMPONENT_CLIENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.ahc.headerFilterStrategy";
    public static final String CAMEL_SINK_AHC_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_AHC_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.ahc.sslContextParameters";
    public static final String CAMEL_SINK_AHC_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "Reference to a org.apache.camel.support.jsse.SSLContextParameters in the Registry. Note that configuring this option will override any SSL/TLS configuration options provided through the clientConfig option at the endpoint or component level.";
    public static final String CAMEL_SINK_AHC_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AHC_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.ahc.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_AHC_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_AHC_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelAhcSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAhcSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AHC_PATH_HTTP_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_PATH_HTTP_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AHC_PATH_HTTP_URI_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_BRIDGE_ENDPOINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_BRIDGE_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_BRIDGE_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_AHC_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_CONNECTION_CLOSE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_CONNECTION_CLOSE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_CONNECTION_CLOSE_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_COOKIE_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_COOKIE_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_COOKIE_HANDLER_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_TRANSFER_EXCEPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_TRANSFER_EXCEPTION_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_BINDING_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_OPTIONS_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DOC);
        conf.define(CAMEL_SINK_AHC_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_COMPONENT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_BINDING_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_COMPONENT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_CLIENT_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_CLIENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_COMPONENT_CLIENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_CLIENT_CONFIG_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AHC_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AHC_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AHC_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AHC_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}