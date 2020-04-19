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
package org.apache.camel.kafkaconnector.couchdb;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCouchdbSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_COUCHDB_PATH_PROTOCOL_CONF = "camel.sink.path.protocol";
    public static final String CAMEL_SINK_COUCHDB_PATH_PROTOCOL_DOC = "The protocol to use for communicating with the database. One of: [http] [https]";
    public static final String CAMEL_SINK_COUCHDB_PATH_PROTOCOL_DEFAULT = null;
    public static final String CAMEL_SINK_COUCHDB_PATH_HOSTNAME_CONF = "camel.sink.path.hostname";
    public static final String CAMEL_SINK_COUCHDB_PATH_HOSTNAME_DOC = "Hostname of the running couchdb instance";
    public static final String CAMEL_SINK_COUCHDB_PATH_HOSTNAME_DEFAULT = null;
    public static final String CAMEL_SINK_COUCHDB_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_COUCHDB_PATH_PORT_DOC = "Port number for the running couchdb instance";
    public static final Integer CAMEL_SINK_COUCHDB_PATH_PORT_DEFAULT = 5984;
    public static final String CAMEL_SINK_COUCHDB_PATH_DATABASE_CONF = "camel.sink.path.database";
    public static final String CAMEL_SINK_COUCHDB_PATH_DATABASE_DOC = "Name of the database to use";
    public static final String CAMEL_SINK_COUCHDB_PATH_DATABASE_DEFAULT = null;
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_CREATE_DATABASE_CONF = "camel.sink.endpoint.createDatabase";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_CREATE_DATABASE_DOC = "Creates the database if it does not already exist";
    public static final Boolean CAMEL_SINK_COUCHDB_ENDPOINT_CREATE_DATABASE_DEFAULT = false;
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_COUCHDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_COUCHDB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_COUCHDB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_PASSWORD_DOC = "Password for authenticated databases";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_USERNAME_DOC = "Username in case of authenticated databases";
    public static final String CAMEL_SINK_COUCHDB_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_COUCHDB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.couchdb.lazyStartProducer";
    public static final String CAMEL_SINK_COUCHDB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_COUCHDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_COUCHDB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.couchdb.basicPropertyBinding";
    public static final String CAMEL_SINK_COUCHDB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_COUCHDB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelCouchdbSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCouchdbSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_COUCHDB_PATH_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COUCHDB_PATH_PROTOCOL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_COUCHDB_PATH_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_COUCHDB_PATH_HOSTNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COUCHDB_PATH_HOSTNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_COUCHDB_PATH_HOSTNAME_DOC);
        conf.define(CAMEL_SINK_COUCHDB_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_COUCHDB_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_COUCHDB_PATH_DATABASE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COUCHDB_PATH_DATABASE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_COUCHDB_PATH_DATABASE_DOC);
        conf.define(CAMEL_SINK_COUCHDB_ENDPOINT_CREATE_DATABASE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COUCHDB_ENDPOINT_CREATE_DATABASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_ENDPOINT_CREATE_DATABASE_DOC);
        conf.define(CAMEL_SINK_COUCHDB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COUCHDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_COUCHDB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COUCHDB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_COUCHDB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COUCHDB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_COUCHDB_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COUCHDB_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_COUCHDB_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COUCHDB_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_COUCHDB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COUCHDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_COUCHDB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COUCHDB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COUCHDB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}