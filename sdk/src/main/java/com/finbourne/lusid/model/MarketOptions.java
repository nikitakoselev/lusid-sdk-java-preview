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

/**
 * The set of options that control miscellaneous and default market resolution behaviour.  These are aimed at a &#39;crude&#39; level of control for those who do not wish to fine tune the way that data is resolved.  For clients who wish to simply match instruments to prices this is quite possibly sufficient. For those wishing to control market data sources  according to requirements based on accuracy or timeliness it is not. In more advanced cases the options should largely be ignored and rules specified  per source. Be aware that where no specified rule matches the final fallback is on to the logic implied here.
 */
@ApiModel(description = "The set of options that control miscellaneous and default market resolution behaviour.  These are aimed at a 'crude' level of control for those who do not wish to fine tune the way that data is resolved.  For clients who wish to simply match instruments to prices this is quite possibly sufficient. For those wishing to control market data sources  according to requirements based on accuracy or timeliness it is not. In more advanced cases the options should largely be ignored and rules specified  per source. Be aware that where no specified rule matches the final fallback is on to the logic implied here.")

public class MarketOptions {
  public static final String SERIALIZED_NAME_DEFAULT_SUPPLIER = "defaultSupplier";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SUPPLIER)
  private String defaultSupplier;

  public static final String SERIALIZED_NAME_DEFAULT_INSTRUMENT_CODE_TYPE = "defaultInstrumentCodeType";
  @SerializedName(SERIALIZED_NAME_DEFAULT_INSTRUMENT_CODE_TYPE)
  private String defaultInstrumentCodeType;

  public static final String SERIALIZED_NAME_DEFAULT_SCOPE = "defaultScope";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SCOPE)
  private String defaultScope;

  public static final String SERIALIZED_NAME_ATTEMPT_TO_INFER_MISSING_FX = "attemptToInferMissingFx";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_TO_INFER_MISSING_FX)
  private Boolean attemptToInferMissingFx;

  public MarketOptions defaultSupplier(String defaultSupplier) {
    this.defaultSupplier = defaultSupplier;
    return this;
  }

   /**
   * The default supplier of data. This controls which &#39;dialect&#39; is used to find particular market data. e.g. one supplier might address data by RIC, another by PermId
   * @return defaultSupplier
  **/
  @ApiModelProperty(value = "The default supplier of data. This controls which 'dialect' is used to find particular market data. e.g. one supplier might address data by RIC, another by PermId")
  public String getDefaultSupplier() {
    return defaultSupplier;
  }

  public void setDefaultSupplier(String defaultSupplier) {
    this.defaultSupplier = defaultSupplier;
  }

  public MarketOptions defaultInstrumentCodeType(String defaultInstrumentCodeType) {
    this.defaultInstrumentCodeType = defaultInstrumentCodeType;
    return this;
  }

   /**
   * When instrument quotes are searched for, what identifier should be used by default
   * @return defaultInstrumentCodeType
  **/
  @ApiModelProperty(value = "When instrument quotes are searched for, what identifier should be used by default")
  public String getDefaultInstrumentCodeType() {
    return defaultInstrumentCodeType;
  }

  public void setDefaultInstrumentCodeType(String defaultInstrumentCodeType) {
    this.defaultInstrumentCodeType = defaultInstrumentCodeType;
  }

  public MarketOptions defaultScope(String defaultScope) {
    this.defaultScope = defaultScope;
    return this;
  }

   /**
   * For default rules, which scope should data be searched for in
   * @return defaultScope
  **/
  @ApiModelProperty(value = "For default rules, which scope should data be searched for in")
  public String getDefaultScope() {
    return defaultScope;
  }

  public void setDefaultScope(String defaultScope) {
    this.defaultScope = defaultScope;
  }

  public MarketOptions attemptToInferMissingFx(Boolean attemptToInferMissingFx) {
    this.attemptToInferMissingFx = attemptToInferMissingFx;
    return this;
  }

   /**
   * if true will calculate a missing Fx pair (e.g. THBJPY) from the inverse JPYTHB or from standardised pairs against USD, e.g. THBUSD and JPYUSD
   * @return attemptToInferMissingFx
  **/
  @ApiModelProperty(value = "if true will calculate a missing Fx pair (e.g. THBJPY) from the inverse JPYTHB or from standardised pairs against USD, e.g. THBUSD and JPYUSD")
  public Boolean getAttemptToInferMissingFx() {
    return attemptToInferMissingFx;
  }

  public void setAttemptToInferMissingFx(Boolean attemptToInferMissingFx) {
    this.attemptToInferMissingFx = attemptToInferMissingFx;
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
    sb.append("class MarketOptions {\n");
    sb.append("    defaultSupplier: ").append(toIndentedString(defaultSupplier)).append("\n");
    sb.append("    defaultInstrumentCodeType: ").append(toIndentedString(defaultInstrumentCodeType)).append("\n");
    sb.append("    defaultScope: ").append(toIndentedString(defaultScope)).append("\n");
    sb.append("    attemptToInferMissingFx: ").append(toIndentedString(attemptToInferMissingFx)).append("\n");
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
