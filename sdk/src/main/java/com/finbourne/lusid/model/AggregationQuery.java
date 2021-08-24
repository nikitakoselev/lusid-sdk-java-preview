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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * AggregationQuery
 */

public class AggregationQuery {
  public static final String SERIALIZED_NAME_ADDRESS_KEY = "addressKey";
  @SerializedName(SERIALIZED_NAME_ADDRESS_KEY)
  private String addressKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Array, Map, Json
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("String"),
    
    INT("Int"),
    
    DECIMAL("Decimal"),
    
    DATETIME("DateTime"),
    
    BOOLEAN("Boolean"),
    
    RESULTVALUE("ResultValue"),
    
    ARRAY("Array"),
    
    MAP("Map"),
    
    JSON("Json");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SCALES_WITH_HOLDING_QUANTITY = "scalesWithHoldingQuantity";
  @SerializedName(SERIALIZED_NAME_SCALES_WITH_HOLDING_QUANTITY)
  private Boolean scalesWithHoldingQuantity;

  public static final String SERIALIZED_NAME_SUPPORTED_OPERATIONS = "supportedOperations";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_OPERATIONS)
  private String supportedOperations;

  public static final String SERIALIZED_NAME_LIFE_CYCLE_STATUS = "lifeCycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFE_CYCLE_STATUS)
  private String lifeCycleStatus;

  public static final String SERIALIZED_NAME_REMOVAL_DATE = "removalDate";
  @SerializedName(SERIALIZED_NAME_REMOVAL_DATE)
  private OffsetDateTime removalDate;

  public AggregationQuery addressKey(String addressKey) {
    this.addressKey = addressKey;
    return this;
  }

   /**
   * The address that is the query to be made into the system. e.g. a Valuation/Pv or Instrument/MaturityDate
   * @return addressKey
  **/
  @ApiModelProperty(required = true, value = "The address that is the query to be made into the system. e.g. a Valuation/Pv or Instrument/MaturityDate")
  public String getAddressKey() {
    return addressKey;
  }

  public void setAddressKey(String addressKey) {
    this.addressKey = addressKey;
  }

  public AggregationQuery description(String description) {
    this.description = description;
    return this;
  }

   /**
   * What does the information that is being queried by the address mean. What is the address for.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "What does the information that is being queried by the address mean. What is the address for.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AggregationQuery displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The suggested name that the user would wish to put on to the returned information for visualisation in preference to the address.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The suggested name that the user would wish to put on to the returned information for visualisation in preference to the address.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AggregationQuery type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Array, Map, Json
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Array, Map, Json")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AggregationQuery scalesWithHoldingQuantity(Boolean scalesWithHoldingQuantity) {
    this.scalesWithHoldingQuantity = scalesWithHoldingQuantity;
    return this;
  }

   /**
   * Is the data scaled when it is for, e.g. a holding in an instrument. A key example would be the difference between price and pv. The present value  of an instrument would scale with the quantity held. The price would be that for a hypothetical unit of that instrument, typically associated with the  contract size.
   * @return scalesWithHoldingQuantity
  **/
  @ApiModelProperty(required = true, value = "Is the data scaled when it is for, e.g. a holding in an instrument. A key example would be the difference between price and pv. The present value  of an instrument would scale with the quantity held. The price would be that for a hypothetical unit of that instrument, typically associated with the  contract size.")
  public Boolean getScalesWithHoldingQuantity() {
    return scalesWithHoldingQuantity;
  }

  public void setScalesWithHoldingQuantity(Boolean scalesWithHoldingQuantity) {
    this.scalesWithHoldingQuantity = scalesWithHoldingQuantity;
  }

  public AggregationQuery supportedOperations(String supportedOperations) {
    this.supportedOperations = supportedOperations;
    return this;
  }

   /**
   * When performing an aggregation operation, what column type operations can be performed on the data. For example, it makes sense to sum decimals but  not strings. Either can be counted. With more complex types, e.g. ResultValues, operations may be linked to a semantic meaning such as the currency  of the result. In such cases the operations may be supported but context specific. For example, it makes sense to sum PVs in a single currency but not  when the currency is different. In such cases, an error would result (it being assumed that no fx rates for currency conversion were implicit in the context).
   * @return supportedOperations
  **/
  @ApiModelProperty(required = true, value = "When performing an aggregation operation, what column type operations can be performed on the data. For example, it makes sense to sum decimals but  not strings. Either can be counted. With more complex types, e.g. ResultValues, operations may be linked to a semantic meaning such as the currency  of the result. In such cases the operations may be supported but context specific. For example, it makes sense to sum PVs in a single currency but not  when the currency is different. In such cases, an error would result (it being assumed that no fx rates for currency conversion were implicit in the context).")
  public String getSupportedOperations() {
    return supportedOperations;
  }

  public void setSupportedOperations(String supportedOperations) {
    this.supportedOperations = supportedOperations;
  }

  public AggregationQuery lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * Within an API where an item can be accessed through an address or property, there is an associated status that determines  whether the item is stable or likely to change. This status is one of [Experimental, Beta, EAP, Prod,  Deprecated]. If the item is  deprecated it will be removed on or after the associated DateTime RemovalDate field. That field will not otherwise be set.
   * @return lifeCycleStatus
  **/
  @ApiModelProperty(required = true, value = "Within an API where an item can be accessed through an address or property, there is an associated status that determines  whether the item is stable or likely to change. This status is one of [Experimental, Beta, EAP, Prod,  Deprecated]. If the item is  deprecated it will be removed on or after the associated DateTime RemovalDate field. That field will not otherwise be set.")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public AggregationQuery removalDate(OffsetDateTime removalDate) {
    this.removalDate = removalDate;
    return this;
  }

   /**
   * If the life cycle status is set to deprecated then this will be populated with the date on or after which removal of the address query will happen
   * @return removalDate
  **/
  @ApiModelProperty(required = true, value = "If the life cycle status is set to deprecated then this will be populated with the date on or after which removal of the address query will happen")
  public OffsetDateTime getRemovalDate() {
    return removalDate;
  }

  public void setRemovalDate(OffsetDateTime removalDate) {
    this.removalDate = removalDate;
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
    sb.append("class AggregationQuery {\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scalesWithHoldingQuantity: ").append(toIndentedString(scalesWithHoldingQuantity)).append("\n");
    sb.append("    supportedOperations: ").append(toIndentedString(supportedOperations)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    removalDate: ").append(toIndentedString(removalDate)).append("\n");
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
