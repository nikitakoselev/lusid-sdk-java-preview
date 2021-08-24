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
import java.util.ArrayList;
import java.util.List;

/**
 * CdsFlowConventions
 */

public class CdsFlowConventions {
  public static final String SERIALIZED_NAME_ROLL_FREQUENCY = "rollFrequency";
  @SerializedName(SERIALIZED_NAME_ROLL_FREQUENCY)
  private String rollFrequency;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PAYMENT_FREQUENCY = "paymentFrequency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FREQUENCY)
  private String paymentFrequency;

  public static final String SERIALIZED_NAME_DAY_COUNT_CONVENTION = "dayCountConvention";
  @SerializedName(SERIALIZED_NAME_DAY_COUNT_CONVENTION)
  private String dayCountConvention;

  public static final String SERIALIZED_NAME_ROLL_CONVENTION = "rollConvention";
  @SerializedName(SERIALIZED_NAME_ROLL_CONVENTION)
  private String rollConvention;

  public static final String SERIALIZED_NAME_PAYMENT_CALENDARS = "paymentCalendars";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CALENDARS)
  private List<String> paymentCalendars = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESET_CALENDARS = "resetCalendars";
  @SerializedName(SERIALIZED_NAME_RESET_CALENDARS)
  private List<String> resetCalendars = new ArrayList<>();

  public static final String SERIALIZED_NAME_SETTLE_DAYS = "settleDays";
  @SerializedName(SERIALIZED_NAME_SETTLE_DAYS)
  private Integer settleDays;

  public static final String SERIALIZED_NAME_RESET_DAYS = "resetDays";
  @SerializedName(SERIALIZED_NAME_RESET_DAYS)
  private Integer resetDays;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public CdsFlowConventions rollFrequency(String rollFrequency) {
    this.rollFrequency = rollFrequency;
    return this;
  }

   /**
   * The frequency at which the reference bonds are updated, this defaults to 6M, but can be 3M, exp for historically issued products
   * @return rollFrequency
  **/
  @ApiModelProperty(value = "The frequency at which the reference bonds are updated, this defaults to 6M, but can be 3M, exp for historically issued products")
  public String getRollFrequency() {
    return rollFrequency;
  }

  public void setRollFrequency(String rollFrequency) {
    this.rollFrequency = rollFrequency;
  }

  public CdsFlowConventions currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the flow convention.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency of the flow convention.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CdsFlowConventions paymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

   /**
   * When generating a multiperiod flow, or when the maturity of the flow is not given but the start date is,  the tenor is the time-step from the anchor-date to the nominal maturity of the flow prior to any adjustment.
   * @return paymentFrequency
  **/
  @ApiModelProperty(required = true, value = "When generating a multiperiod flow, or when the maturity of the flow is not given but the start date is,  the tenor is the time-step from the anchor-date to the nominal maturity of the flow prior to any adjustment.")
  public String getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public CdsFlowConventions dayCountConvention(String dayCountConvention) {
    this.dayCountConvention = dayCountConvention;
    return this;
  }

   /**
   * when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year  and difference between them.  Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActAct, ActualActual, ActActIsda, ActActIsma, ActActIcma].
   * @return dayCountConvention
  **/
  @ApiModelProperty(required = true, value = "when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year  and difference between them.  Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActAct, ActualActual, ActActIsda, ActActIsma, ActActIcma].")
  public String getDayCountConvention() {
    return dayCountConvention;
  }

  public void setDayCountConvention(String dayCountConvention) {
    this.dayCountConvention = dayCountConvention;
  }

  public CdsFlowConventions rollConvention(String rollConvention) {
    this.rollConvention = rollConvention;
    return this;
  }

   /**
   * When generating a set of dates, what convention should be used for adjusting dates that coincide with a non-business day.  Supported string (enumeration) values are: [NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, EndOfMonth, EOM, EndOfMonthPrevious, EOMP, EndOfMonthFollowing, EOMF].
   * @return rollConvention
  **/
  @ApiModelProperty(required = true, value = "When generating a set of dates, what convention should be used for adjusting dates that coincide with a non-business day.  Supported string (enumeration) values are: [NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, EndOfMonth, EOM, EndOfMonthPrevious, EOMP, EndOfMonthFollowing, EOMF].")
  public String getRollConvention() {
    return rollConvention;
  }

  public void setRollConvention(String rollConvention) {
    this.rollConvention = rollConvention;
  }

  public CdsFlowConventions paymentCalendars(List<String> paymentCalendars) {
    this.paymentCalendars = paymentCalendars;
    return this;
  }

  public CdsFlowConventions addPaymentCalendarsItem(String paymentCalendarsItem) {
    this.paymentCalendars.add(paymentCalendarsItem);
    return this;
  }

   /**
   * An array of strings denoting holiday calendars that apply to generation of payment schedules.
   * @return paymentCalendars
  **/
  @ApiModelProperty(required = true, value = "An array of strings denoting holiday calendars that apply to generation of payment schedules.")
  public List<String> getPaymentCalendars() {
    return paymentCalendars;
  }

  public void setPaymentCalendars(List<String> paymentCalendars) {
    this.paymentCalendars = paymentCalendars;
  }

  public CdsFlowConventions resetCalendars(List<String> resetCalendars) {
    this.resetCalendars = resetCalendars;
    return this;
  }

  public CdsFlowConventions addResetCalendarsItem(String resetCalendarsItem) {
    this.resetCalendars.add(resetCalendarsItem);
    return this;
  }

   /**
   * An array of strings denoting holiday calendars that apply to generation of reset schedules.
   * @return resetCalendars
  **/
  @ApiModelProperty(required = true, value = "An array of strings denoting holiday calendars that apply to generation of reset schedules.")
  public List<String> getResetCalendars() {
    return resetCalendars;
  }

  public void setResetCalendars(List<String> resetCalendars) {
    this.resetCalendars = resetCalendars;
  }

  public CdsFlowConventions settleDays(Integer settleDays) {
    this.settleDays = settleDays;
    return this;
  }

   /**
   * Number of Good Business Days between the trade date and the effective or settlement date of the instrument.
   * @return settleDays
  **/
  @ApiModelProperty(required = true, value = "Number of Good Business Days between the trade date and the effective or settlement date of the instrument.")
  public Integer getSettleDays() {
    return settleDays;
  }

  public void setSettleDays(Integer settleDays) {
    this.settleDays = settleDays;
  }

  public CdsFlowConventions resetDays(Integer resetDays) {
    this.resetDays = resetDays;
    return this;
  }

   /**
   * The number of Good Business Days between determination and payment of reset.
   * @return resetDays
  **/
  @ApiModelProperty(required = true, value = "The number of Good Business Days between determination and payment of reset.")
  public Integer getResetDays() {
    return resetDays;
  }

  public void setResetDays(Integer resetDays) {
    this.resetDays = resetDays;
  }

  public CdsFlowConventions scope(String scope) {
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

  public CdsFlowConventions code(String code) {
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
    sb.append("class CdsFlowConventions {\n");
    sb.append("    rollFrequency: ").append(toIndentedString(rollFrequency)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    dayCountConvention: ").append(toIndentedString(dayCountConvention)).append("\n");
    sb.append("    rollConvention: ").append(toIndentedString(rollConvention)).append("\n");
    sb.append("    paymentCalendars: ").append(toIndentedString(paymentCalendars)).append("\n");
    sb.append("    resetCalendars: ").append(toIndentedString(resetCalendars)).append("\n");
    sb.append("    settleDays: ").append(toIndentedString(settleDays)).append("\n");
    sb.append("    resetDays: ").append(toIndentedString(resetDays)).append("\n");
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
