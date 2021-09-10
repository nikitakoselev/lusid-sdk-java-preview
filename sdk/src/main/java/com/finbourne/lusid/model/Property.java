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
import com.finbourne.lusid.model.PropertyValue;
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
 * Property
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Property {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private PropertyValue value;

  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private OffsetDateTime effectiveFrom;

  public static final String SERIALIZED_NAME_EFFECTIVE_UNTIL = "effectiveUntil";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_UNTIL)
  private OffsetDateTime effectiveUntil;


  public Property key(String key) {
    this.key = key; 
    return this;
  }

   /**
   * The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key of the property. This takes the format {domain}/{scope}/{code} e.g. 'Instrument/system/Name' or 'Transaction/strategy/quantsignal'.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public Property value(PropertyValue value) {
    this.value = value; 
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public PropertyValue getValue() {
    return value;
  }

  public void setValue(PropertyValue value) {
    this.value = value;
  }


  public Property effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom; 
    return this;
  }

   /**
   * The effective datetime from which the property is valid.
   * @return effectiveFrom
  **/
  @ApiModelProperty(value = "The effective datetime from which the property is valid.")
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }


  public Property effectiveUntil(OffsetDateTime effectiveUntil) {
    this.effectiveUntil = effectiveUntil; 
    return this;
  }

   /**
   * The effective datetime until which the property is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the property.
   * @return effectiveUntil
  **/
  @ApiModelProperty(value = "The effective datetime until which the property is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveFrom' datetime of the property.")
  public OffsetDateTime getEffectiveUntil() {
    return effectiveUntil;
  }

  public void setEffectiveUntil(OffsetDateTime effectiveUntil) {
    this.effectiveUntil = effectiveUntil;
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
    sb.append("class Property {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveUntil: ").append(toIndentedString(effectiveUntil)).append("\n");
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
