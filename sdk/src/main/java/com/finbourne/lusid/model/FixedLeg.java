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
import com.finbourne.lusid.model.FixedLegAllOf;
import com.finbourne.lusid.model.FixedLegAllOfOverrides;
import com.finbourne.lusid.model.InstrumentLeg;
import com.finbourne.lusid.model.LegDefinition;
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
 * representation of a fixed rates leg
 */
@ApiModel(description = "representation of a fixed rates leg")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FixedLeg extends InstrumentLeg {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_LEG_DEFINITION = "legDefinition";
  @SerializedName(SERIALIZED_NAME_LEG_DEFINITION)
  private LegDefinition legDefinition;

  public static final String SERIALIZED_NAME_NOTIONAL = "notional";
  @SerializedName(SERIALIZED_NAME_NOTIONAL)
  private Double notional;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private FixedLegAllOfOverrides overrides;

  public FixedLeg() {
    //this.instrumentType = this.getClass().getSimpleName();
  }

  public FixedLeg startDate(OffsetDateTime startDate) {
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


  public FixedLeg maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate; 
    return this;
  }

   /**
   * The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.              For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as              Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date
   * @return maturityDate
  **/
  @ApiModelProperty(required = true, value = "The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.              For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as              Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date")
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public FixedLeg legDefinition(LegDefinition legDefinition) {
    this.legDefinition = legDefinition; 
    return this;
  }

   /**
   * Get legDefinition
   * @return legDefinition
  **/
  @ApiModelProperty(required = true, value = "")
  public LegDefinition getLegDefinition() {
    return legDefinition;
  }

  public void setLegDefinition(LegDefinition legDefinition) {
    this.legDefinition = legDefinition;
  }


  public FixedLeg notional(Double notional) {
    this.notional = notional; 
    return this;
  }

   /**
   * Get notional
   * @return notional
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getNotional() {
    return notional;
  }

  public void setNotional(Double notional) {
    this.notional = notional;
  }


  public FixedLeg overrides(FixedLegAllOfOverrides overrides) {
    this.overrides = overrides; 
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @ApiModelProperty(value = "")
  public FixedLegAllOfOverrides getOverrides() {
    return overrides;
  }

  public void setOverrides(FixedLegAllOfOverrides overrides) {
    this.overrides = overrides;
  }


  @Override
  public boolean equals(Object o) {
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
    sb.append("class FixedLeg {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    legDefinition: ").append(toIndentedString(legDefinition)).append("\n");
    sb.append("    notional: ").append(toIndentedString(notional)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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
