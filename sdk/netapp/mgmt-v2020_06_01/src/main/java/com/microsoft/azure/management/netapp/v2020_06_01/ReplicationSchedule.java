/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ReplicationSchedule.
 */
public final class ReplicationSchedule extends ExpandableStringEnum<ReplicationSchedule> {
    /** Static value _10minutely for ReplicationSchedule. */
    public static final ReplicationSchedule _10MINUTELY = fromString("_10minutely");

    /** Static value hourly for ReplicationSchedule. */
    public static final ReplicationSchedule HOURLY = fromString("hourly");

    /** Static value daily for ReplicationSchedule. */
    public static final ReplicationSchedule DAILY = fromString("daily");

    /** Static value weekly for ReplicationSchedule. */
    public static final ReplicationSchedule WEEKLY = fromString("weekly");

    /** Static value monthly for ReplicationSchedule. */
    public static final ReplicationSchedule MONTHLY = fromString("monthly");

    /**
     * Creates or finds a ReplicationSchedule from its string representation.
     * @param name a name to look for
     * @return the corresponding ReplicationSchedule
     */
    @JsonCreator
    public static ReplicationSchedule fromString(String name) {
        return fromString(name, ReplicationSchedule.class);
    }

    /**
     * @return known ReplicationSchedule values
     */
    public static Collection<ReplicationSchedule> values() {
        return values(ReplicationSchedule.class);
    }
}
