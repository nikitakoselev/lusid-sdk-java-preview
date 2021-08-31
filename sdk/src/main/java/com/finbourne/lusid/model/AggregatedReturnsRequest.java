/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3444
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.PerformanceReturnsMetric;
import com.finbourne.lusid.model.ResourceId;
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
 * The request used in the AggregatedReturns.
 */
@ApiModel(description = "The request used in the AggregatedReturns.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AggregatedReturnsRequest {
  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<PerformanceReturnsMetric> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECIPE_ID = "recipeId";
  @SerializedName(SERIALIZED_NAME_RECIPE_ID)
  private ResourceId recipeId;

  public static final String SERIALIZED_NAME_COMPOSITE_METHOD = "compositeMethod";
  @SerializedName(SERIALIZED_NAME_COMPOSITE_METHOD)
  private String compositeMethod;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_OUTPUT_FREQUENCY = "outputFrequency";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FREQUENCY)
  private String outputFrequency;


  public AggregatedReturnsRequest metrics(List<PerformanceReturnsMetric> metrics) {
    this.metrics = metrics; 
    return this;
  }

  public AggregatedReturnsRequest addMetricsItem(PerformanceReturnsMetric metricsItem) {
   
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * A list of metrics to calculate in the AggregatedReturns.
   * @return metrics
  **/
  @ApiModelProperty(required = true, value = "A list of metrics to calculate in the AggregatedReturns.")
  public List<PerformanceReturnsMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<PerformanceReturnsMetric> metrics) {
    this.metrics = metrics;
  }


  public AggregatedReturnsRequest recipeId(ResourceId recipeId) {
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


  public AggregatedReturnsRequest compositeMethod(String compositeMethod) {
    this.compositeMethod = compositeMethod; 
    return this;
  }

   /**
   * The method used to calculate the Portfolio performance: Equal/Asset.
   * @return compositeMethod
  **/
  @ApiModelProperty(value = "The method used to calculate the Portfolio performance: Equal/Asset.")
  public String getCompositeMethod() {
    return compositeMethod;
  }

  public void setCompositeMethod(String compositeMethod) {
    this.compositeMethod = compositeMethod;
  }


  public AggregatedReturnsRequest period(String period) {
    this.period = period; 
    return this;
  }

   /**
   * The type of the returns used to calculate the aggregation result: Daily/Monthly.
   * @return period
  **/
  @ApiModelProperty(value = "The type of the returns used to calculate the aggregation result: Daily/Monthly.")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }


  public AggregatedReturnsRequest outputFrequency(String outputFrequency) {
    this.outputFrequency = outputFrequency; 
    return this;
  }

   /**
   * The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly.
   * @return outputFrequency
  **/
  @ApiModelProperty(value = "The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly.")
  public String getOutputFrequency() {
    return outputFrequency;
  }

  public void setOutputFrequency(String outputFrequency) {
    this.outputFrequency = outputFrequency;
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
    sb.append("class AggregatedReturnsRequest {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    recipeId: ").append(toIndentedString(recipeId)).append("\n");
    sb.append("    compositeMethod: ").append(toIndentedString(compositeMethod)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    outputFrequency: ").append(toIndentedString(outputFrequency)).append("\n");
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