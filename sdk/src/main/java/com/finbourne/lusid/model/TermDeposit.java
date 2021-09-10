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
import com.finbourne.lusid.model.FlowConventions;
import com.finbourne.lusid.model.LusidInstrument;
import com.finbourne.lusid.model.TermDepositAllOf;
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
 * Lusid internal representation of a term deposit
 */
@ApiModel(description = "Lusid internal representation of a term deposit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TermDeposit extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_CONTRACT_SIZE = "contractSize";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SIZE)
  private Double contractSize;

  public static final String SERIALIZED_NAME_FLOW_CONVENTION = "flowConvention";
  @SerializedName(SERIALIZED_NAME_FLOW_CONVENTION)
  private FlowConventions flowConvention;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public TermDeposit() {
    //this.instrumentType = this.getClass().getSimpleName();
  }

  public TermDeposit startDate(OffsetDateTime startDate) {
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


  public TermDeposit maturityDate(OffsetDateTime maturityDate) {
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


  public TermDeposit contractSize(Double contractSize) {
    this.contractSize = contractSize; 
    return this;
  }

   /**
   * With an OTC we have the problem of multiple ways of booking a quantity.              e.g.              If buying a swap do you have a holding of size 1 of 100,000,000 notional swap or a holding of 100,000,000 size of 1 notional swap, or any combination that multiplies to 10^8.              When you get for a price for a &#39;unit swap&#39; what do you mean? The definition must be consistent across all quotes. This includes bonds which have a face value and              fx-forwards which often trade in standard contract sizes. When we look up a price, and there are no units, we are assuming it is a price for a contract size of 1.              The logical effect of this is that              instrument clean price &#x3D; contract size * quoted unit price              holding clean price    &#x3D; holding quantity * instrument clean price &#x3D; holding quantity * contract size * quoted unit price              In calculating accrued interest the same should hold.              NB: The real problem is that people store \&quot;prices\&quot; without complete units. Everything should really be \&quot;x ccy for n units\&quot;. Where the n is implicit the above has to hold.
   * @return contractSize
  **/
  @ApiModelProperty(required = true, value = "With an OTC we have the problem of multiple ways of booking a quantity.              e.g.              If buying a swap do you have a holding of size 1 of 100,000,000 notional swap or a holding of 100,000,000 size of 1 notional swap, or any combination that multiplies to 10^8.              When you get for a price for a 'unit swap' what do you mean? The definition must be consistent across all quotes. This includes bonds which have a face value and              fx-forwards which often trade in standard contract sizes. When we look up a price, and there are no units, we are assuming it is a price for a contract size of 1.              The logical effect of this is that              instrument clean price = contract size * quoted unit price              holding clean price    = holding quantity * instrument clean price = holding quantity * contract size * quoted unit price              In calculating accrued interest the same should hold.              NB: The real problem is that people store \"prices\" without complete units. Everything should really be \"x ccy for n units\". Where the n is implicit the above has to hold.")
  public Double getContractSize() {
    return contractSize;
  }

  public void setContractSize(Double contractSize) {
    this.contractSize = contractSize;
  }


  public TermDeposit flowConvention(FlowConventions flowConvention) {
    this.flowConvention = flowConvention; 
    return this;
  }

   /**
   * Get flowConvention
   * @return flowConvention
  **/
  @ApiModelProperty(required = true, value = "")
  public FlowConventions getFlowConvention() {
    return flowConvention;
  }

  public void setFlowConvention(FlowConventions flowConvention) {
    this.flowConvention = flowConvention;
  }


  public TermDeposit rate(Double rate) {
    this.rate = rate; 
    return this;
  }

   /**
   * The fixed rate for the term deposit. Specified as a decimal, e.g 0.03 is meant to be 3% interest
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The fixed rate for the term deposit. Specified as a decimal, e.g 0.03 is meant to be 3% interest")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
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
    sb.append("class TermDeposit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    contractSize: ").append(toIndentedString(contractSize)).append("\n");
    sb.append("    flowConvention: ").append(toIndentedString(flowConvention)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
