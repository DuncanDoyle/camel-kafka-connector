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

package org.apache.camel.kafkaconnector.hdfs.services;

import org.testcontainers.containers.Network;
import org.testcontainers.containers.wait.strategy.Wait;

public class NameNodeContainer extends HadoopBaseContainer<NameNodeContainer> {



    public NameNodeContainer(Network network) {
        this(network, "namenode");
    }

    public NameNodeContainer(Network network, String name) {
        super(network, name);

        withCommand("sh", "-c", "/hadoop/run-namenode.sh");
        withExposedPorts(HDFSPorts.NAME_NODE_HTTP_PORT, HDFSPorts.NAME_NODE_IPC_PORT);

        waitingFor(Wait.forHttp("/").forPort(HDFSPorts.NAME_NODE_HTTP_PORT));

        addFixedExposedPort(HDFSPorts.NAME_NODE_HTTP_PORT, HDFSPorts.NAME_NODE_HTTP_PORT);
        addFixedExposedPort(HDFSPorts.NAME_NODE_IPC_PORT, HDFSPorts.NAME_NODE_IPC_PORT);
    }

    public int getHttpPort() {
        return getMappedPort(HDFSPorts.NAME_NODE_HTTP_PORT);
    }

    public int getIpcPort() {
        return HDFSPorts.NAME_NODE_IPC_PORT;
    }
}
