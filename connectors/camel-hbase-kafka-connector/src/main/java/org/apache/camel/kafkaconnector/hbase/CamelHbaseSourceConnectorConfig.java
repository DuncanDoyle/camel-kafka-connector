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
package org.apache.camel.kafkaconnector.hbase;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelHbaseSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_HBASE_PATH_TABLE_NAME_CONF = "camel.source.path.tableName";
    public static final String CAMEL_SOURCE_HBASE_PATH_TABLE_NAME_DOC = "The name of the table";
    public static final String CAMEL_SOURCE_HBASE_PATH_TABLE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_CONF = "camel.source.endpoint.cellMappingStrategyFactory";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DOC = "To use a custom CellMappingStrategyFactory that is responsible for mapping cells.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_FILTERS_CONF = "camel.source.endpoint.filters";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_FILTERS_DOC = "A list of filters to use.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_FILTERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_CONF = "camel.source.endpoint.mappingStrategyClassName";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DOC = "The class name of a custom mapping strategy implementation.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_CONF = "camel.source.endpoint.mappingStrategyName";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DOC = "The strategy to use for mapping Camel messages to HBase columns. Supported values: header, or body. One of: [header] [body]";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MAPPING_CONF = "camel.source.endpoint.rowMapping";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MAPPING_DOC = "To map the key/values from the Map to a HBaseRow. The following keys is supported: rowId - The id of the row. This has limited use as the row usually changes per Exchange. rowType - The type to covert row id to. Supported operations: CamelHBaseScan. family - The column family. Supports a number suffix for referring to more than one columns. qualifier - The column qualifier. Supports a number suffix for referring to more than one columns. value - The value. Supports a number suffix for referring to more than one columns valueType - The value type. Supports a number suffix for referring to more than one columns. Supported operations: CamelHBaseGet, and CamelHBaseScan.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MAPPING_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MODEL_CONF = "camel.source.endpoint.rowModel";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MODEL_DOC = "An instance of org.apache.camel.component.hbase.model.HBaseRow which describes how each row should be modeled";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MODEL_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_USER_GROUP_INFORMATION_CONF = "camel.source.endpoint.userGroupInformation";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DOC = "Defines privileges to communicate with HBase such as using kerberos.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_HBASE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF = "camel.source.endpoint.maxMessagesPerPoll";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC = "Gets the maximum number of messages as a limit to poll at each polling. Is default unlimited, but use 0 or negative number to disable it as unlimited.";
    public static final Integer CAMEL_SOURCE_HBASE_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_OPERATION_CONF = "camel.source.endpoint.operation";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_OPERATION_DOC = "The HBase operation to perform One of: [CamelHBasePut] [CamelHBaseGet] [CamelHBaseScan] [CamelHBaseDelete]";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_CONF = "camel.source.endpoint.remove";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_DOC = "If the option is true, Camel HBase Consumer will remove the rows which it processes.";
    public static final Boolean CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_DEFAULT = true;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_HANDLER_CONF = "camel.source.endpoint.removeHandler";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_HANDLER_DOC = "To use a custom HBaseRemoveHandler that is executed when a row is to be removed.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_HBASE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_HBASE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_POOL_MAX_SIZE_CONF = "camel.component.hbase.poolMaxSize";
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_POOL_MAX_SIZE_DOC = "Maximum number of references to keep for each table in the HTable pool. The default value is 10.";
    public static final Integer CAMEL_SOURCE_HBASE_COMPONENT_POOL_MAX_SIZE_DEFAULT = 10;
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.hbase.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_HBASE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.hbase.basicPropertyBinding";
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_CONFIGURATION_CONF = "camel.component.hbase.configuration";
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SOURCE_HBASE_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelHbaseSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelHbaseSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_HBASE_PATH_TABLE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_PATH_TABLE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_HBASE_PATH_TABLE_NAME_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_FILTERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_FILTERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_FILTERS_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MAPPING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MAPPING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MAPPING_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MODEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MODEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_ROW_MODEL_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_USER_GROUP_INFORMATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HBASE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HBASE_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_REMOVE_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_HBASE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HBASE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_HBASE_COMPONENT_POOL_MAX_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_HBASE_COMPONENT_POOL_MAX_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_COMPONENT_POOL_MAX_SIZE_DOC);
        conf.define(CAMEL_SOURCE_HBASE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HBASE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_HBASE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_HBASE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_HBASE_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}