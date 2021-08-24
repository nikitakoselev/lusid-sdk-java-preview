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
import com.finbourne.lusid.model.DateAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateDateRequest
 */

public class CreateDateRequest {
  public static final String SERIALIZED_NAME_DATE_ID = "dateId";
  @SerializedName(SERIALIZED_NAME_DATE_ID)
  private String dateId;

  public static final String SERIALIZED_NAME_FROM_UTC = "fromUtc";
  @SerializedName(SERIALIZED_NAME_FROM_UTC)
  private OffsetDateTime fromUtc;

  public static final String SERIALIZED_NAME_TO_UTC = "toUtc";
  @SerializedName(SERIALIZED_NAME_TO_UTC)
  private OffsetDateTime toUtc;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private DateAttributes attributes = null;

  public static final String SERIALIZED_NAME_SOURCE_DATA = "sourceData";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA)
  private Map<String, String> sourceData = new HashMap<>();

  public CreateDateRequest dateId(String dateId) {
    this.dateId = dateId;
    return this;
  }

   /**
   * Get dateId
   * @return dateId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDateId() {
    return dateId;
  }

  public void setDateId(String dateId) {
    this.dateId = dateId;
  }

  public CreateDateRequest fromUtc(OffsetDateTime fromUtc) {
    this.fromUtc = fromUtc;
    return this;
  }

   /**
   * Get fromUtc
   * @return fromUtc
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getFromUtc() {
    return fromUtc;
  }

  public void setFromUtc(OffsetDateTime fromUtc) {
    this.fromUtc = fromUtc;
  }

  public CreateDateRequest toUtc(OffsetDateTime toUtc) {
    this.toUtc = toUtc;
    return this;
  }

   /**
   * Get toUtc
   * @return toUtc
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getToUtc() {
    return toUtc;
  }

  public void setToUtc(OffsetDateTime toUtc) {
    this.toUtc = toUtc;
  }

  public CreateDateRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public CreateDateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateDateRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateDateRequest attributes(DateAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public DateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DateAttributes attributes) {
    this.attributes = attributes;
  }

  public CreateDateRequest sourceData(Map<String, String> sourceData) {
    this.sourceData = sourceData;
    return this;
  }

  public CreateDateRequest putSourceDataItem(String key, String sourceDataItem) {
    if (this.sourceData == null) {
      this.sourceData = new HashMap<>();
    }
    this.sourceData.put(key, sourceDataItem);
    return this;
  }

   /**
   * Get sourceData
   * @return sourceData
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getSourceData() {
    return sourceData;
  }

  public void setSourceData(Map<String, String> sourceData) {
    this.sourceData = sourceData;
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
    sb.append("class CreateDateRequest {\n");
    sb.append("    dateId: ").append(toIndentedString(dateId)).append("\n");
    sb.append("    fromUtc: ").append(toIndentedString(fromUtc)).append("\n");
    sb.append("    toUtc: ").append(toIndentedString(toUtc)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
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
