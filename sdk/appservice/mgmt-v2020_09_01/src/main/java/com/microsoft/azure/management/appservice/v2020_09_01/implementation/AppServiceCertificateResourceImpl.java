/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.AppServiceCertificateResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.AppServiceCertificatePatchResource;
import java.util.Map;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;
import com.microsoft.azure.management.appservice.v2020_09_01.KeyVaultSecretStatus;
import rx.functions.Func1;

class AppServiceCertificateResourceImpl extends CreatableUpdatableImpl<AppServiceCertificateResource, AppServiceCertificateResourceInner, AppServiceCertificateResourceImpl> implements AppServiceCertificateResource, AppServiceCertificateResource.Definition, AppServiceCertificateResource.Update {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String certificateOrderName;
    private String name;
    private AppServiceCertificatePatchResource updateParameter;

    AppServiceCertificateResourceImpl(String name, AppServiceManager manager) {
        super(name, new AppServiceCertificateResourceInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new AppServiceCertificatePatchResource();
    }

    AppServiceCertificateResourceImpl(AppServiceCertificateResourceInner inner, AppServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.certificateOrderName = IdParsingUtils.getValueFromIdByName(inner.id(), "certificateOrders");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "certificates");
        //
        this.updateParameter = new AppServiceCertificatePatchResource();
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AppServiceCertificateResource> createResourceAsync() {
        AppServiceCertificateOrdersInner client = this.manager().inner().appServiceCertificateOrders();
        return client.createOrUpdateCertificateAsync(this.resourceGroupName, this.certificateOrderName, this.name, this.inner())
            .map(new Func1<AppServiceCertificateResourceInner, AppServiceCertificateResourceInner>() {
               @Override
               public AppServiceCertificateResourceInner call(AppServiceCertificateResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AppServiceCertificateResource> updateResourceAsync() {
        AppServiceCertificateOrdersInner client = this.manager().inner().appServiceCertificateOrders();
        return client.updateCertificateAsync(this.resourceGroupName, this.certificateOrderName, this.name, this.updateParameter)
            .map(new Func1<AppServiceCertificateResourceInner, AppServiceCertificateResourceInner>() {
               @Override
               public AppServiceCertificateResourceInner call(AppServiceCertificateResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AppServiceCertificateResourceInner> getInnerAsync() {
        AppServiceCertificateOrdersInner client = this.manager().inner().appServiceCertificateOrders();
        return client.getCertificateAsync(this.resourceGroupName, this.certificateOrderName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AppServiceCertificatePatchResource();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String keyVaultId() {
        return this.inner().keyVaultId();
    }

    @Override
    public String keyVaultSecretName() {
        return this.inner().keyVaultSecretName();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public KeyVaultSecretStatus provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AppServiceCertificateResourceImpl withExistingCertificateOrder(String resourceGroupName, String certificateOrderName) {
        this.resourceGroupName = resourceGroupName;
        this.certificateOrderName = certificateOrderName;
        return this;
    }

    @Override
    public AppServiceCertificateResourceImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public AppServiceCertificateResourceImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public AppServiceCertificateResourceImpl withKeyVaultId(String keyVaultId) {
        if (isInCreateMode()) {
            this.inner().withKeyVaultId(keyVaultId);
        } else {
            this.updateParameter.withKeyVaultId(keyVaultId);
        }
        return this;
    }

    @Override
    public AppServiceCertificateResourceImpl withKeyVaultSecretName(String keyVaultSecretName) {
        if (isInCreateMode()) {
            this.inner().withKeyVaultSecretName(keyVaultSecretName);
        } else {
            this.updateParameter.withKeyVaultSecretName(keyVaultSecretName);
        }
        return this;
    }

    @Override
    public AppServiceCertificateResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public AppServiceCertificateResourceImpl withSystemData(SystemData systemData) {
        if (isInCreateMode()) {
            this.inner().withSystemData(systemData);
        } else {
            this.updateParameter.withSystemData(systemData);
        }
        return this;
    }

}
