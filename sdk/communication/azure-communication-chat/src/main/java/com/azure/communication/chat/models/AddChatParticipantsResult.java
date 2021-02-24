// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result of the add chat participants operation. */
@Fluent
public final class AddChatParticipantsResult {
    /*
     * Errors encountered during the addition of the chat participant to the
     * chat thread.
     */
    @JsonProperty(value = "errors")
    private AddChatParticipantsErrors errors;

    /**
     * Get the errors property: Errors encountered during the addition of the chat participant to the chat thread.
     *
     * @return the errors value.
     */
    public AddChatParticipantsErrors getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Errors encountered during the addition of the chat participant to the chat thread.
     *
     * @param errors the errors value to set.
     * @return the AddChatParticipantsResult object itself.
     */
    public AddChatParticipantsResult setErrors(AddChatParticipantsErrors errors) {
        this.errors = errors;
        return this;
    }
}
