/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3475
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateDerivedTransactionPortfolioRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDerivedTransactionPortfolioRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_PARENT_PORTFOLIO_ID = "parentPortfolioId";
  @SerializedName(SERIALIZED_NAME_PARENT_PORTFOLIO_ID)
  private ResourceId parentPortfolioId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CORPORATE_ACTION_SOURCE_ID = "corporateActionSourceId";
  @SerializedName(SERIALIZED_NAME_CORPORATE_ACTION_SOURCE_ID)
  private ResourceId corporateActionSourceId;

  /**
   * The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst
   */
  @JsonAdapter(AccountingMethodEnum.Adapter.class)
  public enum AccountingMethodEnum {
    DEFAULT("Default"),
    
    AVERAGECOST("AverageCost"),
    
    FIRSTINFIRSTOUT("FirstInFirstOut"),
    
    LASTINFIRSTOUT("LastInFirstOut"),
    
    HIGHESTCOSTFIRST("HighestCostFirst"),
    
    LOWESTCOSTFIRST("LowestCostFirst");

    private String value;

    AccountingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountingMethodEnum fromValue(String value) {
      for (AccountingMethodEnum b : AccountingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountingMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNTING_METHOD = "accountingMethod";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_METHOD)
  private AccountingMethodEnum accountingMethod;

  public static final String SERIALIZED_NAME_SUB_HOLDING_KEYS = "subHoldingKeys";
  @SerializedName(SERIALIZED_NAME_SUB_HOLDING_KEYS)
  private List<String> subHoldingKeys = null;


  public CreateDerivedTransactionPortfolioRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateDerivedTransactionPortfolioRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateDerivedTransactionPortfolioRequest code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public CreateDerivedTransactionPortfolioRequest parentPortfolioId(ResourceId parentPortfolioId) {
    this.parentPortfolioId = parentPortfolioId; 
    return this;
  }

   /**
   * Get parentPortfolioId
   * @return parentPortfolioId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getParentPortfolioId() {
    return parentPortfolioId;
  }

  public void setParentPortfolioId(ResourceId parentPortfolioId) {
    this.parentPortfolioId = parentPortfolioId;
  }


  public CreateDerivedTransactionPortfolioRequest created(OffsetDateTime created) {
    this.created = created; 
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CreateDerivedTransactionPortfolioRequest corporateActionSourceId(ResourceId corporateActionSourceId) {
    this.corporateActionSourceId = corporateActionSourceId; 
    return this;
  }

   /**
   * Get corporateActionSourceId
   * @return corporateActionSourceId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getCorporateActionSourceId() {
    return corporateActionSourceId;
  }

  public void setCorporateActionSourceId(ResourceId corporateActionSourceId) {
    this.corporateActionSourceId = corporateActionSourceId;
  }


  public CreateDerivedTransactionPortfolioRequest accountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod; 
    return this;
  }

   /**
   * The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst
   * @return accountingMethod
  **/
  @ApiModelProperty(value = "The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst")
  public AccountingMethodEnum getAccountingMethod() {
    return accountingMethod;
  }

  public void setAccountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod;
  }


  public CreateDerivedTransactionPortfolioRequest subHoldingKeys(List<String> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys; 
    return this;
  }

  public CreateDerivedTransactionPortfolioRequest addSubHoldingKeysItem(String subHoldingKeysItem) {
   
    if (this.subHoldingKeys == null) {
      this.subHoldingKeys = new ArrayList<>();
    }
    this.subHoldingKeys.add(subHoldingKeysItem);
    return this;
  }

   /**
   * Get subHoldingKeys
   * @return subHoldingKeys
  **/
  @ApiModelProperty(value = "")
  public List<String> getSubHoldingKeys() {
    return subHoldingKeys;
  }

  public void setSubHoldingKeys(List<String> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDerivedTransactionPortfolioRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    parentPortfolioId: ").append(toIndentedString(parentPortfolioId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    corporateActionSourceId: ").append(toIndentedString(corporateActionSourceId)).append("\n");
    sb.append("    accountingMethod: ").append(toIndentedString(accountingMethod)).append("\n");
    sb.append("    subHoldingKeys: ").append(toIndentedString(subHoldingKeys)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
