// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The blob service properties for change feed events. */
@Fluent
public final class ChangeFeed {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ChangeFeed.class);

    /*
     * Indicates whether change feed event logging is enabled for the Blob
     * service.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Indicates the duration of changeFeed retention in days. Minimum value is
     * 1 day and maximum value is 146000 days (400 years). A null value
     * indicates an infinite retention of the change feed.
     */
    @JsonProperty(value = "retentionInDays")
    private Integer retentionInDays;

    /**
     * Get the enabled property: Indicates whether change feed event logging is enabled for the Blob service.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether change feed event logging is enabled for the Blob service.
     *
     * @param enabled the enabled value to set.
     * @return the ChangeFeed object itself.
     */
    public ChangeFeed withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionInDays property: Indicates the duration of changeFeed retention in days. Minimum value is 1 day
     * and maximum value is 146000 days (400 years). A null value indicates an infinite retention of the change feed.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays property: Indicates the duration of changeFeed retention in days. Minimum value is 1 day
     * and maximum value is 146000 days (400 years). A null value indicates an infinite retention of the change feed.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the ChangeFeed object itself.
     */
    public ChangeFeed withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
