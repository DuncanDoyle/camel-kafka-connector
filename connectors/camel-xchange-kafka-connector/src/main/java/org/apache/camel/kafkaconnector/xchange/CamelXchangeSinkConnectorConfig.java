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
package org.apache.camel.kafkaconnector.xchange;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelXchangeSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_XCHANGE_PATH_NAME_CONF = "camel.sink.path.name";
    public static final String CAMEL_SINK_XCHANGE_PATH_NAME_DOC = "The exchange to connect to";
    public static final String CAMEL_SINK_XCHANGE_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_CONF = "camel.sink.endpoint.currency";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_DOC = "The currency";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_DEFAULT = null;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_PAIR_CONF = "camel.sink.endpoint.currencyPair";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_PAIR_DOC = "The currency pair";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_PAIR_DEFAULT = null;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XCHANGE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_METHOD_CONF = "camel.sink.endpoint.method";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_METHOD_DOC = "The method to execute One of: [balances] [fundingHistory] [wallets] [currencies] [currencyMetaData] [currencyPairs] [currencyPairMetaData] [ticker]";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_METHOD_DEFAULT = null;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_SERVICE_CONF = "camel.sink.endpoint.service";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_SERVICE_DOC = "The service to call One of: [marketdata] [metadata] [account]";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_SERVICE_DEFAULT = null;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XCHANGE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_XCHANGE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_XCHANGE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_XCHANGE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.xchange.lazyStartProducer";
    public static final String CAMEL_SINK_XCHANGE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XCHANGE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XCHANGE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.xchange.basicPropertyBinding";
    public static final String CAMEL_SINK_XCHANGE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XCHANGE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelXchangeSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelXchangeSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_XCHANGE_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XCHANGE_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_XCHANGE_PATH_NAME_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_PAIR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_PAIR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XCHANGE_ENDPOINT_CURRENCY_PAIR_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XCHANGE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XCHANGE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_METHOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XCHANGE_ENDPOINT_METHOD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_XCHANGE_ENDPOINT_METHOD_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XCHANGE_ENDPOINT_SERVICE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_XCHANGE_ENDPOINT_SERVICE_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XCHANGE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XCHANGE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XCHANGE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XCHANGE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XCHANGE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_XCHANGE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XCHANGE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XCHANGE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XCHANGE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XCHANGE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_XCHANGE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}