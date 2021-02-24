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
 * Defines values for VMGuestPatchClassificationWindows.
 */
public final class VMGuestPatchClassificationWindows extends ExpandableStringEnum<VMGuestPatchClassificationWindows> {
    /** Static value Critical for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows CRITICAL = fromString("Critical");

    /** Static value Security for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows SECURITY = fromString("Security");

    /** Static value UpdateRollUp for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows UPDATE_ROLL_UP = fromString("UpdateRollUp");

    /** Static value FeaturePack for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows FEATURE_PACK = fromString("FeaturePack");

    /** Static value ServicePack for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows SERVICE_PACK = fromString("ServicePack");

    /** Static value Definition for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows DEFINITION = fromString("Definition");

    /** Static value Tools for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows TOOLS = fromString("Tools");

    /** Static value Updates for VMGuestPatchClassificationWindows. */
    public static final VMGuestPatchClassificationWindows UPDATES = fromString("Updates");

    /**
     * Creates or finds a VMGuestPatchClassificationWindows from its string representation.
     * @param name a name to look for
     * @return the corresponding VMGuestPatchClassificationWindows
     */
    @JsonCreator
    public static VMGuestPatchClassificationWindows fromString(String name) {
        return fromString(name, VMGuestPatchClassificationWindows.class);
    }

    /**
     * @return known VMGuestPatchClassificationWindows values
     */
    public static Collection<VMGuestPatchClassificationWindows> values() {
        return values(VMGuestPatchClassificationWindows.class);
    }
}
