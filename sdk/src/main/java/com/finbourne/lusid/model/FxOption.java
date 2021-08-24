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
import com.finbourne.lusid.model.FxOptionAllOf;
import com.finbourne.lusid.model.LusidInstrument;
import com.finbourne.lusid.model.Premium;
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
 * Lusid-ibor internal representation of a plain vanilla FX Option instrument.
 */
@ApiModel(description = "Lusid-ibor internal representation of a plain vanilla FX Option instrument.")

public class FxOption extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_OPTION_MATURITY_DATE = "optionMaturityDate";
  @SerializedName(SERIALIZED_NAME_OPTION_MATURITY_DATE)
  private OffsetDateTime optionMaturityDate;

  public static final String SERIALIZED_NAME_OPTION_SETTLEMENT_DATE = "optionSettlementDate";
  @SerializedName(SERIALIZED_NAME_OPTION_SETTLEMENT_DATE)
  private OffsetDateTime optionSettlementDate;

  public static final String SERIALIZED_NAME_IS_DELIVERY_NOT_CASH = "isDeliveryNotCash";
  @SerializedName(SERIALIZED_NAME_IS_DELIVERY_NOT_CASH)
  private Boolean isDeliveryNotCash;

  public static final String SERIALIZED_NAME_IS_CALL_NOT_PUT = "isCallNotPut";
  @SerializedName(SERIALIZED_NAME_IS_CALL_NOT_PUT)
  private Boolean isCallNotPut;

  public static final String SERIALIZED_NAME_STRIKE = "strike";
  @SerializedName(SERIALIZED_NAME_STRIKE)
  private Double strike;

  public static final String SERIALIZED_NAME_DOM_CCY = "domCcy";
  @SerializedName(SERIALIZED_NAME_DOM_CCY)
  private String domCcy;

  public static final String SERIALIZED_NAME_FGN_CCY = "fgnCcy";
  @SerializedName(SERIALIZED_NAME_FGN_CCY)
  private String fgnCcy;

  public static final String SERIALIZED_NAME_PREMIUM = "premium";
  @SerializedName(SERIALIZED_NAME_PREMIUM)
  private Premium premium = null;

  public FxOption startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the instrument. This is normally synonymous with the trade-date.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The start date of the instrument. This is normally synonymous with the trade-date.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public FxOption optionMaturityDate(OffsetDateTime optionMaturityDate) {
    this.optionMaturityDate = optionMaturityDate;
    return this;
  }

   /**
   * The maturity date of the option.
   * @return optionMaturityDate
  **/
  @ApiModelProperty(required = true, value = "The maturity date of the option.")
  public OffsetDateTime getOptionMaturityDate() {
    return optionMaturityDate;
  }

  public void setOptionMaturityDate(OffsetDateTime optionMaturityDate) {
    this.optionMaturityDate = optionMaturityDate;
  }

  public FxOption optionSettlementDate(OffsetDateTime optionSettlementDate) {
    this.optionSettlementDate = optionSettlementDate;
    return this;
  }

   /**
   * The settlement date of the option.
   * @return optionSettlementDate
  **/
  @ApiModelProperty(required = true, value = "The settlement date of the option.")
  public OffsetDateTime getOptionSettlementDate() {
    return optionSettlementDate;
  }

  public void setOptionSettlementDate(OffsetDateTime optionSettlementDate) {
    this.optionSettlementDate = optionSettlementDate;
  }

  public FxOption isDeliveryNotCash(Boolean isDeliveryNotCash) {
    this.isDeliveryNotCash = isDeliveryNotCash;
    return this;
  }

   /**
   * True of the option is settled in cash false if delivery.
   * @return isDeliveryNotCash
  **/
  @ApiModelProperty(required = true, value = "True of the option is settled in cash false if delivery.")
  public Boolean getIsDeliveryNotCash() {
    return isDeliveryNotCash;
  }

  public void setIsDeliveryNotCash(Boolean isDeliveryNotCash) {
    this.isDeliveryNotCash = isDeliveryNotCash;
  }

  public FxOption isCallNotPut(Boolean isCallNotPut) {
    this.isCallNotPut = isCallNotPut;
    return this;
  }

   /**
   * True if the option is a call, false if the option is a put.
   * @return isCallNotPut
  **/
  @ApiModelProperty(required = true, value = "True if the option is a call, false if the option is a put.")
  public Boolean getIsCallNotPut() {
    return isCallNotPut;
  }

  public void setIsCallNotPut(Boolean isCallNotPut) {
    this.isCallNotPut = isCallNotPut;
  }

  public FxOption strike(Double strike) {
    this.strike = strike;
    return this;
  }

   /**
   * The strike of the option.
   * @return strike
  **/
  @ApiModelProperty(required = true, value = "The strike of the option.")
  public Double getStrike() {
    return strike;
  }

  public void setStrike(Double strike) {
    this.strike = strike;
  }

  public FxOption domCcy(String domCcy) {
    this.domCcy = domCcy;
    return this;
  }

   /**
   * The domestic currency of the instrument.
   * @return domCcy
  **/
  @ApiModelProperty(required = true, value = "The domestic currency of the instrument.")
  public String getDomCcy() {
    return domCcy;
  }

  public void setDomCcy(String domCcy) {
    this.domCcy = domCcy;
  }

  public FxOption fgnCcy(String fgnCcy) {
    this.fgnCcy = fgnCcy;
    return this;
  }

   /**
   * The foreign currency of the FX.
   * @return fgnCcy
  **/
  @ApiModelProperty(required = true, value = "The foreign currency of the FX.")
  public String getFgnCcy() {
    return fgnCcy;
  }

  public void setFgnCcy(String fgnCcy) {
    this.fgnCcy = fgnCcy;
  }

  public FxOption premium(Premium premium) {
    this.premium = premium;
    return this;
  }

   /**
   * Get premium
   * @return premium
  **/
  @ApiModelProperty(value = "")
  public Premium getPremium() {
    return premium;
  }

  public void setPremium(Premium premium) {
    this.premium = premium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FxOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    optionMaturityDate: ").append(toIndentedString(optionMaturityDate)).append("\n");
    sb.append("    optionSettlementDate: ").append(toIndentedString(optionSettlementDate)).append("\n");
    sb.append("    isDeliveryNotCash: ").append(toIndentedString(isDeliveryNotCash)).append("\n");
    sb.append("    isCallNotPut: ").append(toIndentedString(isCallNotPut)).append("\n");
    sb.append("    strike: ").append(toIndentedString(strike)).append("\n");
    sb.append("    domCcy: ").append(toIndentedString(domCcy)).append("\n");
    sb.append("    fgnCcy: ").append(toIndentedString(fgnCcy)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
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
