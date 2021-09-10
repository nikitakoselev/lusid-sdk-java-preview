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
import com.finbourne.lusid.model.EquitySwapAllOf;
import com.finbourne.lusid.model.FlowConventions;
import com.finbourne.lusid.model.InstrumentLeg;
import com.finbourne.lusid.model.LusidInstrument;
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
 * Lusid-ibor internal representation of an Equity Swap instrument.
 */
@ApiModel(description = "Lusid-ibor internal representation of an Equity Swap instrument.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EquitySwap extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EQUITY_FLOW_CONVENTIONS = "equityFlowConventions";
  @SerializedName(SERIALIZED_NAME_EQUITY_FLOW_CONVENTIONS)
  private FlowConventions equityFlowConventions;

  public static final String SERIALIZED_NAME_FUNDING_LEG = "fundingLeg";
  @SerializedName(SERIALIZED_NAME_FUNDING_LEG)
  private InstrumentLeg fundingLeg = null;

  public static final String SERIALIZED_NAME_INCLUDE_DIVIDENDS = "includeDividends";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DIVIDENDS)
  private Boolean includeDividends;

  public static final String SERIALIZED_NAME_INITIAL_PRICE = "initialPrice";
  @SerializedName(SERIALIZED_NAME_INITIAL_PRICE)
  private Double initialPrice;

  public static final String SERIALIZED_NAME_NOTIONAL_RESET = "notionalReset";
  @SerializedName(SERIALIZED_NAME_NOTIONAL_RESET)
  private Boolean notionalReset;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_UNDERLYING_IDENTIFIER = "underlyingIdentifier";
  @SerializedName(SERIALIZED_NAME_UNDERLYING_IDENTIFIER)
  private String underlyingIdentifier;

  public EquitySwap() {
    //this.instrumentType = this.getClass().getSimpleName();
  }

  public EquitySwap startDate(OffsetDateTime startDate) {
    this.startDate = startDate; 
    return this;
  }

   /**
   * The start date of the EquitySwap
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The start date of the EquitySwap")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public EquitySwap maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate; 
    return this;
  }

   /**
   * The maturity date of the EquitySwap.
   * @return maturityDate
  **/
  @ApiModelProperty(required = true, value = "The maturity date of the EquitySwap.")
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public EquitySwap code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * The code of the underlying.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The code of the underlying.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public EquitySwap equityFlowConventions(FlowConventions equityFlowConventions) {
    this.equityFlowConventions = equityFlowConventions; 
    return this;
  }

   /**
   * Get equityFlowConventions
   * @return equityFlowConventions
  **/
  @ApiModelProperty(required = true, value = "")
  public FlowConventions getEquityFlowConventions() {
    return equityFlowConventions;
  }

  public void setEquityFlowConventions(FlowConventions equityFlowConventions) {
    this.equityFlowConventions = equityFlowConventions;
  }


  public EquitySwap fundingLeg(InstrumentLeg fundingLeg) {
    this.fundingLeg = fundingLeg; 
    return this;
  }

   /**
   * Get fundingLeg
   * @return fundingLeg
  **/
  @ApiModelProperty(required = true, value = "")
  public InstrumentLeg getFundingLeg() {
    return fundingLeg;
  }

  public void setFundingLeg(InstrumentLeg fundingLeg) {
    this.fundingLeg = fundingLeg;
  }


  public EquitySwap includeDividends(Boolean includeDividends) {
    this.includeDividends = includeDividends; 
    return this;
  }

   /**
   * Dividend inclusion flag, if true dividends are included in the equity leg (total return).
   * @return includeDividends
  **/
  @ApiModelProperty(required = true, value = "Dividend inclusion flag, if true dividends are included in the equity leg (total return).")
  public Boolean getIncludeDividends() {
    return includeDividends;
  }

  public void setIncludeDividends(Boolean includeDividends) {
    this.includeDividends = includeDividends;
  }


  public EquitySwap initialPrice(Double initialPrice) {
    this.initialPrice = initialPrice; 
    return this;
  }

   /**
   * The initial equity price of the Equity Swap.
   * @return initialPrice
  **/
  @ApiModelProperty(required = true, value = "The initial equity price of the Equity Swap.")
  public Double getInitialPrice() {
    return initialPrice;
  }

  public void setInitialPrice(Double initialPrice) {
    this.initialPrice = initialPrice;
  }


  public EquitySwap notionalReset(Boolean notionalReset) {
    this.notionalReset = notionalReset; 
    return this;
  }

   /**
   * Notional reset flag, if true the notional of the funding leg is reset at the start of every  coupon to match the value of the equity leg (equity price at start of coupon times quantity)
   * @return notionalReset
  **/
  @ApiModelProperty(required = true, value = "Notional reset flag, if true the notional of the funding leg is reset at the start of every  coupon to match the value of the equity leg (equity price at start of coupon times quantity)")
  public Boolean getNotionalReset() {
    return notionalReset;
  }

  public void setNotionalReset(Boolean notionalReset) {
    this.notionalReset = notionalReset;
  }


  public EquitySwap quantity(Double quantity) {
    this.quantity = quantity; 
    return this;
  }

   /**
   * The quantity or number of shares in the Equity Swap.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity or number of shares in the Equity Swap.")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public EquitySwap underlyingIdentifier(String underlyingIdentifier) {
    this.underlyingIdentifier = underlyingIdentifier; 
    return this;
  }

   /**
   * external market codes and identifiers for the EquitySwap, e.g. RIC.  Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].
   * @return underlyingIdentifier
  **/
  @ApiModelProperty(required = true, value = "external market codes and identifiers for the EquitySwap, e.g. RIC.  Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].")
  public String getUnderlyingIdentifier() {
    return underlyingIdentifier;
  }

  public void setUnderlyingIdentifier(String underlyingIdentifier) {
    this.underlyingIdentifier = underlyingIdentifier;
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
    sb.append("class EquitySwap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    equityFlowConventions: ").append(toIndentedString(equityFlowConventions)).append("\n");
    sb.append("    fundingLeg: ").append(toIndentedString(fundingLeg)).append("\n");
    sb.append("    includeDividends: ").append(toIndentedString(includeDividends)).append("\n");
    sb.append("    initialPrice: ").append(toIndentedString(initialPrice)).append("\n");
    sb.append("    notionalReset: ").append(toIndentedString(notionalReset)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    underlyingIdentifier: ").append(toIndentedString(underlyingIdentifier)).append("\n");
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
