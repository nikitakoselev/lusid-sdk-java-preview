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

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.Block;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfBlock;
import com.finbourne.lusid.model.ResourceListOfBlock;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlocksApi {
    private ApiClient localVarApiClient;

    public BlocksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BlocksApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteBlock
     * @param scope The block scope. (required)
     * @param code The block&#39;s code. This, together with the scope uniquely identifies the block to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting an block. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBlockCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/blocks/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.3425");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteBlockValidateBeforeCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteBlock(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteBlock(Async)");
        }
        

        okhttp3.Call localVarCall = deleteBlockCall(scope, code, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] Delete block
     * Delete an block. Deletion will be valid from the block&#39;s creation datetime.  This means that the block will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param scope The block scope. (required)
     * @param code The block&#39;s code. This, together with the scope uniquely identifies the block to delete. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting an block. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteBlock(String scope, String code) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteBlockWithHttpInfo(scope, code);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] Delete block
     * Delete an block. Deletion will be valid from the block&#39;s creation datetime.  This means that the block will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param scope The block scope. (required)
     * @param code The block&#39;s code. This, together with the scope uniquely identifies the block to delete. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting an block. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteBlockWithHttpInfo(String scope, String code) throws ApiException {
        okhttp3.Call localVarCall = deleteBlockValidateBeforeCall(scope, code, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] Delete block (asynchronously)
     * Delete an block. Deletion will be valid from the block&#39;s creation datetime.  This means that the block will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param scope The block scope. (required)
     * @param code The block&#39;s code. This, together with the scope uniquely identifies the block to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting an block. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBlockAsync(String scope, String code, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteBlockValidateBeforeCall(scope, code, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBlock
     * @param scope The scope to which the block belongs. (required)
     * @param code The block&#39;s unique identifier. (required)
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto the block.              These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The block matching the given identifier. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBlockCall(String scope, String code, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/blocks/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.3425");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBlockValidateBeforeCall(String scope, String code, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getBlock(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getBlock(Async)");
        }
        

        okhttp3.Call localVarCall = getBlockCall(scope, code, asAt, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] Get Block
     * Fetch a Block that matches the specified identifier
     * @param scope The scope to which the block belongs. (required)
     * @param code The block&#39;s unique identifier. (required)
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto the block.              These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @return Block
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The block matching the given identifier. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Block getBlock(String scope, String code, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        ApiResponse<Block> localVarResp = getBlockWithHttpInfo(scope, code, asAt, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] Get Block
     * Fetch a Block that matches the specified identifier
     * @param scope The scope to which the block belongs. (required)
     * @param code The block&#39;s unique identifier. (required)
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto the block.              These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @return ApiResponse&lt;Block&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The block matching the given identifier. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Block> getBlockWithHttpInfo(String scope, String code, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = getBlockValidateBeforeCall(scope, code, asAt, propertyKeys, null);
        Type localVarReturnType = new TypeToken<Block>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] Get Block (asynchronously)
     * Fetch a Block that matches the specified identifier
     * @param scope The scope to which the block belongs. (required)
     * @param code The block&#39;s unique identifier. (required)
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto the block.              These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The block matching the given identifier. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBlockAsync(String scope, String code, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback<Block> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBlockValidateBeforeCall(scope, code, asAt, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<Block>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listBlocks
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param page The pagination token to use to continue listing blocks from a previous call to list blocks.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param sortBy Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. (optional, default to &quot;&quot;)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto each block.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Blocks in scope. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBlocksCall(OffsetDateTime asAt, String page, List<String> sortBy, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/blocks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.3425");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBlocksValidateBeforeCall(OffsetDateTime asAt, String page, List<String> sortBy, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listBlocksCall(asAt, page, sortBy, limit, filter, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] List Blocks
     * Fetch the last pre-AsAt date version of each block in scope (does not fetch the entire history).
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param page The pagination token to use to continue listing blocks from a previous call to list blocks.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param sortBy Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. (optional, default to &quot;&quot;)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto each block.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @return PagedResourceListOfBlock
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Blocks in scope. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfBlock listBlocks(OffsetDateTime asAt, String page, List<String> sortBy, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<PagedResourceListOfBlock> localVarResp = listBlocksWithHttpInfo(asAt, page, sortBy, limit, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] List Blocks
     * Fetch the last pre-AsAt date version of each block in scope (does not fetch the entire history).
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param page The pagination token to use to continue listing blocks from a previous call to list blocks.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param sortBy Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. (optional, default to &quot;&quot;)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto each block.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @return ApiResponse&lt;PagedResourceListOfBlock&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Blocks in scope. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfBlock> listBlocksWithHttpInfo(OffsetDateTime asAt, String page, List<String> sortBy, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = listBlocksValidateBeforeCall(asAt, page, sortBy, limit, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfBlock>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] List Blocks (asynchronously)
     * Fetch the last pre-AsAt date version of each block in scope (does not fetch the entire history).
     * @param asAt The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. (optional)
     * @param page The pagination token to use to continue listing blocks from a previous call to list blocks.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param sortBy Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. (optional, default to &quot;&quot;)
     * @param propertyKeys A list of property keys from the \&quot;Block\&quot; domain to decorate onto each block.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Blocks in scope. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBlocksAsync(OffsetDateTime asAt, String page, List<String> sortBy, Integer limit, String filter, List<String> propertyKeys, final ApiCallback<PagedResourceListOfBlock> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBlocksValidateBeforeCall(asAt, page, sortBy, limit, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfBlock>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertBlocks
     * @param body The collection of block requests. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A collection of blocks. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertBlocksCall(Object body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/blocks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.3425");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertBlocksValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = upsertBlocksCall(body, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] Upsert Block
     * Upsert; update existing blocks with given ids, or create new blocks otherwise.
     * @param body The collection of block requests. (optional)
     * @return ResourceListOfBlock
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A collection of blocks. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfBlock upsertBlocks(Object body) throws ApiException {
        ApiResponse<ResourceListOfBlock> localVarResp = upsertBlocksWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] Upsert Block
     * Upsert; update existing blocks with given ids, or create new blocks otherwise.
     * @param body The collection of block requests. (optional)
     * @return ApiResponse&lt;ResourceListOfBlock&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A collection of blocks. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfBlock> upsertBlocksWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = upsertBlocksValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<ResourceListOfBlock>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] Upsert Block (asynchronously)
     * Upsert; update existing blocks with given ids, or create new blocks otherwise.
     * @param body The collection of block requests. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A collection of blocks. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertBlocksAsync(Object body, final ApiCallback<ResourceListOfBlock> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertBlocksValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfBlock>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
