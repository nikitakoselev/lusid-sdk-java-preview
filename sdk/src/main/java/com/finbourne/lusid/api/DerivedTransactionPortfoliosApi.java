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


import com.finbourne.lusid.model.CreateDerivedTransactionPortfolioRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import com.finbourne.lusid.model.Portfolio;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DerivedTransactionPortfoliosApi {
    private ApiClient localVarApiClient;

    public DerivedTransactionPortfoliosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DerivedTransactionPortfoliosApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createDerivedPortfolio
     * @param scope The scope in which to create the derived transaction portfolio. (required)
     * @param createDerivedTransactionPortfolioRequest The definition of the derived transaction portfolio. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created derived portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDerivedPortfolioCall(String scope, CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createDerivedTransactionPortfolioRequest;

        // create path and map variables
        String localVarPath = "/api/derivedtransactionportfolios/{scope}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()));

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
    private okhttp3.Call createDerivedPortfolioValidateBeforeCall(String scope, CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createDerivedPortfolio(Async)");
        }
        

        okhttp3.Call localVarCall = createDerivedPortfolioCall(scope, createDerivedTransactionPortfolioRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] Create derived portfolio
     * Create a derived transaction portfolio from a parent transaction portfolio (which may itself be derived).
     * @param scope The scope in which to create the derived transaction portfolio. (required)
     * @param createDerivedTransactionPortfolioRequest The definition of the derived transaction portfolio. (optional)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created derived portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Portfolio createDerivedPortfolio(String scope, CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest) throws ApiException {
        ApiResponse<Portfolio> localVarResp = createDerivedPortfolioWithHttpInfo(scope, createDerivedTransactionPortfolioRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] Create derived portfolio
     * Create a derived transaction portfolio from a parent transaction portfolio (which may itself be derived).
     * @param scope The scope in which to create the derived transaction portfolio. (required)
     * @param createDerivedTransactionPortfolioRequest The definition of the derived transaction portfolio. (optional)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created derived portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Portfolio> createDerivedPortfolioWithHttpInfo(String scope, CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest) throws ApiException {
        okhttp3.Call localVarCall = createDerivedPortfolioValidateBeforeCall(scope, createDerivedTransactionPortfolioRequest, null);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] Create derived portfolio (asynchronously)
     * Create a derived transaction portfolio from a parent transaction portfolio (which may itself be derived).
     * @param scope The scope in which to create the derived transaction portfolio. (required)
     * @param createDerivedTransactionPortfolioRequest The definition of the derived transaction portfolio. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created derived portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest, final ApiCallback<Portfolio> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDerivedPortfolioValidateBeforeCall(scope, createDerivedTransactionPortfolioRequest, _callback);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteDerivedPortfolioDetails
     * @param scope The scope of the derived transaction portfolio. (required)
     * @param code The code of the derived transaction portfolio. Together with the scope this uniquely identifies              the derived transaction portfolio. (required)
     * @param effectiveAt The effective date of the change. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteDerivedPortfolioDetailsCall(String scope, String code, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/derivedtransactionportfolios/{scope}/{code}/details"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteDerivedPortfolioDetailsValidateBeforeCall(String scope, String code, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteDerivedPortfolioDetails(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteDerivedPortfolioDetails(Async)");
        }
        

        okhttp3.Call localVarCall = deleteDerivedPortfolioDetailsCall(scope, code, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] Delete derived portfolio details
     * Delete all the portfolio details for a derived transaction portfolio.
     * @param scope The scope of the derived transaction portfolio. (required)
     * @param code The code of the derived transaction portfolio. Together with the scope this uniquely identifies              the derived transaction portfolio. (required)
     * @param effectiveAt The effective date of the change. (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteDerivedPortfolioDetailsWithHttpInfo(scope, code, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] Delete derived portfolio details
     * Delete all the portfolio details for a derived transaction portfolio.
     * @param scope The scope of the derived transaction portfolio. (required)
     * @param code The code of the derived transaction portfolio. Together with the scope this uniquely identifies              the derived transaction portfolio. (required)
     * @param effectiveAt The effective date of the change. (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteDerivedPortfolioDetailsWithHttpInfo(String scope, String code, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deleteDerivedPortfolioDetailsValidateBeforeCall(scope, code, effectiveAt, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] Delete derived portfolio details (asynchronously)
     * Delete all the portfolio details for a derived transaction portfolio.
     * @param scope The scope of the derived transaction portfolio. (required)
     * @param code The code of the derived transaction portfolio. Together with the scope this uniquely identifies              the derived transaction portfolio. (required)
     * @param effectiveAt The effective date of the change. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteDerivedPortfolioDetailsAsync(String scope, String code, String effectiveAt, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteDerivedPortfolioDetailsValidateBeforeCall(scope, code, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
