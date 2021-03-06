/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vpn NatRule mapping.
 */
public class VpnNatRuleMapping {
    /**
     * Address space for Vpn NatRule mapping.
     */
    @JsonProperty(value = "addressSpace")
    private String addressSpace;

    /**
     * Get address space for Vpn NatRule mapping.
     *
     * @return the addressSpace value
     */
    public String addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set address space for Vpn NatRule mapping.
     *
     * @param addressSpace the addressSpace value to set
     * @return the VpnNatRuleMapping object itself.
     */
    public VpnNatRuleMapping withAddressSpace(String addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

}
