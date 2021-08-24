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
 * Specification class consisting of parameters for BucketedCashFlow endpoint.
 */
@ApiModel(description = "Specification class consisting of parameters for BucketedCashFlow endpoint.")

public class BucketedCashFlowRequest {
  public static final String SERIALIZED_NAME_ROUNDING_METHOD = "roundingMethod";
  @SerializedName(SERIALIZED_NAME_ROUNDING_METHOD)
  private String roundingMethod;

  public static final String SERIALIZED_NAME_BUCKETING_DATES = "bucketingDates";
  @SerializedName(SERIALIZED_NAME_BUCKETING_DATES)
  private List<OffsetDateTime> bucketingDates = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUCKET_TENORS = "bucketTenors";
  @SerializedName(SERIALIZED_NAME_BUCKET_TENORS)
  private List<String> bucketTenors = new ArrayList<>();

  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private String effectiveAt;

  public static final String SERIALIZED_NAME_WINDOW_START = "windowStart";
  @SerializedName(SERIALIZED_NAME_WINDOW_START)
  private String windowStart;

  public static final String SERIALIZED_NAME_WINDOW_END = "windowEnd";
  @SerializedName(SERIALIZED_NAME_WINDOW_END)
  private String windowEnd;

  public static final String SERIALIZED_NAME_RECIPE_ID = "recipeId";
  @SerializedName(SERIALIZED_NAME_RECIPE_ID)
  private ResourceId recipeId = null;

  public static final String SERIALIZED_NAME_REPORT_CURRENCY = "reportCurrency";
  @SerializedName(SERIALIZED_NAME_REPORT_CURRENCY)
  private String reportCurrency;

  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public BucketedCashFlowRequest roundingMethod(String roundingMethod) {
    this.roundingMethod = roundingMethod;
    return this;
  }

   /**
   * When bucketing, there is not a unique way to allocate the bucket points.  RoundingMethod    Supported string (enumeration) values are: [RoundDown, RoundUp].
   * @return roundingMethod
  **/
  @ApiModelProperty(required = true, value = "When bucketing, there is not a unique way to allocate the bucket points.  RoundingMethod    Supported string (enumeration) values are: [RoundDown, RoundUp].")
  public String getRoundingMethod() {
    return roundingMethod;
  }

  public void setRoundingMethod(String roundingMethod) {
    this.roundingMethod = roundingMethod;
  }

  public BucketedCashFlowRequest bucketingDates(List<OffsetDateTime> bucketingDates) {
    this.bucketingDates = bucketingDates;
    return this;
  }

  public BucketedCashFlowRequest addBucketingDatesItem(OffsetDateTime bucketingDatesItem) {
    if (this.bucketingDates == null) {
      this.bucketingDates = new ArrayList<>();
    }
    this.bucketingDates.add(bucketingDatesItem);
    return this;
  }

   /**
   * A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty.
   * @return bucketingDates
  **/
  @ApiModelProperty(value = "A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty.")
  public List<OffsetDateTime> getBucketingDates() {
    return bucketingDates;
  }

  public void setBucketingDates(List<OffsetDateTime> bucketingDates) {
    this.bucketingDates = bucketingDates;
  }

  public BucketedCashFlowRequest bucketTenors(List<String> bucketTenors) {
    this.bucketTenors = bucketTenors;
    return this;
  }

  public BucketedCashFlowRequest addBucketTenorsItem(String bucketTenorsItem) {
    if (this.bucketTenors == null) {
      this.bucketTenors = new ArrayList<>();
    }
    this.bucketTenors.add(bucketTenorsItem);
    return this;
  }

   /**
   * A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty.
   * @return bucketTenors
  **/
  @ApiModelProperty(value = "A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty.")
  public List<String> getBucketTenors() {
    return bucketTenors;
  }

  public void setBucketTenors(List<String> bucketTenors) {
    this.bucketTenors = bucketTenors;
  }

  public BucketedCashFlowRequest effectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.
   * @return effectiveAt
  **/
  @ApiModelProperty(value = "The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.")
  public String getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public BucketedCashFlowRequest windowStart(String windowStart) {
    this.windowStart = windowStart;
    return this;
  }

   /**
   * The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified.
   * @return windowStart
  **/
  @ApiModelProperty(value = "The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified.")
  public String getWindowStart() {
    return windowStart;
  }

  public void setWindowStart(String windowStart) {
    this.windowStart = windowStart;
  }

  public BucketedCashFlowRequest windowEnd(String windowEnd) {
    this.windowEnd = windowEnd;
    return this;
  }

   /**
   * The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified
   * @return windowEnd
  **/
  @ApiModelProperty(value = "The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to 'today' if it is not specified")
  public String getWindowEnd() {
    return windowEnd;
  }

  public void setWindowEnd(String windowEnd) {
    this.windowEnd = windowEnd;
  }

  public BucketedCashFlowRequest recipeId(ResourceId recipeId) {
    this.recipeId = recipeId;
    return this;
  }

   /**
   * Get recipeId
   * @return recipeId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getRecipeId() {
    return recipeId;
  }

  public void setRecipeId(ResourceId recipeId) {
    this.recipeId = recipeId;
  }

  public BucketedCashFlowRequest reportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
    return this;
  }

   /**
   * Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.  If not present, then the currency of the relevant portfolio will be used in its place.
   * @return reportCurrency
  **/
  @ApiModelProperty(value = "Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.  If not present, then the currency of the relevant portfolio will be used in its place.")
  public String getReportCurrency() {
    return reportCurrency;
  }

  public void setReportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
  }

  public BucketedCashFlowRequest asAt(OffsetDateTime asAt) {
    this.asAt = asAt;
    return this;
  }

   /**
   * The asAt date to use
   * @return asAt
  **/
  @ApiModelProperty(value = "The asAt date to use")
  public OffsetDateTime getAsAt() {
    return asAt;
  }

  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
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
    sb.append("class BucketedCashFlowRequest {\n");
    sb.append("    roundingMethod: ").append(toIndentedString(roundingMethod)).append("\n");
    sb.append("    bucketingDates: ").append(toIndentedString(bucketingDates)).append("\n");
    sb.append("    bucketTenors: ").append(toIndentedString(bucketTenors)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
    sb.append("    recipeId: ").append(toIndentedString(recipeId)).append("\n");
    sb.append("    reportCurrency: ").append(toIndentedString(reportCurrency)).append("\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
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
