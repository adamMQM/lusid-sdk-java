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
import com.finbourne.lusid.model.AnnulQuotesResponse;
import com.finbourne.lusid.model.GetQuotesResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.QuoteId;
import com.finbourne.lusid.model.QuoteSeriesId;
import com.finbourne.lusid.model.ResourceListOfQuote;
import com.finbourne.lusid.model.UpsertQuoteRequest;
import com.finbourne.lusid.model.UpsertQuotesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuotesApi
 */
@Ignore
public class QuotesApiTest {

    private final QuotesApi api = new QuotesApi();

    
    /**
     * [EARLY ACCESS] Delete quotes
     *
     * Delete one or more specified quotes from a single scope. A quote is identified by its unique id which includes information about  the type of quote as well as the exact effective datetime (to the microsecond) from which it became valid.                In the request each quote must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.                The response will return both the collection of successfully deleted quotes, as well as those that failed.  For the failures a reason will be provided explaining why the quote could not be deleted.                It is important to always check the failed set for any unsuccessful results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQuotesTest() throws ApiException {
        String scope = null;
        Map<String, QuoteId> requestBody = null;
        AnnulQuotesResponse response = api.deleteQuotes(scope, requestBody);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get quotes
     *
     * Get one or more quotes from a single scope.                Each quote can be identified by its time invariant quote series id.                For each quote series id LUSID will return the most recent quote with respect to the provided (or default) effective datetime.                 An optional maximum age range window can be specified which defines how far back to look back for a quote from the specified effective datetime.  LUSID will return the most recent quote within this window.                In the request each quote series id must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.                The response will return three collections. One, the successfully retrieved quotes. Two, those that had a  valid quote series id but could not be found. Three, those that failed because LUSID could not construct a valid quote series id from the request.    For the quotes that failed or could not be found a reason will be provided explaining why the quote could not be retrieved.                It is important to always check the failed and not found sets for any unsuccessful results.  The maximum number of quotes that this method can get per request is 2,000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQuotesTest() throws ApiException {
        String scope = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String maxAge = null;
        Map<String, QuoteSeriesId> requestBody = null;
        GetQuotesResponse response = api.getQuotes(scope, effectiveAt, asAt, maxAge, requestBody);

        // TODO: test validations
    }
    
    /**
     * [DEPRECATED] List quotes
     *
     * List all the quotes from a single scope at the specified date/time  Please use M:Finbourne.WebApi.Controllers.QuotesController.ListQuotesForScope(System.String,System.Nullable{System.DateTimeOffset},System.String,System.Nullable{System.Int32},System.Nullable{System.Int32},System.String) - the signature and behaviour of this endpoint will be changing to omit scope
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listQuotesTest() throws ApiException {
        String scope = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        ResourceListOfQuote response = api.listQuotes(scope, asAt, page, start, limit, filter);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List quotes for scope
     *
     * List all the quotes from a single scope at the specified date/time
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listQuotesForScopeTest() throws ApiException {
        String scope = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        ResourceListOfQuote response = api.listQuotesForScope(scope, asAt, page, start, limit, filter);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Upsert quotes
     *
     * Update or insert one or more quotes in a single scope. A quote will be updated if it already exists  and inserted if it does not.                In the request each quote must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.                The response will return both the collection of successfully updated or inserted quotes, as well as those that failed.  For the failures a reason will be provided explaining why the quote could not be updated or inserted.                It is important to always check the failed set for any unsuccessful results.  The maximum number of quotes that this method can upsert per request is 2,000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertQuotesTest() throws ApiException {
        String scope = null;
        Map<String, UpsertQuoteRequest> requestBody = null;
        UpsertQuotesResponse response = api.upsertQuotes(scope, requestBody);

        // TODO: test validations
    }
    
}
