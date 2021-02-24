/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.SshPublicKeyResourceInner;

/**
 * Type representing SshPublicKeyResource.
 */
public interface SshPublicKeyResource extends HasInner<SshPublicKeyResourceInner>, Resource, GroupableResourceCore<ComputeManager, SshPublicKeyResourceInner>, HasResourceGroup, Refreshable<SshPublicKeyResource>, Updatable<SshPublicKeyResource.Update>, HasManager<ComputeManager> {
    /**
     * @return the publicKey value.
     */
    String publicKey();

    /**
     * The entirety of the SshPublicKeyResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SshPublicKeyResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SshPublicKeyResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SshPublicKeyResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the sshpublickeyresource definition allowing to specify PublicKey.
         */
        interface WithPublicKey {
            /**
             * Specifies publicKey.
             * @param publicKey SSH public key used to authenticate to a virtual machine through ssh. If this property is not initially provided when the resource is created, the publicKey property will be populated when generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to be at least 2048-bit and in ssh-rsa format
             * @return the next definition stage
             */
            WithCreate withPublicKey(String publicKey);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SshPublicKeyResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithPublicKey {
        }
    }
    /**
     * The template for a SshPublicKeyResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SshPublicKeyResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithPublicKey {
    }

    /**
     * Grouping of SshPublicKeyResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sshpublickeyresource update allowing to specify PublicKey.
         */
        interface WithPublicKey {
            /**
             * Specifies publicKey.
             * @param publicKey SSH public key used to authenticate to a virtual machine through ssh. If this property is not initially provided when the resource is created, the publicKey property will be populated when generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to be at least 2048-bit and in ssh-rsa format
             * @return the next update stage
             */
            Update withPublicKey(String publicKey);
        }

    }
}
