/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3425
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.AccessMetadataValue;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LegalEntity;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfLegalEntity;
import com.finbourne.lusid.model.ResourceListOfAccessMetadataValueOf;
import com.finbourne.lusid.model.ResourceListOfPropertyInterval;
import com.finbourne.lusid.model.ResourceListOfRelation;
import com.finbourne.lusid.model.ResourceListOfRelationship;
import com.finbourne.lusid.model.UpsertLegalEntityAccessMetadataRequest;
import com.finbourne.lusid.model.UpsertLegalEntityRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LegalEntitiesApi
 */
@Ignore
public class LegalEntitiesApiTest {

    private final LegalEntitiesApi api = new LegalEntitiesApi();

    
    /**
     * [EARLY ACCESS] Delete Legal Entity
     *
     * Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLegalEntityTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        DeletedEntityResponse response = api.deleteLegalEntity(idTypeScope, idTypeCode, code);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Delete a Legal Entity Access Metadata entry
     *
     * Deletes the Legal Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLegalEntityAccessMetadataTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String metadataKey = null;
        String effectiveAt = null;
        DeletedEntityResponse response = api.deleteLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Delete Legal Entity Properties
     *
     * Delete all properties that belong to the given property keys of the legal entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLegalEntityPropertiesTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        List<String> propertyKeys = null;
        String effectiveAt = null;
        DeletedEntityResponse response = api.deleteLegalEntityProperties(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Get Access Metadata rules for a Legal Entity
     *
     * Pass the Scope and Code of the Legal Entity identifier along with the Legal Entity code parameter to retrieve the associated Access Metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLegalEntityAccessMetadataTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        Map<String, List<AccessMetadataValue>> response = api.getAllLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get Legal Entity
     *
     * Retrieve the definition of a legal entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegalEntityTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        List<String> propertyKeys = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        LegalEntity response = api.getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity
     *
     * Get a specific Legal Entity Access Metadata by specifying the corresponding identifier parts and Legal Entity code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegalEntityAccessMetadataByKeyTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String metadataKey = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        List<AccessMetadataValue> response = api.getLegalEntityAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Get Legal Entity Property Time Series
     *
     * List the complete time series of a legal entity property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegalEntityPropertyTimeSeriesTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String propertyKey = null;
        OffsetDateTime asAt = null;
        String filter = null;
        String page = null;
        Integer limit = null;
        ResourceListOfPropertyInterval response = api.getLegalEntityPropertyTimeSeries(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Get Relations for Legal Entity
     *
     * Get relations for the specified Legal Entity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegalEntityRelationsTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String filter = null;
        List<String> identifierTypes = null;
        ResourceListOfRelation response = api.getLegalEntityRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Get Relationships for Legal Entity
     *
     * Get Relationships for the specified Legal Entity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegalEntityRelationshipsTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String filter = null;
        List<String> identifierTypes = null;
        ResourceListOfRelationship response = api.getLegalEntityRelationships(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List Legal Entities
     *
     * List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLegalEntitiesTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer limit = null;
        String filter = null;
        List<String> propertyKeys = null;
        PagedResourceListOfLegalEntity response = api.listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Upsert Legal Entity
     *
     * Create or update a legal entity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertLegalEntityTest() throws ApiException {
        UpsertLegalEntityRequest upsertLegalEntityRequest = null;
        LegalEntity response = api.upsertLegalEntity(upsertLegalEntityRequest);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     *
     * Update or insert one Legal Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Legal Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertLegalEntityAccessMetadataTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        String metadataKey = null;
        UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest = null;
        String effectiveAt = null;
        ResourceListOfAccessMetadataValueOf response = api.upsertLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt);

        // TODO: test validations
    }
    
}
