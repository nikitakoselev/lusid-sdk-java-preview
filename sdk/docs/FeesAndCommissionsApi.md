# FeesAndCommissionsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:39701*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicableFees**](FeesAndCommissionsApi.md#getApplicableFees) | **GET** /api/feesandcommissions | [EXPERIMENTAL] Get the Fees and Commissions that may be applicable to a transaction.


<a name="getApplicableFees"></a>
# **getApplicableFees**
> ResourceListOfFeeCalculationDetails getApplicableFees(instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, additionalSearchKeys)

[EXPERIMENTAL] Get the Fees and Commissions that may be applicable to a transaction.

Additionally, matching can be based on the instrument&#39;s properties, its portfolio properties, and any additional property keys present in the data file.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.FeesAndCommissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:39701");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeesAndCommissionsApi apiInstance = new FeesAndCommissionsApi(defaultClient);
    String instrumentIdentifierType = "instrumentIdentifierType_example"; // String | Optional. The unique identifier type to use, eg 'Figi' or 'LusidInstrumentId'.
    String instrumentIdentifier = "instrumentIdentifier_example"; // String | Optional. The Instrument Identifier to get properties for.
    String portfolioScope = "portfolioScope_example"; // String | Optional. The scope of the portfolio to fetch additional properties from.
    String portfolioCode = "portfolioCode_example"; // String | Optional. The code of the portfolio to fetch additional properties from.
    List<String> additionalSearchKeys = Arrays.asList(); // List<String> | Any other property keys or fields and their corresponding values that should be matched for fees. Eg. \"Instrument/default/Name=exampleValue\" or \"AdditionalKey2=Value2\".              The list of fields available is as follows : \"RuleName\", \"Country\", \"FeeType\", \"FeeRate\", \"MinFee\", \"MaxFee\", \"PropertyKey\",               \"TransactionType\", \"Counterparty\", \"SettlementCurrency\", \"TransactionCurrency\", \"ExecutionBroker\",               \"Custodian\", \"Exchange\"
    try {
      ResourceListOfFeeCalculationDetails result = apiInstance.getApplicableFees(instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, additionalSearchKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeesAndCommissionsApi#getApplicableFees");
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
 **instrumentIdentifierType** | **String**| Optional. The unique identifier type to use, eg &#39;Figi&#39; or &#39;LusidInstrumentId&#39;. | [optional]
 **instrumentIdentifier** | **String**| Optional. The Instrument Identifier to get properties for. | [optional]
 **portfolioScope** | **String**| Optional. The scope of the portfolio to fetch additional properties from. | [optional]
 **portfolioCode** | **String**| Optional. The code of the portfolio to fetch additional properties from. | [optional]
 **additionalSearchKeys** | [**List&lt;String&gt;**](String.md)| Any other property keys or fields and their corresponding values that should be matched for fees. Eg. \&quot;Instrument/default/Name&#x3D;exampleValue\&quot; or \&quot;AdditionalKey2&#x3D;Value2\&quot;.              The list of fields available is as follows : \&quot;RuleName\&quot;, \&quot;Country\&quot;, \&quot;FeeType\&quot;, \&quot;FeeRate\&quot;, \&quot;MinFee\&quot;, \&quot;MaxFee\&quot;, \&quot;PropertyKey\&quot;,               \&quot;TransactionType\&quot;, \&quot;Counterparty\&quot;, \&quot;SettlementCurrency\&quot;, \&quot;TransactionCurrency\&quot;, \&quot;ExecutionBroker\&quot;,               \&quot;Custodian\&quot;, \&quot;Exchange\&quot; | [optional]

### Return type

[**ResourceListOfFeeCalculationDetails**](ResourceListOfFeeCalculationDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The List of applicable fee calculations details |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |
