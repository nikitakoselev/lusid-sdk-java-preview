# PlacementsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:47862*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePlacement**](PlacementsApi.md#deletePlacement) | **DELETE** /api/placements/{scope}/{code} | [EXPERIMENTAL] Delete placement
[**getPlacement**](PlacementsApi.md#getPlacement) | **GET** /api/placements/{scope}/{code} | [EXPERIMENTAL] Get Placement
[**listPlacements**](PlacementsApi.md#listPlacements) | **GET** /api/placements | [EXPERIMENTAL] List Placements
[**upsertPlacements**](PlacementsApi.md#upsertPlacements) | **POST** /api/placements | [EXPERIMENTAL] Upsert Placement


<a name="deletePlacement"></a>
# **deletePlacement**
> DeletedEntityResponse deletePlacement(scope, code)

[EXPERIMENTAL] Delete placement

Delete an placement. Deletion will be valid from the placement&#39;s creation datetime.  This means that the placement will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:47862");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    String scope = "scope_example"; // String | The placement scope.
    String code = "code_example"; // String | The placement's code. This, together with the scope uniquely identifies the placement to delete.
    try {
      DeletedEntityResponse result = apiInstance.deletePlacement(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#deletePlacement");
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
 **scope** | **String**| The placement scope. |
 **code** | **String**| The placement&#39;s code. This, together with the scope uniquely identifies the placement to delete. |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The response from deleting an placement. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPlacement"></a>
# **getPlacement**
> Placement getPlacement(scope, code, asAt, propertyKeys)

[EXPERIMENTAL] Get Placement

Fetch a Placement that matches the specified identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:47862");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the placement belongs.
    String code = "code_example"; // String | The placement's unique identifier.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Placement\" domain to decorate onto the placement.              These take the format {domain}/{scope}/{code} e.g. \"Placement/system/Name\".
    try {
      Placement result = apiInstance.getPlacement(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#getPlacement");
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
 **scope** | **String**| The scope to which the placement belongs. |
 **code** | **String**| The placement&#39;s unique identifier. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Placement\&quot; domain to decorate onto the placement.              These take the format {domain}/{scope}/{code} e.g. \&quot;Placement/system/Name\&quot;. | [optional]

### Return type

[**Placement**](Placement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The placement matching the given identifier. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPlacements"></a>
# **listPlacements**
> PagedResourceListOfPlacement listPlacements(asAt, page, sortBy, limit, filter, propertyKeys)

[EXPERIMENTAL] List Placements

Fetch the last pre-AsAt date version of each placement in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:47862");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing placements from a previous call to list placements.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "\"\""; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Placement\" domain to decorate onto each placement.                  These take the format {domain}/{scope}/{code} e.g. \"Placement/system/Name\".
    try {
      PagedResourceListOfPlacement result = apiInstance.listPlacements(asAt, page, sortBy, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#listPlacements");
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
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing placements from a previous call to list placements.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] [default to &quot;&quot;]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Placement\&quot; domain to decorate onto each placement.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Placement/system/Name\&quot;. | [optional]

### Return type

[**PagedResourceListOfPlacement**](PagedResourceListOfPlacement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Placements in scope. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPlacements"></a>
# **upsertPlacements**
> ResourceListOfPlacement upsertPlacements(placementSetRequest)

[EXPERIMENTAL] Upsert Placement

Upsert; update existing placements with given ids, or create new placements otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:47862");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    PlacementSetRequest placementSetRequest = {"requests":[{"id":{"scope":"MyScope","code":"PLAC00000123"},"blockIds":[{"scope":"MyScope","code":"BLOCK00000123"}],"participationIds":[{"scope":"MyScope","code":"PART00000123"}],"properties":{"placement/MyScope/SomePlacementProperty":{"key":"Placement/MyScope/SomePlacementProperty","value":{"labelValue":"XYZ000034567"}}},"instrumentIdentifiers":{"instrument/default/Currency":"GBP"},"quantity":100,"state":"New","side":"Buy","timeInForce":"GoodTilCancel","type":"Limit","createdDate":"2006-04-11T00:00:00.0000000+00:00","limitPrice":{"amount":12413.33,"currency":"USD"},"stopPrice":{"amount":124335.33,"currency":"USD"},"counterparty":"SomeCounterparty"}]}; // PlacementSetRequest | The collection of placement requests.
    try {
      ResourceListOfPlacement result = apiInstance.upsertPlacements(placementSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#upsertPlacements");
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
 **placementSetRequest** | [**PlacementSetRequest**](PlacementSetRequest.md)| The collection of placement requests. | [optional]

### Return type

[**ResourceListOfPlacement**](ResourceListOfPlacement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A collection of placements. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |
