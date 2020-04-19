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
package org.apache.camel.kafkaconnector.reactivestreams;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelReactivestreamsSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_REACTIVESTREAMS_PATH_STREAM_CONF = "camel.sink.path.stream";
    public static final String CAMEL_SINK_REACTIVESTREAMS_PATH_STREAM_DOC = "Name of the stream channel used by the endpoint to exchange messages.";
    public static final String CAMEL_SINK_REACTIVESTREAMS_PATH_STREAM_DEFAULT = null;
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BACKPRESSURE_STRATEGY_CONF = "camel.sink.endpoint.backpressureStrategy";
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BACKPRESSURE_STRATEGY_DOC = "The backpressure strategy to use when pushing events to a slow subscriber. One of: [BUFFER] [OLDEST] [LATEST]";
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BACKPRESSURE_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BACKPRESSURE_STRATEGY_CONF = "camel.component.reactive-streams.backpressureStrategy";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BACKPRESSURE_STRATEGY_DOC = "The backpressure strategy to use when pushing events to a slow subscriber. One of: [BUFFER] [OLDEST] [LATEST]";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BACKPRESSURE_STRATEGY_DEFAULT = "BUFFER";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.reactive-streams.lazyStartProducer";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_REACTIVESTREAMS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.reactive-streams.basicPropertyBinding";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_INTERNAL_ENGINE_CONFIGURATION_CONF = "camel.component.reactive-streams.internalEngineConfiguration";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_INTERNAL_ENGINE_CONFIGURATION_DOC = "Configures the internal engine for Reactive Streams.";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_INTERNAL_ENGINE_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_CONF = "camel.component.reactive-streams.serviceType";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DOC = "Set the type of the underlying reactive streams implementation to use. The implementation is looked up from the registry or using a ServiceLoader, the default implementation is DefaultCamelReactiveStreamsService";
    public static final String CAMEL_SINK_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DEFAULT = null;

    public CamelReactivestreamsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelReactivestreamsSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_REACTIVESTREAMS_PATH_STREAM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REACTIVESTREAMS_PATH_STREAM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_PATH_STREAM_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BACKPRESSURE_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BACKPRESSURE_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BACKPRESSURE_STRATEGY_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BACKPRESSURE_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BACKPRESSURE_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BACKPRESSURE_STRATEGY_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_COMPONENT_INTERNAL_ENGINE_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_INTERNAL_ENGINE_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_INTERNAL_ENGINE_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DOC);
        return conf;
    }
}