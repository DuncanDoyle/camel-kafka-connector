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
package org.apache.camel.kafkaconnector.hazelcastreplicatedmap;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelHazelcastreplicatedmapSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_PATH_CACHE_NAME_CONF = "camel.sink.path.cacheName";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_PATH_CACHE_NAME_DOC = "The name of the cache";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_PATH_CACHE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_DEFAULT_OPERATION_CONF = "camel.sink.endpoint.defaultOperation";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_DEFAULT_OPERATION_DOC = "To specify a default operation to use, if no operation header has been provided. One of: [put] [delete] [get] [update] [query] [getAll] [clear] [putIfAbsent] [allAll] [removeAll] [retainAll] [evict] [evictAll] [valueCount] [containsKey] [containsValue] [keySet] [removevalue] [increment] [decrement] [setvalue] [destroy] [compareAndSet] [getAndAdd] [add] [offer] [peek] [poll] [remainingCapacity] [drainTo] [removeIf] [take] [publish] [readOnceHeal] [readOnceTail] [capacity]";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_DEFAULT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_CONF = "camel.sink.endpoint.hazelcastInstance";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_DOC = "The hazelcast instance reference which can be used for hazelcast endpoint.";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_DEFAULT = null;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_NAME_CONF = "camel.sink.endpoint.hazelcastInstanceName";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_NAME_DOC = "The hazelcast instance reference name which can be used for hazelcast endpoint. If you don't specify the instance reference, camel use the default hazelcast instance from the camel-hazelcast instance.";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.hazelcast-replicatedmap.lazyStartProducer";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.hazelcast-replicatedmap.basicPropertyBinding";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_INSTANCE_CONF = "camel.component.hazelcast-replicatedmap.hazelcastInstance";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_INSTANCE_DOC = "The hazelcast instance reference which can be used for hazelcast endpoint. If you don't specify the instance reference, camel use the default hazelcast instance from the camel-hazelcast instance.";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_INSTANCE_DEFAULT = null;
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_MODE_CONF = "camel.component.hazelcast-replicatedmap.hazelcastMode";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_MODE_DOC = "The hazelcast mode reference which kind of instance should be used. If you don't specify the mode, then the node mode will be the default.";
    public static final String CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_MODE_DEFAULT = "node";

    public CamelHazelcastreplicatedmapSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelHazelcastreplicatedmapSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_PATH_CACHE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HAZELCASTREPLICATEDMAP_PATH_CACHE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_HAZELCASTREPLICATEDMAP_PATH_CACHE_NAME_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_DEFAULT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_DEFAULT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_DEFAULT_OPERATION_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_HAZELCAST_INSTANCE_NAME_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_INSTANCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_INSTANCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_INSTANCE_DOC);
        conf.define(CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HAZELCASTREPLICATEDMAP_COMPONENT_HAZELCAST_MODE_DOC);
        return conf;
    }
}