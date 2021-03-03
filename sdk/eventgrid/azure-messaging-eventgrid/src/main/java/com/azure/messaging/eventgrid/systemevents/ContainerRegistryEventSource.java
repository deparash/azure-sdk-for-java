// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The registry node that generated the event. Put differently, while the actor initiates the event, the source
 * generates it.
 */
@Fluent
public final class ContainerRegistryEventSource {
    /*
     * The IP or hostname and the port of the registry node that generated the
     * event. Generally, this will be resolved by os.Hostname() along with the
     * running port.
     */
    @JsonProperty(value = "addr")
    private String addr;

    /*
     * The running instance of an application. Changes after each restart.
     */
    @JsonProperty(value = "instanceID")
    private String instanceID;

    /**
     * Get the addr property: The IP or hostname and the port of the registry node that generated the event. Generally,
     * this will be resolved by os.Hostname() along with the running port.
     *
     * @return the addr value.
     */
    public String getAddr() {
        return this.addr;
    }

    /**
     * Set the addr property: The IP or hostname and the port of the registry node that generated the event. Generally,
     * this will be resolved by os.Hostname() along with the running port.
     *
     * @param addr the addr value to set.
     * @return the ContainerRegistryEventSource object itself.
     */
    public ContainerRegistryEventSource setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * Get the instanceID property: The running instance of an application. Changes after each restart.
     *
     * @return the instanceID value.
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * Set the instanceID property: The running instance of an application. Changes after each restart.
     *
     * @param instanceID the instanceID value to set.
     * @return the ContainerRegistryEventSource object itself.
     */
    public ContainerRegistryEventSource setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
}
