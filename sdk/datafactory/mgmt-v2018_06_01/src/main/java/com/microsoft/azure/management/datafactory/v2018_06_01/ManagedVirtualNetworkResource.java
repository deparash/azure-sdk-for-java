/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.ManagedVirtualNetworkResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.ManagedVirtualNetworkInner;
import java.util.Map;

/**
 * Type representing ManagedVirtualNetworkResource.
 */
public interface ManagedVirtualNetworkResource extends HasInner<ManagedVirtualNetworkResourceInner>, Indexable, Refreshable<ManagedVirtualNetworkResource>, Updatable<ManagedVirtualNetworkResource.Update>, HasManager<DataFactoryManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ManagedVirtualNetworkInner properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ManagedVirtualNetworkResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithFactory, DefinitionStages.WithIfMatch, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedVirtualNetworkResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedVirtualNetworkResource definition.
         */
        interface Blank extends WithFactory {
        }

        /**
         * The stage of the managedvirtualnetworkresource definition allowing to specify Factory.
         */
        interface WithFactory {
           /**
            * Specifies resourceGroupName, factoryName.
            * @param resourceGroupName The resource group name
            * @param factoryName The factory name
            * @return the next definition stage
            */
            WithIfMatch withExistingFactory(String resourceGroupName, String factoryName);
        }

        /**
         * The stage of the managedvirtualnetworkresource definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the managed Virtual Network entity. Should only be specified for update, for which it should match existing entity or can be * for unconditional update
            * @return the next definition stage
            */
            WithProperties withIfMatch(String ifMatch);
        }

        /**
         * The stage of the managedvirtualnetworkresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Managed Virtual Network properties
            * @return the next definition stage
            */
            WithCreate withProperties(ManagedVirtualNetworkInner properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedVirtualNetworkResource> {
        }
    }
    /**
     * The template for a ManagedVirtualNetworkResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedVirtualNetworkResource>, UpdateStages.WithIfMatch, UpdateStages.WithProperties {
    }

    /**
     * Grouping of ManagedVirtualNetworkResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managedvirtualnetworkresource update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the managed Virtual Network entity. Should only be specified for update, for which it should match existing entity or can be * for unconditional update
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the managedvirtualnetworkresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Managed Virtual Network properties
             * @return the next update stage
             */
            Update withProperties(ManagedVirtualNetworkInner properties);
        }

    }
}
