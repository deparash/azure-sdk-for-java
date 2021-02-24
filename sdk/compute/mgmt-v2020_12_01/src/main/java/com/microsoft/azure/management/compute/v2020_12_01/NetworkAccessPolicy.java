/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkAccessPolicy.
 */
public final class NetworkAccessPolicy extends ExpandableStringEnum<NetworkAccessPolicy> {
    /** Static value AllowAll for NetworkAccessPolicy. */
    public static final NetworkAccessPolicy ALLOW_ALL = fromString("AllowAll");

    /** Static value AllowPrivate for NetworkAccessPolicy. */
    public static final NetworkAccessPolicy ALLOW_PRIVATE = fromString("AllowPrivate");

    /** Static value DenyAll for NetworkAccessPolicy. */
    public static final NetworkAccessPolicy DENY_ALL = fromString("DenyAll");

    /**
     * Creates or finds a NetworkAccessPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkAccessPolicy
     */
    @JsonCreator
    public static NetworkAccessPolicy fromString(String name) {
        return fromString(name, NetworkAccessPolicy.class);
    }

    /**
     * @return known NetworkAccessPolicy values
     */
    public static Collection<NetworkAccessPolicy> values() {
        return values(NetworkAccessPolicy.class);
    }
}
