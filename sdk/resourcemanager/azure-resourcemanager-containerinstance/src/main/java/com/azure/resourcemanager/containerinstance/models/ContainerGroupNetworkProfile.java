// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerGroupNetworkProfile model. */
@Fluent
public final class ContainerGroupNetworkProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerGroupNetworkProfile.class);

    /*
     * The identifier for a network profile.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The identifier for a network profile.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The identifier for a network profile.
     *
     * @param id the id value to set.
     * @return the ContainerGroupNetworkProfile object itself.
     */
    public ContainerGroupNetworkProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model ContainerGroupNetworkProfile"));
        }
    }
}