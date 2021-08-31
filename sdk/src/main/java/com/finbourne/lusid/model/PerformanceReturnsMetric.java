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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request used in the AggregatedReturns.
 */
@ApiModel(description = "The request used in the AggregatedReturns.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PerformanceReturnsMetric {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WINDOW = "window";
  @SerializedName(SERIALIZED_NAME_WINDOW)
  private String window;

  public static final String SERIALIZED_NAME_ALLOW_PARTIAL = "allowPartial";
  @SerializedName(SERIALIZED_NAME_ALLOW_PARTIAL)
  private Boolean allowPartial;

  public static final String SERIALIZED_NAME_ANNUALISED = "annualised";
  @SerializedName(SERIALIZED_NAME_ANNUALISED)
  private Boolean annualised;

  public static final String SERIALIZED_NAME_WITH_FEE = "withFee";
  @SerializedName(SERIALIZED_NAME_WITH_FEE)
  private Boolean withFee;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;


   /**
   * The type of the metric. Default to Return
   * @return type
  **/
  @ApiModelProperty(value = "The type of the metric. Default to Return")
  public String getType() {
    return type;
  }



  public PerformanceReturnsMetric window(String window) {
    this.window = window; 
    return this;
  }

   /**
   * The given metric for the calculation i.e. 1Y, 1D.
   * @return window
  **/
  @ApiModelProperty(value = "The given metric for the calculation i.e. 1Y, 1D.")
  public String getWindow() {
    return window;
  }

  public void setWindow(String window) {
    this.window = window;
  }


  public PerformanceReturnsMetric allowPartial(Boolean allowPartial) {
    this.allowPartial = allowPartial; 
    return this;
  }

   /**
   * Bool if the metric is allowed partial results. Deafult to false.
   * @return allowPartial
  **/
  @ApiModelProperty(value = "Bool if the metric is allowed partial results. Deafult to false.")
  public Boolean getAllowPartial() {
    return allowPartial;
  }

  public void setAllowPartial(Boolean allowPartial) {
    this.allowPartial = allowPartial;
  }


  public PerformanceReturnsMetric annualised(Boolean annualised) {
    this.annualised = annualised; 
    return this;
  }

   /**
   * Bool if the metric is annualized. Default to false.
   * @return annualised
  **/
  @ApiModelProperty(value = "Bool if the metric is annualized. Default to false.")
  public Boolean getAnnualised() {
    return annualised;
  }

  public void setAnnualised(Boolean annualised) {
    this.annualised = annualised;
  }


   /**
   * Bool if the metric should consider the fees when is calculated. Default to false.
   * @return withFee
  **/
  @ApiModelProperty(value = "Bool if the metric should consider the fees when is calculated. Default to false.")
  public Boolean getWithFee() {
    return withFee;
  }



   /**
   * The alias for the metric.
   * @return alias
  **/
  @ApiModelProperty(value = "The alias for the metric.")
  public String getAlias() {
    return alias;
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
    sb.append("class PerformanceReturnsMetric {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
    sb.append("    allowPartial: ").append(toIndentedString(allowPartial)).append("\n");
    sb.append("    annualised: ").append(toIndentedString(annualised)).append("\n");
    sb.append("    withFee: ").append(toIndentedString(withFee)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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