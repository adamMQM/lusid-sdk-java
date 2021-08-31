/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3442
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.DeleteInstrumentResponse;
import com.finbourne.lusid.model.GetInstrumentsResponse;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.InstrumentDefinition;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfInstrument;
import com.finbourne.lusid.model.ResourceListOfInstrumentIdTypeDescriptor;
import com.finbourne.lusid.model.ResourceListOfPropertyInterval;
import com.finbourne.lusid.model.UpdateInstrumentIdentifierRequest;
import com.finbourne.lusid.model.UpsertInstrumentPropertiesResponse;
import com.finbourne.lusid.model.UpsertInstrumentPropertyRequest;
import com.finbourne.lusid.model.UpsertInstrumentsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstrumentsApi
 */
@Ignore
public class InstrumentsApiTest {

    private final InstrumentsApi api = new InstrumentsApi();

    
    /**
     * [EARLY ACCESS] Delete instrument
     *
     * Delete a particular instrument, as identified by a particular instrument identifier.                Once deleted, an instrument is marked as inactive and can no longer be referenced when creating or updating  transactions or holdings. You can still query existing transactions and holdings related to the  deleted instrument.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstrumentTest() throws ApiException {
        String identifierType = null;
        String identifier = null;
        DeleteInstrumentResponse response = api.deleteInstrument(identifierType, identifier);

        // TODO: test validations
    }
    
    /**
     * Get instrument
     *
     * Retrieve the definition of a particular instrument, as identified by a particular unique identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstrumentTest() throws ApiException {
        String identifierType = null;
        String identifier = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        List<String> propertyKeys = null;
        Instrument response = api.getInstrument(identifierType, identifier, effectiveAt, asAt, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get instrument identifier types
     *
     * Retrieve a list of all valid instrument identifier types and whether they are unique or not.                An instrument must have a value for at least one unique identifier type (it can have more than one unique type and value).  In addition, a value is automatically generated for a LUSID Instrument ID (LUID) unique type by the system.                An instrument can have values for multiple non-unique identifier types (or it can have zero non-unique types and values).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstrumentIdentifierTypesTest() throws ApiException {
        ResourceListOfInstrumentIdTypeDescriptor response = api.getInstrumentIdentifierTypes();

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get instrument property time series
     *
     * Retrieve the complete time series (history) for a particular property of an instrument.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstrumentPropertyTimeSeriesTest() throws ApiException {
        String identifierType = null;
        String identifier = null;
        String propertyKey = null;
        String identifierEffectiveAt = null;
        OffsetDateTime asAt = null;
        String filter = null;
        String page = null;
        Integer limit = null;
        ResourceListOfPropertyInterval response = api.getInstrumentPropertyTimeSeries(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get instruments
     *
     * Retrieve the definition of one or more instruments, as identified by a collection of unique identifiers.                Note that to retrieve all the instruments in the instrument master, use the List instruments endpoint instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstrumentsTest() throws ApiException {
        String identifierType = null;
        List<String> requestBody = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        List<String> propertyKeys = null;
        GetInstrumentsResponse response = api.getInstruments(identifierType, requestBody, effectiveAt, asAt, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List instruments
     *
     * List all the instruments in the instrument master.                To retrieve a particular set of instruments instead, use the Get instruments endpoint.  The maximum number of instruments that this method can list per request is 2,000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInstrumentsTest() throws ApiException {
        OffsetDateTime asAt = null;
        String effectiveAt = null;
        String page = null;
        List<String> sortBy = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        List<String> instrumentPropertyKeys = null;
        PagedResourceListOfInstrument response = api.listInstruments(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Update instrument identifier
     *
     * Create, update or delete a particular instrument identifier for an instrument.                To delete the identifier, leave the value unspecified in the request. If not being deleted, the  identifier is updated if it exists and created if it does not.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInstrumentIdentifierTest() throws ApiException {
        String identifierType = null;
        String identifier = null;
        UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest = null;
        Instrument response = api.updateInstrumentIdentifier(identifierType, identifier, updateInstrumentIdentifierRequest);

        // TODO: test validations
    }
    
    /**
     * Upsert instruments
     *
     * Create or update one or more instruments in the instrument master. An instrument is updated  if it already exists and created if it does not.                In the request, each instrument definition should be keyed by a unique correlation ID. This ID is ephemeral  and not stored by LUSID. It serves only to easily identify each instrument in the response.                Note that an instrument must have at least one unique identifier, which is a combination of a type  (such as &#39;Figi&#39;) and a value (such as &#39;BBG000BS1N49&#39;). In addition, a random value is automatically  generated for a LUSID Instrument ID (LUID) unique type by the system. For more information, see  https://support.lusid.com/knowledgebase/article/KA-01862.                The response returns both the collection of successfully created or updated instruments, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.  The maximum number of instruments that this method can upsert per request is 2,000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertInstrumentsTest() throws ApiException {
        Map<String, InstrumentDefinition> requestBody = null;
        UpsertInstrumentsResponse response = api.upsertInstruments(requestBody);

        // TODO: test validations
    }
    
    /**
     * Upsert instruments properties
     *
     * Create or update one or more properties for particular instruments.                Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertInstrumentsPropertiesTest() throws ApiException {
        List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest = null;
        UpsertInstrumentPropertiesResponse response = api.upsertInstrumentsProperties(upsertInstrumentPropertyRequest);

        // TODO: test validations
    }
    
}
