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
import com.finbourne.lusid.model.MarketQuote;
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
 * YieldCurveDataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class YieldCurveDataAllOf {
  public static final String SERIALIZED_NAME_BASE_DATE = "baseDate";
  @SerializedName(SERIALIZED_NAME_BASE_DATE)
  private OffsetDateTime baseDate;

  public static final String SERIALIZED_NAME_INSTRUMENTS = "instruments";
  @SerializedName(SERIALIZED_NAME_INSTRUMENTS)
  private List<LusidInstrument> instruments = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUOTES = "quotes";
  @SerializedName(SERIALIZED_NAME_QUOTES)
  private List<MarketQuote> quotes = new ArrayList<>();

  /**
   * The available values are: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData
   */
  @JsonAdapter(MarketDataTypeEnum.Adapter.class)
  public enum MarketDataTypeEnum {
    DISCOUNTFACTORCURVEDATA("DiscountFactorCurveData"),
    
    EQUITYVOLSURFACEDATA("EquityVolSurfaceData"),
    
    FXVOLSURFACEDATA("FxVolSurfaceData"),
    
    IRVOLCUBEDATA("IrVolCubeData"),
    
    OPAQUEMARKETDATA("OpaqueMarketData"),
    
    YIELDCURVEDATA("YieldCurveData");

    private String value;

    MarketDataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketDataTypeEnum fromValue(String value) {
      for (MarketDataTypeEnum b : MarketDataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MarketDataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketDataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketDataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MarketDataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MARKET_DATA_TYPE = "marketDataType";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA_TYPE)
  private MarketDataTypeEnum marketDataType;


  public YieldCurveDataAllOf baseDate(OffsetDateTime baseDate) {
    this.baseDate = baseDate; 
    return this;
  }

   /**
   * Base date
   * @return baseDate
  **/
  @ApiModelProperty(required = true, value = "Base date")
  public OffsetDateTime getBaseDate() {
    return baseDate;
  }

  public void setBaseDate(OffsetDateTime baseDate) {
    this.baseDate = baseDate;
  }


  public YieldCurveDataAllOf instruments(List<LusidInstrument> instruments) {
    this.instruments = instruments; 
    return this;
  }

  public YieldCurveDataAllOf addInstrumentsItem(LusidInstrument instrumentsItem) {
   
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * The set of instruments that define the curve.
   * @return instruments
  **/
  @ApiModelProperty(required = true, value = "The set of instruments that define the curve.")
  public List<LusidInstrument> getInstruments() {
    return instruments;
  }

  public void setInstruments(List<LusidInstrument> instruments) {
    this.instruments = instruments;
  }


  public YieldCurveDataAllOf quotes(List<MarketQuote> quotes) {
    this.quotes = quotes; 
    return this;
  }

  public YieldCurveDataAllOf addQuotesItem(MarketQuote quotesItem) {
   
    this.quotes.add(quotesItem);
    return this;
  }

   /**
   * The market quotes corresponding to the the instruments used to define the curve
   * @return quotes
  **/
  @ApiModelProperty(required = true, value = "The market quotes corresponding to the the instruments used to define the curve")
  public List<MarketQuote> getQuotes() {
    return quotes;
  }

  public void setQuotes(List<MarketQuote> quotes) {
    this.quotes = quotes;
  }


  public YieldCurveDataAllOf marketDataType(MarketDataTypeEnum marketDataType) {
    this.marketDataType = marketDataType; 
    return this;
  }

   /**
   * The available values are: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData
   * @return marketDataType
  **/
  @ApiModelProperty(required = true, value = "The available values are: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData")
  public MarketDataTypeEnum getMarketDataType() {
    return marketDataType;
  }

  public void setMarketDataType(MarketDataTypeEnum marketDataType) {
    this.marketDataType = marketDataType;
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
    sb.append("class YieldCurveDataAllOf {\n");
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
    sb.append("    marketDataType: ").append(toIndentedString(marketDataType)).append("\n");
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
