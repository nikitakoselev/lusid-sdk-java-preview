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
import java.time.OffsetDateTime;

/**
 * CashPerpetualAllOf
 */

public class CashPerpetualAllOf {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_DOM_CCY = "domCcy";
  @SerializedName(SERIALIZED_NAME_DOM_CCY)
  private String domCcy;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Double principal;

  /**
   * The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CashSettled, CdsIndex, Basket, FundingLeg, CrossCurrencySwap, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo
   */
  @JsonAdapter(InstrumentTypeEnum.Adapter.class)
  public enum InstrumentTypeEnum {
    QUOTEDSECURITY("QuotedSecurity"),
    
    INTERESTRATESWAP("InterestRateSwap"),
    
    FXFORWARD("FxForward"),
    
    FUTURE("Future"),
    
    EXOTICINSTRUMENT("ExoticInstrument"),
    
    FXOPTION("FxOption"),
    
    CREDITDEFAULTSWAP("CreditDefaultSwap"),
    
    INTERESTRATESWAPTION("InterestRateSwaption"),
    
    BOND("Bond"),
    
    EQUITYOPTION("EquityOption"),
    
    FIXEDLEG("FixedLeg"),
    
    FLOATINGLEG("FloatingLeg"),
    
    BESPOKECASHFLOWSLEG("BespokeCashFlowsLeg"),
    
    UNKNOWN("Unknown"),
    
    TERMDEPOSIT("TermDeposit"),
    
    CONTRACTFORDIFFERENCE("ContractForDifference"),
    
    EQUITYSWAP("EquitySwap"),
    
    CASHPERPETUAL("CashPerpetual"),
    
    CASHSETTLED("CashSettled"),
    
    CDSINDEX("CdsIndex"),
    
    BASKET("Basket"),
    
    FUNDINGLEG("FundingLeg"),
    
    CROSSCURRENCYSWAP("CrossCurrencySwap"),
    
    FXSWAP("FxSwap"),
    
    FORWARDRATEAGREEMENT("ForwardRateAgreement"),
    
    SIMPLEINSTRUMENT("SimpleInstrument"),
    
    REPO("Repo");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstrumentTypeEnum fromValue(String value) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InstrumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InstrumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private InstrumentTypeEnum instrumentType;

  public CashPerpetualAllOf startDate(OffsetDateTime startDate) {
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

  public CashPerpetualAllOf domCcy(String domCcy) {
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

  public CashPerpetualAllOf principal(Double principal) {
    this.principal = principal;
    return this;
  }

   /**
   * The face-value or principal for the cash at outset.
   * @return principal
  **/
  @ApiModelProperty(required = true, value = "The face-value or principal for the cash at outset.")
  public Double getPrincipal() {
    return principal;
  }

  public void setPrincipal(Double principal) {
    this.principal = principal;
  }

  public CashPerpetualAllOf instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CashSettled, CdsIndex, Basket, FundingLeg, CrossCurrencySwap, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo
   * @return instrumentType
  **/
  @ApiModelProperty(required = true, value = "The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CashSettled, CdsIndex, Basket, FundingLeg, CrossCurrencySwap, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo")
  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
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
    sb.append("class CashPerpetualAllOf {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    domCcy: ").append(toIndentedString(domCcy)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
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
