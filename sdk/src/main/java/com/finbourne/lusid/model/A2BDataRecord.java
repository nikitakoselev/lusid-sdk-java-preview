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
import com.finbourne.lusid.model.A2BCategory;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A2B Record - shows values on, and changes between two dates: A and B
 */
@ApiModel(description = "A2B Record - shows values on, and changes between two dates: A and B")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class A2BDataRecord {
  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private ResourceId portfolioId;

  public static final String SERIALIZED_NAME_HOLDING_TYPE = "holdingType";
  @SerializedName(SERIALIZED_NAME_HOLDING_TYPE)
  private String holdingType;

  public static final String SERIALIZED_NAME_INSTRUMENT_UID = "instrumentUid";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_UID)
  private String instrumentUid;

  public static final String SERIALIZED_NAME_SUB_HOLDING_KEYS = "subHoldingKeys";
  @SerializedName(SERIALIZED_NAME_SUB_HOLDING_KEYS)
  private Map<String, PerpetualProperty> subHoldingKeys = null;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private A2BCategory start;

  public static final String SERIALIZED_NAME_FLOWS = "flows";
  @SerializedName(SERIALIZED_NAME_FLOWS)
  private A2BCategory flows;

  public static final String SERIALIZED_NAME_GAINS = "gains";
  @SerializedName(SERIALIZED_NAME_GAINS)
  private A2BCategory gains;

  public static final String SERIALIZED_NAME_CARRY = "carry";
  @SerializedName(SERIALIZED_NAME_CARRY)
  private A2BCategory carry;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private A2BCategory end;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;


  public A2BDataRecord portfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId; 
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
  }


  public A2BDataRecord holdingType(String holdingType) {
    this.holdingType = holdingType; 
    return this;
  }

   /**
   * The type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc.
   * @return holdingType
  **/
  @ApiModelProperty(value = "The type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc.")
  public String getHoldingType() {
    return holdingType;
  }

  public void setHoldingType(String holdingType) {
    this.holdingType = holdingType;
  }


  public A2BDataRecord instrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid; 
    return this;
  }

   /**
   * The unique Lusid Instrument Id (LUID) of the instrument that the holding is in.
   * @return instrumentUid
  **/
  @ApiModelProperty(value = "The unique Lusid Instrument Id (LUID) of the instrument that the holding is in.")
  public String getInstrumentUid() {
    return instrumentUid;
  }

  public void setInstrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
  }


  public A2BDataRecord subHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys; 
    return this;
  }

  public A2BDataRecord putSubHoldingKeysItem(String key, PerpetualProperty subHoldingKeysItem) {
    if (this.subHoldingKeys == null) {
      this.subHoldingKeys = new HashMap<>();
    }
    this.subHoldingKeys.put(key, subHoldingKeysItem);
    return this;
  }

   /**
   * The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured when a transaction portfolio is created.
   * @return subHoldingKeys
  **/
  @ApiModelProperty(value = "The sub-holding properties which identify the holding. Each property will be from the 'Transaction' domain. These are configured when a transaction portfolio is created.")
  public Map<String, PerpetualProperty> getSubHoldingKeys() {
    return subHoldingKeys;
  }

  public void setSubHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
  }


  public A2BDataRecord currency(String currency) {
    this.currency = currency; 
    return this;
  }

   /**
   * The holding currency.
   * @return currency
  **/
  @ApiModelProperty(value = "The holding currency.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public A2BDataRecord transactionId(String transactionId) {
    this.transactionId = transactionId; 
    return this;
  }

   /**
   * The unique identifier for the transaction.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The unique identifier for the transaction.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public A2BDataRecord start(A2BCategory start) {
    this.start = start; 
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public A2BCategory getStart() {
    return start;
  }

  public void setStart(A2BCategory start) {
    this.start = start;
  }


  public A2BDataRecord flows(A2BCategory flows) {
    this.flows = flows; 
    return this;
  }

   /**
   * Get flows
   * @return flows
  **/
  @ApiModelProperty(value = "")
  public A2BCategory getFlows() {
    return flows;
  }

  public void setFlows(A2BCategory flows) {
    this.flows = flows;
  }


  public A2BDataRecord gains(A2BCategory gains) {
    this.gains = gains; 
    return this;
  }

   /**
   * Get gains
   * @return gains
  **/
  @ApiModelProperty(value = "")
  public A2BCategory getGains() {
    return gains;
  }

  public void setGains(A2BCategory gains) {
    this.gains = gains;
  }


  public A2BDataRecord carry(A2BCategory carry) {
    this.carry = carry; 
    return this;
  }

   /**
   * Get carry
   * @return carry
  **/
  @ApiModelProperty(value = "")
  public A2BCategory getCarry() {
    return carry;
  }

  public void setCarry(A2BCategory carry) {
    this.carry = carry;
  }


  public A2BDataRecord end(A2BCategory end) {
    this.end = end; 
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public A2BCategory getEnd() {
    return end;
  }

  public void setEnd(A2BCategory end) {
    this.end = end;
  }


  public A2BDataRecord properties(Map<String, Property> properties) {
    this.properties = properties; 
    return this;
  }

  public A2BDataRecord putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties which have been requested to be decorated onto the holding. These will be from the 'Instrument' domain.")
  public Map<String, Property> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public A2BDataRecord groupId(String groupId) {
    this.groupId = groupId; 
    return this;
  }

   /**
   * Arbitrary string that can be used to cross reference an entry in the A2B report with activity in the A2B-Movements. This should be used purely as a token. The content should not be relied upon.
   * @return groupId
  **/
  @ApiModelProperty(value = "Arbitrary string that can be used to cross reference an entry in the A2B report with activity in the A2B-Movements. This should be used purely as a token. The content should not be relied upon.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
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
    sb.append("class A2BDataRecord {\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    holdingType: ").append(toIndentedString(holdingType)).append("\n");
    sb.append("    instrumentUid: ").append(toIndentedString(instrumentUid)).append("\n");
    sb.append("    subHoldingKeys: ").append(toIndentedString(subHoldingKeys)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
    sb.append("    gains: ").append(toIndentedString(gains)).append("\n");
    sb.append("    carry: ").append(toIndentedString(carry)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
