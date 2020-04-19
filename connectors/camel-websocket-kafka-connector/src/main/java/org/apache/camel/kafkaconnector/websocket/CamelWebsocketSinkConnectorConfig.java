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
package org.apache.camel.kafkaconnector.websocket;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWebsocketSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_WEBSOCKET_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_HOST_DOC = "The hostname. The default value is 0.0.0.0. Setting this option on the component will use the component configured value as default.";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_HOST_DEFAULT = "0.0.0.0";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_PORT_DOC = "The port number. The default value is 9292. Setting this option on the component will use the component configured value as default.";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_PORT_DEFAULT = "9292";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_RESOURCE_URI_CONF = "camel.sink.path.resourceUri";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_RESOURCE_URI_DOC = "Name of the websocket channel to use";
    public static final String CAMEL_SINK_WEBSOCKET_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_BINARY_MESSAGE_SIZE_CONF = "camel.sink.endpoint.maxBinaryMessageSize";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_BINARY_MESSAGE_SIZE_DOC = "Can be used to set the size in bytes that the websocket created by the websocketServlet may be accept before closing. (Default is -1 - or unlimited)";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_BINARY_MESSAGE_SIZE_DEFAULT = "-1";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TIMEOUT_CONF = "camel.sink.endpoint.sendTimeout";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TIMEOUT_DOC = "Timeout in millis when sending to a websocket channel. The default timeout is 30000 (30 seconds).";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TIMEOUT_DEFAULT = "30000";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TO_ALL_CONF = "camel.sink.endpoint.sendToAll";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TO_ALL_DOC = "To send to all websocket subscribers. Can be used to configure on endpoint level, instead of having to use the WebsocketConstants.SEND_TO_ALL header on the message.";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TO_ALL_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_WEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_BUFFER_SIZE_CONF = "camel.sink.endpoint.bufferSize";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_BUFFER_SIZE_DOC = "Set the buffer size of the websocketServlet, which is also the max frame byte size (default 8192)";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_BUFFER_SIZE_DEFAULT = "8192";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_IDLE_TIME_CONF = "camel.sink.endpoint.maxIdleTime";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_IDLE_TIME_DOC = "Set the time in ms that the websocket created by the websocketServlet may be idle before closing. (default is 300000)";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_IDLE_TIME_DEFAULT = "300000";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_TEXT_MESSAGE_SIZE_CONF = "camel.sink.endpoint.maxTextMessageSize";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_TEXT_MESSAGE_SIZE_DOC = "Can be used to set the size in characters that the websocket created by the websocketServlet may be accept before closing.";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_TEXT_MESSAGE_SIZE_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MIN_VERSION_CONF = "camel.sink.endpoint.minVersion";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MIN_VERSION_DOC = "Can be used to set the minimum protocol version accepted for the websocketServlet. (Default 13 - the RFC6455 version)";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_MIN_VERSION_DEFAULT = "13";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_WEBSOCKET_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_ALLOWED_ORIGINS_CONF = "camel.sink.endpoint.allowedOrigins";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_ALLOWED_ORIGINS_DOC = "The CORS allowed origins. Use to allow all.";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_ALLOWED_ORIGINS_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_CROSS_ORIGIN_FILTER_ON_CONF = "camel.sink.endpoint.crossOriginFilterOn";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DOC = "Whether to enable CORS";
    public static final Boolean CAMEL_SINK_WEBSOCKET_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_FILTER_PATH_CONF = "camel.sink.endpoint.filterPath";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_FILTER_PATH_DOC = "Context path for filtering CORS";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_FILTER_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_ENABLE_JMX_CONF = "camel.sink.endpoint.enableJmx";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_ENABLE_JMX_DOC = "If this option is true, Jetty JMX support will be enabled for this endpoint. See Jetty JMX support for more details.";
    public static final Boolean CAMEL_SINK_WEBSOCKET_ENDPOINT_ENABLE_JMX_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SINK_WEBSOCKET_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_HOST_CONF = "camel.component.websocket.host";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_HOST_DOC = "The hostname. The default value is 0.0.0.0";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_HOST_DEFAULT = "0.0.0.0";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_PORT_CONF = "camel.component.websocket.port";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_PORT_DOC = "The port number. The default value is 9292";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_PORT_DEFAULT = "9292";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SOCKET_FACTORY_CONF = "camel.component.websocket.socketFactory";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SOCKET_FACTORY_DOC = "To configure a map which contains custom WebSocketFactory for sub protocols. The key in the map is the sub protocol. The default key is reserved for the default implementation.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SOCKET_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.websocket.lazyStartProducer";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.websocket.basicPropertyBinding";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_WEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_ENABLE_JMX_CONF = "camel.component.websocket.enableJmx";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_ENABLE_JMX_DOC = "If this option is true, Jetty JMX support will be enabled for this endpoint. See Jetty JMX support for more details.";
    public static final Boolean CAMEL_SINK_WEBSOCKET_COMPONENT_ENABLE_JMX_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_MAX_THREADS_CONF = "camel.component.websocket.maxThreads";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_MAX_THREADS_DOC = "To set a value for maximum number of threads in server thread pool. MaxThreads/minThreads or threadPool fields are required due to switch to Jetty9. The default values for maxThreads is 1 2 noCores.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_MAX_THREADS_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_MIN_THREADS_CONF = "camel.component.websocket.minThreads";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_MIN_THREADS_DOC = "To set a value for minimum number of threads in server thread pool. MaxThreads/minThreads or threadPool fields are required due to switch to Jetty9. The default values for minThreads is 1.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_MIN_THREADS_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_THREAD_POOL_CONF = "camel.component.websocket.threadPool";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_THREAD_POOL_DOC = "To use a custom thread pool for the server. MaxThreads/minThreads or threadPool fields are required due to switch to Jetty9.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_THREAD_POOL_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.websocket.sslContextParameters";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEY_PASSWORD_CONF = "camel.component.websocket.sslKeyPassword";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEY_PASSWORD_DOC = "The password for the keystore when using SSL.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEYSTORE_CONF = "camel.component.websocket.sslKeystore";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEYSTORE_DOC = "The path to the keystore.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEYSTORE_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_PASSWORD_CONF = "camel.component.websocket.sslPassword";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_PASSWORD_DOC = "The password when using SSL.";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.websocket.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_WEBSOCKET_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_WEBSOCKET_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelWebsocketSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWebsocketSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_WEBSOCKET_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_PATH_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_PATH_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WEBSOCKET_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_BINARY_MESSAGE_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_BINARY_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_BINARY_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TO_ALL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TO_ALL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_SEND_TO_ALL_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_IDLE_TIME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_IDLE_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_IDLE_TIME_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_TEXT_MESSAGE_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_TEXT_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_MAX_TEXT_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_MIN_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_MIN_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_MIN_VERSION_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_ALLOWED_ORIGINS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_ALLOWED_ORIGINS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_ALLOWED_ORIGINS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_CROSS_ORIGIN_FILTER_ON_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_CROSS_ORIGIN_FILTER_ON_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_FILTER_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_FILTER_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_FILTER_PATH_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_ENABLE_JMX_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_ENDPOINT_ENABLE_JMX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_ENABLE_JMX_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_PORT_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_SOCKET_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_SOCKET_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_SOCKET_FACTORY_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_ENABLE_JMX_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_COMPONENT_ENABLE_JMX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_ENABLE_JMX_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_MAX_THREADS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_MAX_THREADS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_MAX_THREADS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_MIN_THREADS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_MIN_THREADS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_MIN_THREADS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_THREAD_POOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_THREAD_POOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_THREAD_POOL_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEYSTORE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEYSTORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_KEYSTORE_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_SSL_PASSWORD_DOC);
        conf.define(CAMEL_SINK_WEBSOCKET_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKET_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKET_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}