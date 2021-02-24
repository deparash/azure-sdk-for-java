// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.RouteTableInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RouteTablesClient. */
public interface RouteTablesClient
    extends InnerSupportsGet<RouteTableInner>, InnerSupportsListing<RouteTableInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String routeTableName);

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String routeTableName);

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeTableName);

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeTableName, Context context);

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String routeTableName);

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routeTableName);

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routeTableName, Context context);

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteTableInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String routeTableName, String expand);

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteTableInner> getByResourceGroupAsync(String resourceGroupName, String routeTableName, String expand);

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteTableInner> getByResourceGroupAsync(String resourceGroupName, String routeTableName);

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteTableInner getByResourceGroup(String resourceGroupName, String routeTableName);

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RouteTableInner> getByResourceGroupWithResponse(
        String resourceGroupName, String routeTableName, String expand, Context context);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String routeTableName, RouteTableInner parameters);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteTableInner>, RouteTableInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String routeTableName, RouteTableInner parameters);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteTableInner>, RouteTableInner> beginCreateOrUpdate(
        String resourceGroupName, String routeTableName, RouteTableInner parameters);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteTableInner>, RouteTableInner> beginCreateOrUpdate(
        String resourceGroupName, String routeTableName, RouteTableInner parameters, Context context);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteTableInner> createOrUpdateAsync(
        String resourceGroupName, String routeTableName, RouteTableInner parameters);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteTableInner createOrUpdate(String resourceGroupName, String routeTableName, RouteTableInner parameters);

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create or update route table operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteTableInner createOrUpdate(
        String resourceGroupName, String routeTableName, RouteTableInner parameters, Context context);

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteTableInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String routeTableName, Map<String, String> tags);

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteTableInner> updateTagsAsync(String resourceGroupName, String routeTableName, Map<String, String> tags);

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteTableInner> updateTagsAsync(String resourceGroupName, String routeTableName);

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteTableInner updateTags(String resourceGroupName, String routeTableName);

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RouteTableInner> updateTagsWithResponse(
        String resourceGroupName, String routeTableName, Map<String, String> tags, Context context);

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RouteTableInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteTableInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteTableInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all route tables in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RouteTableInner> listAsync();

    /**
     * Gets all route tables in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteTableInner> list();

    /**
     * Gets all route tables in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteTableInner> list(Context context);
}
