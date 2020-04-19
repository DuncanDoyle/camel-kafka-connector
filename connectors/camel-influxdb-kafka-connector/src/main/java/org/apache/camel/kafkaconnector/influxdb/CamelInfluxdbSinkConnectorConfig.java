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
package org.apache.camel.kafkaconnector.influxdb;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelInfluxdbSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_INFLUXDB_PATH_CONNECTION_BEAN_CONF = "camel.sink.path.connectionBean";
    public static final String CAMEL_SINK_INFLUXDB_PATH_CONNECTION_BEAN_DOC = "Connection to the influx database, of class InfluxDB.class";
    public static final String CAMEL_SINK_INFLUXDB_PATH_CONNECTION_BEAN_DEFAULT = null;
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_BATCH_CONF = "camel.sink.endpoint.batch";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_BATCH_DOC = "Define if this operation is a batch operation or not";
    public static final Boolean CAMEL_SINK_INFLUXDB_ENDPOINT_BATCH_DEFAULT = false;
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_DATABASE_NAME_CONF = "camel.sink.endpoint.databaseName";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_DATABASE_NAME_DOC = "The name of the database where the time series will be stored";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_DATABASE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_INFLUXDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_OPERATION_DOC = "Define if this operation is an insert or a query";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_OPERATION_DEFAULT = "insert";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_QUERY_CONF = "camel.sink.endpoint.query";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_QUERY_DOC = "Define the query in case of operation query";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_QUERY_DEFAULT = null;
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_RETENTION_POLICY_CONF = "camel.sink.endpoint.retentionPolicy";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_RETENTION_POLICY_DOC = "The string that defines the retention policy to the data created by the endpoint";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_RETENTION_POLICY_DEFAULT = "default";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_INFLUXDB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_INFLUXDB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_INFLUXDB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_INFLUXDB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.influxdb.lazyStartProducer";
    public static final String CAMEL_SINK_INFLUXDB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_INFLUXDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_INFLUXDB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.influxdb.basicPropertyBinding";
    public static final String CAMEL_SINK_INFLUXDB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_INFLUXDB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelInfluxdbSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelInfluxdbSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_INFLUXDB_PATH_CONNECTION_BEAN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFLUXDB_PATH_CONNECTION_BEAN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_INFLUXDB_PATH_CONNECTION_BEAN_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_BATCH_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFLUXDB_ENDPOINT_BATCH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_BATCH_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_DATABASE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFLUXDB_ENDPOINT_DATABASE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_DATABASE_NAME_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFLUXDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFLUXDB_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFLUXDB_ENDPOINT_QUERY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_QUERY_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_RETENTION_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFLUXDB_ENDPOINT_RETENTION_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_RETENTION_POLICY_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFLUXDB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFLUXDB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFLUXDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_INFLUXDB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFLUXDB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFLUXDB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}