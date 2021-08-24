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


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Property;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A reconciliation break
 */
@ApiModel(description = "A reconciliation break")

public class ReconciliationBreak {
  public static final String SERIALIZED_NAME_INSTRUMENT_UID = "instrumentUid";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_UID)
  private String instrumentUid;

  public static final String SERIALIZED_NAME_SUB_HOLDING_KEYS = "subHoldingKeys";
  @SerializedName(SERIALIZED_NAME_SUB_HOLDING_KEYS)
  private Map<String, PerpetualProperty> subHoldingKeys = new HashMap<>();

  public static final String SERIALIZED_NAME_LEFT_UNITS = "leftUnits";
  @SerializedName(SERIALIZED_NAME_LEFT_UNITS)
  private Double leftUnits;

  public static final String SERIALIZED_NAME_RIGHT_UNITS = "rightUnits";
  @SerializedName(SERIALIZED_NAME_RIGHT_UNITS)
  private Double rightUnits;

  public static final String SERIALIZED_NAME_DIFFERENCE_UNITS = "differenceUnits";
  @SerializedName(SERIALIZED_NAME_DIFFERENCE_UNITS)
  private Double differenceUnits;

  public static final String SERIALIZED_NAME_LEFT_COST = "leftCost";
  @SerializedName(SERIALIZED_NAME_LEFT_COST)
  private CurrencyAndAmount leftCost = null;

  public static final String SERIALIZED_NAME_RIGHT_COST = "rightCost";
  @SerializedName(SERIALIZED_NAME_RIGHT_COST)
  private CurrencyAndAmount rightCost = null;

  public static final String SERIALIZED_NAME_DIFFERENCE_COST = "differenceCost";
  @SerializedName(SERIALIZED_NAME_DIFFERENCE_COST)
  private CurrencyAndAmount differenceCost = null;

  public static final String SERIALIZED_NAME_INSTRUMENT_PROPERTIES = "instrumentProperties";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_PROPERTIES)
  private List<Property> instrumentProperties = new ArrayList<>();

  public ReconciliationBreak instrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
    return this;
  }

   /**
   * Unique instrument identifier
   * @return instrumentUid
  **/
  @ApiModelProperty(required = true, value = "Unique instrument identifier")
  public String getInstrumentUid() {
    return instrumentUid;
  }

  public void setInstrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
  }

  public ReconciliationBreak subHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
    return this;
  }

  public ReconciliationBreak putSubHoldingKeysItem(String key, PerpetualProperty subHoldingKeysItem) {
    this.subHoldingKeys.put(key, subHoldingKeysItem);
    return this;
  }

   /**
   * Any other properties that comprise the Sub-Holding Key
   * @return subHoldingKeys
  **/
  @ApiModelProperty(required = true, value = "Any other properties that comprise the Sub-Holding Key")
  public Map<String, PerpetualProperty> getSubHoldingKeys() {
    return subHoldingKeys;
  }

  public void setSubHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
  }

  public ReconciliationBreak leftUnits(Double leftUnits) {
    this.leftUnits = leftUnits;
    return this;
  }

   /**
   * Units from the left hand side
   * @return leftUnits
  **/
  @ApiModelProperty(required = true, value = "Units from the left hand side")
  public Double getLeftUnits() {
    return leftUnits;
  }

  public void setLeftUnits(Double leftUnits) {
    this.leftUnits = leftUnits;
  }

  public ReconciliationBreak rightUnits(Double rightUnits) {
    this.rightUnits = rightUnits;
    return this;
  }

   /**
   * Units from the right hand side
   * @return rightUnits
  **/
  @ApiModelProperty(required = true, value = "Units from the right hand side")
  public Double getRightUnits() {
    return rightUnits;
  }

  public void setRightUnits(Double rightUnits) {
    this.rightUnits = rightUnits;
  }

  public ReconciliationBreak differenceUnits(Double differenceUnits) {
    this.differenceUnits = differenceUnits;
    return this;
  }

   /**
   * Difference in units
   * @return differenceUnits
  **/
  @ApiModelProperty(required = true, value = "Difference in units")
  public Double getDifferenceUnits() {
    return differenceUnits;
  }

  public void setDifferenceUnits(Double differenceUnits) {
    this.differenceUnits = differenceUnits;
  }

  public ReconciliationBreak leftCost(CurrencyAndAmount leftCost) {
    this.leftCost = leftCost;
    return this;
  }

   /**
   * Get leftCost
   * @return leftCost
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getLeftCost() {
    return leftCost;
  }

  public void setLeftCost(CurrencyAndAmount leftCost) {
    this.leftCost = leftCost;
  }

  public ReconciliationBreak rightCost(CurrencyAndAmount rightCost) {
    this.rightCost = rightCost;
    return this;
  }

   /**
   * Get rightCost
   * @return rightCost
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getRightCost() {
    return rightCost;
  }

  public void setRightCost(CurrencyAndAmount rightCost) {
    this.rightCost = rightCost;
  }

  public ReconciliationBreak differenceCost(CurrencyAndAmount differenceCost) {
    this.differenceCost = differenceCost;
    return this;
  }

   /**
   * Get differenceCost
   * @return differenceCost
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getDifferenceCost() {
    return differenceCost;
  }

  public void setDifferenceCost(CurrencyAndAmount differenceCost) {
    this.differenceCost = differenceCost;
  }

  public ReconciliationBreak instrumentProperties(List<Property> instrumentProperties) {
    this.instrumentProperties = instrumentProperties;
    return this;
  }

  public ReconciliationBreak addInstrumentPropertiesItem(Property instrumentPropertiesItem) {
    this.instrumentProperties.add(instrumentPropertiesItem);
    return this;
  }

   /**
   * Additional features relating to the instrument
   * @return instrumentProperties
  **/
  @ApiModelProperty(required = true, value = "Additional features relating to the instrument")
  public List<Property> getInstrumentProperties() {
    return instrumentProperties;
  }

  public void setInstrumentProperties(List<Property> instrumentProperties) {
    this.instrumentProperties = instrumentProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
    sb.append("class ReconciliationBreak {\n");
    sb.append("    instrumentUid: ").append(toIndentedString(instrumentUid)).append("\n");
    sb.append("    subHoldingKeys: ").append(toIndentedString(subHoldingKeys)).append("\n");
    sb.append("    leftUnits: ").append(toIndentedString(leftUnits)).append("\n");
    sb.append("    rightUnits: ").append(toIndentedString(rightUnits)).append("\n");
    sb.append("    differenceUnits: ").append(toIndentedString(differenceUnits)).append("\n");
    sb.append("    leftCost: ").append(toIndentedString(leftCost)).append("\n");
    sb.append("    rightCost: ").append(toIndentedString(rightCost)).append("\n");
    sb.append("    differenceCost: ").append(toIndentedString(differenceCost)).append("\n");
    sb.append("    instrumentProperties: ").append(toIndentedString(instrumentProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
