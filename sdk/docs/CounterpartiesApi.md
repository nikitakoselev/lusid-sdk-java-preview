# CounterpartiesApi

All URIs are relative to *http://local-unit-test-server.lusid.com:56737*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCounterpartyAgreement**](CounterpartiesApi.md#deleteCounterpartyAgreement) | **DELETE** /api/counterparties/counterpartyagreements/{scope}/{code} | [EXPERIMENTAL] Delete the Counterparty Agreement of given scope and code
[**deleteCreditSupportAnnex**](CounterpartiesApi.md#deleteCreditSupportAnnex) | **DELETE** /api/counterparties/creditsupportannexes/{scope}/{code} | [EXPERIMENTAL] Delete the Credit Support Annex of given scope and code
[**getCounterpartyAgreement**](CounterpartiesApi.md#getCounterpartyAgreement) | **GET** /api/counterparties/counterpartyagreements/{scope}/{code} | [EXPERIMENTAL] Get Counterparty Agreement
[**getCreditSupportAnnex**](CounterpartiesApi.md#getCreditSupportAnnex) | **GET** /api/counterparties/creditsupportannexes/{scope}/{code} | [EXPERIMENTAL] Get Credit Support Annex
[**listCounterpartyAgreements**](CounterpartiesApi.md#listCounterpartyAgreements) | **GET** /api/counterparties/counterpartyagreements | [EXPERIMENTAL] List the set of Counterparty Agreements
[**listCreditSupportAnnexes**](CounterpartiesApi.md#listCreditSupportAnnexes) | **GET** /api/counterparties/creditsupportannexes | [EXPERIMENTAL] List the set of Credit Support Annexes
[**upsertCounterpartyAgreement**](CounterpartiesApi.md#upsertCounterpartyAgreement) | **POST** /api/counterparties/counterpartyagreements | [EXPERIMENTAL] Upsert Counterparty Agreement
[**upsertCreditSupportAnnex**](CounterpartiesApi.md#upsertCreditSupportAnnex) | **POST** /api/counterparties/creditsupportannexes | [EXPERIMENTAL] Upsert Credit Support Annex


<a name="deleteCounterpartyAgreement"></a>
# **deleteCounterpartyAgreement**
> AnnulSingleStructuredDataResponse deleteCounterpartyAgreement(scope, code)

[EXPERIMENTAL] Delete the Counterparty Agreement of given scope and code

Delete the specified Counterparty Agreement from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.                It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Counterparty Agreement to delete.
    String code = "code_example"; // String | The Counterparty Agreement to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteCounterpartyAgreement(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#deleteCounterpartyAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the Counterparty Agreement to delete. |
 **code** | **String**| The Counterparty Agreement to delete. |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The AsAt of deletion or failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteCreditSupportAnnex"></a>
# **deleteCreditSupportAnnex**
> AnnulSingleStructuredDataResponse deleteCreditSupportAnnex(scope, code)

[EXPERIMENTAL] Delete the Credit Support Annex of given scope and code

Delete the specified Credit Support Annex from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.                It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Credit Support Annex to delete.
    String code = "code_example"; // String | The Credit Support Annex to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteCreditSupportAnnex(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#deleteCreditSupportAnnex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the Credit Support Annex to delete. |
 **code** | **String**| The Credit Support Annex to delete. |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The AsAt of deletion or failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getCounterpartyAgreement"></a>
# **getCounterpartyAgreement**
> GetCounterpartyAgreementResponse getCounterpartyAgreement(scope, code, asAt)

[EXPERIMENTAL] Get Counterparty Agreement

Get a Counterparty Agreement from a single scope.  The response will return either the Counterparty Agreement that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Counterparty Agreement to retrieve.
    String code = "code_example"; // String | The name of the Counterparty Agreement to retrieve the data for.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the Counterparty Agreement. Defaults to return the latest version if not specified.
    try {
      GetCounterpartyAgreementResponse result = apiInstance.getCounterpartyAgreement(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#getCounterpartyAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the Counterparty Agreement to retrieve. |
 **code** | **String**| The name of the Counterparty Agreement to retrieve the data for. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Counterparty Agreement. Defaults to return the latest version if not specified. | [optional]

### Return type

[**GetCounterpartyAgreementResponse**](GetCounterpartyAgreementResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully retrieved Counterparty Agreement or any failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getCreditSupportAnnex"></a>
# **getCreditSupportAnnex**
> GetCreditSupportAnnexResponse getCreditSupportAnnex(scope, code, asAt)

[EXPERIMENTAL] Get Credit Support Annex

Get a Credit Support Annex from a single scope.  The response will return either the Credit Support Annex that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Credit Support Annex to retrieve.
    String code = "code_example"; // String | The name of the Credit Support Annex to retrieve the data for.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the Credit Support Annex . Defaults to return the latest version if not specified.
    try {
      GetCreditSupportAnnexResponse result = apiInstance.getCreditSupportAnnex(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#getCreditSupportAnnex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the Credit Support Annex to retrieve. |
 **code** | **String**| The name of the Credit Support Annex to retrieve the data for. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Credit Support Annex . Defaults to return the latest version if not specified. | [optional]

### Return type

[**GetCreditSupportAnnexResponse**](GetCreditSupportAnnexResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully retrieved credit support annexes or any failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listCounterpartyAgreements"></a>
# **listCounterpartyAgreements**
> ResourceListOfGetCounterpartyAgreementResponse listCounterpartyAgreements(asAt)

[EXPERIMENTAL] List the set of Counterparty Agreements

List the set of Counterparty Agreements at the specified AsAt date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the Counterparty Agreements. Defaults to latest if not specified.
    try {
      ResourceListOfGetCounterpartyAgreementResponse result = apiInstance.listCounterpartyAgreements(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#listCounterpartyAgreements");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Counterparty Agreements. Defaults to latest if not specified. | [optional]

### Return type

[**ResourceListOfGetCounterpartyAgreementResponse**](ResourceListOfGetCounterpartyAgreementResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested Counterparty Agreements |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listCreditSupportAnnexes"></a>
# **listCreditSupportAnnexes**
> ResourceListOfGetCreditSupportAnnexResponse listCreditSupportAnnexes(asAt)

[EXPERIMENTAL] List the set of Credit Support Annexes

List the set of Credit Support Annexes at the specified AsAt date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the Credit Support Annexes. Defaults to latest if not specified.
    try {
      ResourceListOfGetCreditSupportAnnexResponse result = apiInstance.listCreditSupportAnnexes(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#listCreditSupportAnnexes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Credit Support Annexes. Defaults to latest if not specified. | [optional]

### Return type

[**ResourceListOfGetCreditSupportAnnexResponse**](ResourceListOfGetCreditSupportAnnexResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested Credit Support Annexes |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertCounterpartyAgreement"></a>
# **upsertCounterpartyAgreement**
> UpsertSingleStructuredDataResponse upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest)

[EXPERIMENTAL] Upsert Counterparty Agreement

Update or insert Counterparty Agreement in a single scope. An item will be updated if it already exists and inserted if it does not.                The response will return the successfully updated or inserted Counterparty Agreement or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    UpsertCounterpartyAgreementRequest upsertCounterpartyAgreementRequest = {"counterpartyAgreement":{"displayName":"display-name","agreementType":"type","counterpartySignatory":{"name":"counterparty-signatory-name","legalEntityIdentifier":{"idTypeScope":"legal-identifier-idTypeScope","idTypeCode":"legal-identifier-idTypeCode","code":"legal-identifier-code"}},"datedAsOf":"2020-01-01T01:00:00.0000000+00:00","creditSupportAnnexId":{"scope":"credit-support-annex-scope","code":"credit-support-annex-code"},"id":{"scope":"some-scope","code":"some-code"}}}; // UpsertCounterpartyAgreementRequest | The Counterparty Agreement to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#upsertCounterpartyAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upsertCounterpartyAgreementRequest** | [**UpsertCounterpartyAgreementRequest**](UpsertCounterpartyAgreementRequest.md)| The Counterparty Agreement to update or insert |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully updated or inserted Counterparty Agreement or any failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertCreditSupportAnnex"></a>
# **upsertCreditSupportAnnex**
> UpsertSingleStructuredDataResponse upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest)

[EXPERIMENTAL] Upsert Credit Support Annex

Update or insert Credit Support Annex in a single scope. An item will be updated if it already exists and inserted if it does not.                The response will return the successfully updated or inserted Credit Support Annex or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:56737");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    UpsertCreditSupportAnnexRequest upsertCreditSupportAnnexRequest = {"creditSupportAnnex":{"referenceCurrency":"GBP","collateralCurrencies":["GBP"],"isdaAgreementVersion":"ISDA2002","marginCallFrequency":"1W","valuationAgent":"Institution","thresholdAmount":0,"roundingDecimalPlaces":2,"initialMarginAmount":100000,"minimumTransferAmount":10000,"id":{"scope":"some-scope","code":"some-code"}}}; // UpsertCreditSupportAnnexRequest | The Credit Support Annex to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#upsertCreditSupportAnnex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upsertCreditSupportAnnexRequest** | [**UpsertCreditSupportAnnexRequest**](UpsertCreditSupportAnnexRequest.md)| The Credit Support Annex to update or insert |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully updated or inserted item or any failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |
