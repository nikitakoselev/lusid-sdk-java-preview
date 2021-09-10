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
import com.finbourne.lusid.model.LusidInstrument;
import com.finbourne.lusid.model.SimpleInstrumentAllOf;
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
 * IL SimpleInstrument Instrument; Lusid-ibor internal representation of a SimpleInstrument instrument
 */
@ApiModel(description = "IL SimpleInstrument Instrument; Lusid-ibor internal representation of a SimpleInstrument instrument")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimpleInstrument extends LusidInstrument {
  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_DOM_CCY = "domCcy";
  @SerializedName(SERIALIZED_NAME_DOM_CCY)
  private String domCcy;

  /**
   * The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Unknown
   */
  @JsonAdapter(AssetClassEnum.Adapter.class)
  public enum AssetClassEnum {
    INTERESTRATES("InterestRates"),
    
    FX("FX"),
    
    INFLATION("Inflation"),
    
    EQUITIES("Equities"),
    
    CREDIT("Credit"),
    
    COMMODITIES("Commodities"),
    
    UNKNOWN("Unknown");

    private String value;

    AssetClassEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetClassEnum fromValue(String value) {
      for (AssetClassEnum b : AssetClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetClassEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetClassEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_CLASS = "assetClass";
  @SerializedName(SERIALIZED_NAME_ASSET_CLASS)
  private AssetClassEnum assetClass;

  public static final String SERIALIZED_NAME_FGN_CCYS = "fgnCcys";
  @SerializedName(SERIALIZED_NAME_FGN_CCYS)
  private List<String> fgnCcys = null;

  public static final String SERIALIZED_NAME_SIMPLE_INSTRUMENT_TYPE = "simpleInstrumentType";
  @SerializedName(SERIALIZED_NAME_SIMPLE_INSTRUMENT_TYPE)
  private String simpleInstrumentType;

  public SimpleInstrument() {
    //this.instrumentType = this.getClass().getSimpleName();
  }

  public SimpleInstrument maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate; 
    return this;
  }

   /**
   * The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date
   * @return maturityDate
  **/
  @ApiModelProperty(value = "The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date")
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public SimpleInstrument domCcy(String domCcy) {
    this.domCcy = domCcy; 
    return this;
  }

   /**
   * The domestic currency
   * @return domCcy
  **/
  @ApiModelProperty(required = true, value = "The domestic currency")
  public String getDomCcy() {
    return domCcy;
  }

  public void setDomCcy(String domCcy) {
    this.domCcy = domCcy;
  }


  public SimpleInstrument assetClass(AssetClassEnum assetClass) {
    this.assetClass = assetClass; 
    return this;
  }

   /**
   * The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Unknown
   * @return assetClass
  **/
  @ApiModelProperty(required = true, value = "The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Unknown")
  public AssetClassEnum getAssetClass() {
    return assetClass;
  }

  public void setAssetClass(AssetClassEnum assetClass) {
    this.assetClass = assetClass;
  }


  public SimpleInstrument fgnCcys(List<String> fgnCcys) {
    this.fgnCcys = fgnCcys; 
    return this;
  }

  public SimpleInstrument addFgnCcysItem(String fgnCcysItem) {
   
    if (this.fgnCcys == null) {
      this.fgnCcys = new ArrayList<>();
    }
    this.fgnCcys.add(fgnCcysItem);
    return this;
  }

   /**
   * The set of foreign currencies, if any (optional)
   * @return fgnCcys
  **/
  @ApiModelProperty(value = "The set of foreign currencies, if any (optional)")
  public List<String> getFgnCcys() {
    return fgnCcys;
  }

  public void setFgnCcys(List<String> fgnCcys) {
    this.fgnCcys = fgnCcys;
  }


  public SimpleInstrument simpleInstrumentType(String simpleInstrumentType) {
    this.simpleInstrumentType = simpleInstrumentType; 
    return this;
  }

   /**
   * The Instrument type of the simple instrument
   * @return simpleInstrumentType
  **/
  @ApiModelProperty(required = true, value = "The Instrument type of the simple instrument")
  public String getSimpleInstrumentType() {
    return simpleInstrumentType;
  }

  public void setSimpleInstrumentType(String simpleInstrumentType) {
    this.simpleInstrumentType = simpleInstrumentType;
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
    sb.append("class SimpleInstrument {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    domCcy: ").append(toIndentedString(domCcy)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    fgnCcys: ").append(toIndentedString(fgnCcys)).append("\n");
    sb.append("    simpleInstrumentType: ").append(toIndentedString(simpleInstrumentType)).append("\n");
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
