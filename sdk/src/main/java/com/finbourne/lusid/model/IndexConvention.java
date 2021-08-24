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
 * A set of conventions that describe the conventions for calculation of payments made on rates interbank lending and similar.  Based on ISDA 2006 conventions and similar documentation. Please see the knowledge base for further documentation.
 */
@ApiModel(description = "A set of conventions that describe the conventions for calculation of payments made on rates interbank lending and similar.  Based on ISDA 2006 conventions and similar documentation. Please see the knowledge base for further documentation.")

public class IndexConvention {
  public static final String SERIALIZED_NAME_FIXING_REFERENCE = "fixingReference";
  @SerializedName(SERIALIZED_NAME_FIXING_REFERENCE)
  private String fixingReference;

  public static final String SERIALIZED_NAME_PUBLICATION_DAY_LAG = "publicationDayLag";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DAY_LAG)
  private Integer publicationDayLag;

  public static final String SERIALIZED_NAME_PAYMENT_TENOR = "paymentTenor";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TENOR)
  private String paymentTenor;

  public static final String SERIALIZED_NAME_DAY_COUNT_CONVENTION = "dayCountConvention";
  @SerializedName(SERIALIZED_NAME_DAY_COUNT_CONVENTION)
  private String dayCountConvention;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public IndexConvention fixingReference(String fixingReference) {
    this.fixingReference = fixingReference;
    return this;
  }

   /**
   * The reference rate name for fixings
   * @return fixingReference
  **/
  @ApiModelProperty(required = true, value = "The reference rate name for fixings")
  public String getFixingReference() {
    return fixingReference;
  }

  public void setFixingReference(String fixingReference) {
    this.fixingReference = fixingReference;
  }

  public IndexConvention publicationDayLag(Integer publicationDayLag) {
    this.publicationDayLag = publicationDayLag;
    return this;
  }

   /**
   * Number of days between spot and publication of the rate.
   * @return publicationDayLag
  **/
  @ApiModelProperty(required = true, value = "Number of days between spot and publication of the rate.")
  public Integer getPublicationDayLag() {
    return publicationDayLag;
  }

  public void setPublicationDayLag(Integer publicationDayLag) {
    this.publicationDayLag = publicationDayLag;
  }

  public IndexConvention paymentTenor(String paymentTenor) {
    this.paymentTenor = paymentTenor;
    return this;
  }

   /**
   * The tenor of the payment. For an OIS index this is always 1 day. For other indices, e.g. LIBOR it will have a variable tenor typically between 1 day and 1 year.
   * @return paymentTenor
  **/
  @ApiModelProperty(required = true, value = "The tenor of the payment. For an OIS index this is always 1 day. For other indices, e.g. LIBOR it will have a variable tenor typically between 1 day and 1 year.")
  public String getPaymentTenor() {
    return paymentTenor;
  }

  public void setPaymentTenor(String paymentTenor) {
    this.paymentTenor = paymentTenor;
  }

  public IndexConvention dayCountConvention(String dayCountConvention) {
    this.dayCountConvention = dayCountConvention;
    return this;
  }

   /**
   * when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year              and difference between them.  Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365].
   * @return dayCountConvention
  **/
  @ApiModelProperty(required = true, value = "when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year              and difference between them.  Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365].")
  public String getDayCountConvention() {
    return dayCountConvention;
  }

  public void setDayCountConvention(String dayCountConvention) {
    this.dayCountConvention = dayCountConvention;
  }

  public IndexConvention currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the index convention.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency of the index convention.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public IndexConvention scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope used when updating or inserting the convention.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope used when updating or inserting the convention.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public IndexConvention code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the convention.
   * @return code
  **/
  @ApiModelProperty(value = "The code of the convention.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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
    sb.append("class IndexConvention {\n");
    sb.append("    fixingReference: ").append(toIndentedString(fixingReference)).append("\n");
    sb.append("    publicationDayLag: ").append(toIndentedString(publicationDayLag)).append("\n");
    sb.append("    paymentTenor: ").append(toIndentedString(paymentTenor)).append("\n");
    sb.append("    dayCountConvention: ").append(toIndentedString(dayCountConvention)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
