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
import com.finbourne.lusid.model.CreatePortfolioGroupRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.ExpandedGroup;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PortfolioGroup;
import com.finbourne.lusid.model.PortfolioGroupProperties;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.ResourceListOfPortfolioGroup;
import com.finbourne.lusid.model.ResourceListOfProcessedCommand;
import com.finbourne.lusid.model.TransactionQueryParameters;
import com.finbourne.lusid.model.UpdatePortfolioGroupRequest;
import com.finbourne.lusid.model.VersionedResourceListOfOutputTransaction;
import com.finbourne.lusid.model.VersionedResourceListOfPortfolioHolding;
import com.finbourne.lusid.model.VersionedResourceListOfTransaction;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortfolioGroupsApi
 */
@Ignore
public class PortfolioGroupsApiTest {

    private final PortfolioGroupsApi api = new PortfolioGroupsApi();

    
    /**
     * [EARLY ACCESS] Add portfolio to group
     *
     * Add a single portfolio to a portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPortfolioToGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime effectiveAt = null;
        ResourceId resourceId = null;
        PortfolioGroup response = api.addPortfolioToGroup(scope, code, effectiveAt, resourceId);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Add sub group to group
     *
     * Add a portfolio group to a portfolio group as a sub group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSubGroupToGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime effectiveAt = null;
        ResourceId resourceId = null;
        PortfolioGroup response = api.addSubGroupToGroup(scope, code, effectiveAt, resourceId);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Build transactions for transaction portfolios in a portfolio group
     *
     * Build transactions for transaction portfolios in a portfolio group over a given interval of effective time.     When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buildTransactionsForPortfolioGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        TransactionQueryParameters transactionQueryParameters = null;
        OffsetDateTime asAt = null;
        String filter = null;
        List<String> propertyKeys = null;
        Integer limit = null;
        String page = null;
        VersionedResourceListOfOutputTransaction response = api.buildTransactionsForPortfolioGroup(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Create portfolio group
     *
     * Create a portfolio group in a specific scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPortfolioGroupTest() throws ApiException {
        String scope = null;
        CreatePortfolioGroupRequest createPortfolioGroupRequest = null;
        PortfolioGroup response = api.createPortfolioGroup(scope, createPortfolioGroupRequest);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Delete group properties
     *
     * Delete one or more properties from a single portfolio group. If the properties are time variant then an effective date time from which the properties  will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupPropertiesTest() throws ApiException {
        String scope = null;
        String code = null;
        List<String> requestBody = null;
        String effectiveAt = null;
        DeletedEntityResponse response = api.deleteGroupProperties(scope, code, requestBody, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Delete portfolio from group
     *
     * Remove a single portfolio from a portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortfolioFromGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        String portfolioScope = null;
        String portfolioCode = null;
        OffsetDateTime effectiveAt = null;
        PortfolioGroup response = api.deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Delete portfolio group
     *
     * Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted, however they will no longer be grouped together by this portfolio group.  The deletion will be valid from the portfolio group&#39;s creation datetime, ie. the portfolio group will no longer exist at any effective datetime from the asAt datetime of deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortfolioGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        DeletedEntityResponse response = api.deletePortfolioGroup(scope, code);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Delete sub group from group
     *
     * Remove a single portfolio group (sub group) from a portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubGroupFromGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        String subgroupScope = null;
        String subgroupCode = null;
        OffsetDateTime effectiveAt = null;
        PortfolioGroup response = api.deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get group properties
     *
     * List all the properties of a single portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupPropertiesTest() throws ApiException {
        String scope = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        PortfolioGroupProperties response = api.getGroupProperties(scope, code, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get holdings for transaction portfolios in portfolio group
     *
     * Get the holdings of transaction portfolios in specified portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHoldingsForPortfolioGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String filter = null;
        List<String> propertyKeys = null;
        Boolean byTaxlots = null;
        VersionedResourceListOfPortfolioHolding response = api.getHoldingsForPortfolioGroup(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get portfolio group
     *
     * Retrieve the definition of a single portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime effectiveAt = null;
        OffsetDateTime asAt = null;
        PortfolioGroup response = api.getPortfolioGroup(scope, code, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get portfolio group commands
     *
     * Gets all the commands that modified a single portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioGroupCommandsTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime fromAsAt = null;
        OffsetDateTime toAsAt = null;
        String filter = null;
        ResourceListOfProcessedCommand response = api.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get portfolio group expansion
     *
     * List all the portfolios in a group, including all portfolios within sub groups in the group. Each portfolio will be decorated with all of its properties unless a property filter is specified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioGroupExpansionTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime effectiveAt = null;
        OffsetDateTime asAt = null;
        List<String> propertyFilter = null;
        ExpandedGroup response = api.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get transactions for transaction portfolios in a portfolio group
     *
     * Get transactions for transaction portfolios in a portfolio group over a given interval of effective time.     When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsForPortfolioGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        String fromTransactionDate = null;
        String toTransactionDate = null;
        OffsetDateTime asAt = null;
        String filter = null;
        List<String> propertyKeys = null;
        Integer limit = null;
        String page = null;
        VersionedResourceListOfTransaction response = api.getTransactionsForPortfolioGroup(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List portfolio groups
     *
     * List all the portfolio groups in a single scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortfolioGroupsTest() throws ApiException {
        String scope = null;
        OffsetDateTime effectiveAt = null;
        OffsetDateTime asAt = null;
        String filter = null;
        ResourceListOfPortfolioGroup response = api.listPortfolioGroups(scope, effectiveAt, asAt, filter);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Update portfolio group
     *
     * Update the definition of a single portfolio group. Not all elements within a portfolio group definition are modifiable  due to the potential implications for data already stored against the portfolio group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePortfolioGroupTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime effectiveAt = null;
        UpdatePortfolioGroupRequest updatePortfolioGroupRequest = null;
        PortfolioGroup response = api.updatePortfolioGroup(scope, code, effectiveAt, updatePortfolioGroupRequest);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Upsert group properties
     *
     * Update or insert one or more properties onto a single group. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;PortfolioGroup&#39;.                Upserting a property that exists for a group, with a null value, will delete the instance of the property for that group.    Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertGroupPropertiesTest() throws ApiException {
        String scope = null;
        String code = null;
        Map<String, Property> requestBody = null;
        PortfolioGroupProperties response = api.upsertGroupProperties(scope, code, requestBody);

        // TODO: test validations
    }
    
}
