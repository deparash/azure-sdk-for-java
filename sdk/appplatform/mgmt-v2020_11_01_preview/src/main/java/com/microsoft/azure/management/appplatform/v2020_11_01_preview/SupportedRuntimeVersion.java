/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Supported deployment runtime version descriptor.
 */
public class SupportedRuntimeVersion {
    /**
     * The raw value which could be passed to deployment CRUD operations.
     * Possible values include: 'Java_8', 'Java_11', 'NetCore_31'.
     */
    @JsonProperty(value = "value")
    private SupportedRuntimeValue value;

    /**
     * The platform of this runtime version (possible values: "Java" or
     * ".NET"). Possible values include: 'Java', '.NET Core'.
     */
    @JsonProperty(value = "platform")
    private SupportedRuntimePlatform platform;

    /**
     * The detailed version (major.minor) of the platform.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the raw value which could be passed to deployment CRUD operations. Possible values include: 'Java_8', 'Java_11', 'NetCore_31'.
     *
     * @return the value value
     */
    public SupportedRuntimeValue value() {
        return this.value;
    }

    /**
     * Set the raw value which could be passed to deployment CRUD operations. Possible values include: 'Java_8', 'Java_11', 'NetCore_31'.
     *
     * @param value the value value to set
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withValue(SupportedRuntimeValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get the platform of this runtime version (possible values: "Java" or ".NET"). Possible values include: 'Java', '.NET Core'.
     *
     * @return the platform value
     */
    public SupportedRuntimePlatform platform() {
        return this.platform;
    }

    /**
     * Set the platform of this runtime version (possible values: "Java" or ".NET"). Possible values include: 'Java', '.NET Core'.
     *
     * @param platform the platform value to set
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withPlatform(SupportedRuntimePlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the detailed version (major.minor) of the platform.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the detailed version (major.minor) of the platform.
     *
     * @param version the version value to set
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withVersion(String version) {
        this.version = version;
        return this;
    }

}
