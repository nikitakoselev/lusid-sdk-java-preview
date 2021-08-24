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
 * A market data key rule describes a mapping for satisfying a particular market dependency. The supplier, scope, quote type and price side  information define the quote in the market and which Vendor for market data would be used to perform the lookup.  The market data key defines what dependency this satisfies. The key is a rule that describes the asset class, its identifier and any other  specifics required to uniquely describe a specific economic entity (e.g. an Fx currency pair, equity name or credit curve).
 */
@ApiModel(description = "A market data key rule describes a mapping for satisfying a particular market dependency. The supplier, scope, quote type and price side  information define the quote in the market and which Vendor for market data would be used to perform the lookup.  The market data key defines what dependency this satisfies. The key is a rule that describes the asset class, its identifier and any other  specifics required to uniquely describe a specific economic entity (e.g. an Fx currency pair, equity name or credit curve).")

public class MarketDataKeyRule {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SUPPLIER = "supplier";
  @SerializedName(SERIALIZED_NAME_SUPPLIER)
  private String supplier;

  public static final String SERIALIZED_NAME_DATA_SCOPE = "dataScope";
  @SerializedName(SERIALIZED_NAME_DATA_SCOPE)
  private String dataScope;

  /**
   * The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront
   */
  @JsonAdapter(QuoteTypeEnum.Adapter.class)
  public enum QuoteTypeEnum {
    PRICE("Price"),
    
    SPREAD("Spread"),
    
    RATE("Rate"),
    
    LOGNORMALVOL("LogNormalVol"),
    
    NORMALVOL("NormalVol"),
    
    PARSPREAD("ParSpread"),
    
    ISDASPREAD("IsdaSpread"),
    
    UPFRONT("Upfront");

    private String value;

    QuoteTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuoteTypeEnum fromValue(String value) {
      for (QuoteTypeEnum b : QuoteTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QuoteTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuoteTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuoteTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QuoteTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUOTE_TYPE = "quoteType";
  @SerializedName(SERIALIZED_NAME_QUOTE_TYPE)
  private QuoteTypeEnum quoteType;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_QUOTE_INTERVAL = "quoteInterval";
  @SerializedName(SERIALIZED_NAME_QUOTE_INTERVAL)
  private String quoteInterval;

  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public static final String SERIALIZED_NAME_PRICE_SOURCE = "priceSource";
  @SerializedName(SERIALIZED_NAME_PRICE_SOURCE)
  private String priceSource;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public MarketDataKeyRule key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The market data key pattern which this is a rule for. A dot separated string (A.B.C.D.*)
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The market data key pattern which this is a rule for. A dot separated string (A.B.C.D.*)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MarketDataKeyRule supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * The market data supplier (where the data comes from)
   * @return supplier
  **/
  @ApiModelProperty(required = true, value = "The market data supplier (where the data comes from)")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public MarketDataKeyRule dataScope(String dataScope) {
    this.dataScope = dataScope;
    return this;
  }

   /**
   * The scope in which the data should be found when using this rule.
   * @return dataScope
  **/
  @ApiModelProperty(required = true, value = "The scope in which the data should be found when using this rule.")
  public String getDataScope() {
    return dataScope;
  }

  public void setDataScope(String dataScope) {
    this.dataScope = dataScope;
  }

  public MarketDataKeyRule quoteType(QuoteTypeEnum quoteType) {
    this.quoteType = quoteType;
    return this;
  }

   /**
   * The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront
   * @return quoteType
  **/
  @ApiModelProperty(required = true, value = "The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront")
  public QuoteTypeEnum getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(QuoteTypeEnum quoteType) {
    this.quoteType = quoteType;
  }

  public MarketDataKeyRule field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The conceptual qualification for the field, such as bid, mid, or ask.  The field must be one of a defined set for the given supplier, in the same way as it  is for the Finbourne.WebApi.Interface.Dto.Quotes.QuoteSeriesId
   * @return field
  **/
  @ApiModelProperty(required = true, value = "The conceptual qualification for the field, such as bid, mid, or ask.  The field must be one of a defined set for the given supplier, in the same way as it  is for the Finbourne.WebApi.Interface.Dto.Quotes.QuoteSeriesId")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public MarketDataKeyRule quoteInterval(String quoteInterval) {
    this.quoteInterval = quoteInterval;
    return this;
  }

   /**
   * Shorthand for the time interval used to select market data. This must be a dot-separated string              nominating a start and end date, for example &#39;5D.0D&#39; to look back 5 days from today (0 days ago). The syntax              is &lt;i&gt;int&lt;/i&gt;&lt;i&gt;char&lt;/i&gt;.&lt;i&gt;int&lt;/i&gt;&lt;i&gt;char&lt;/i&gt;, where &lt;i&gt;char&lt;/i&gt; is one of D(ay), W(eek), M(onth) or Y(ear).
   * @return quoteInterval
  **/
  @ApiModelProperty(value = "Shorthand for the time interval used to select market data. This must be a dot-separated string              nominating a start and end date, for example '5D.0D' to look back 5 days from today (0 days ago). The syntax              is <i>int</i><i>char</i>.<i>int</i><i>char</i>, where <i>char</i> is one of D(ay), W(eek), M(onth) or Y(ear).")
  public String getQuoteInterval() {
    return quoteInterval;
  }

  public void setQuoteInterval(String quoteInterval) {
    this.quoteInterval = quoteInterval;
  }

  public MarketDataKeyRule asAt(OffsetDateTime asAt) {
    this.asAt = asAt;
    return this;
  }

   /**
   * The AsAt predicate specification.
   * @return asAt
  **/
  @ApiModelProperty(value = "The AsAt predicate specification.")
  public OffsetDateTime getAsAt() {
    return asAt;
  }

  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
  }

  public MarketDataKeyRule priceSource(String priceSource) {
    this.priceSource = priceSource;
    return this;
  }

   /**
   * The source of the quote. For a given provider/supplier of market data there may be an additional qualifier, e.g. the exchange or bank that provided the quote
   * @return priceSource
  **/
  @ApiModelProperty(value = "The source of the quote. For a given provider/supplier of market data there may be an additional qualifier, e.g. the exchange or bank that provided the quote")
  public String getPriceSource() {
    return priceSource;
  }

  public void setPriceSource(String priceSource) {
    this.priceSource = priceSource;
  }

  public MarketDataKeyRule mask(String mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Allows for partial or complete override of the market asset resolved for a dependency  Either a named override or a dot separated string (A.B.C.D.*).  e.g. for Rates curve &#39;EUR.*&#39; will replace the resolve MarketAsset &#39;GBP/12M&#39;, &#39;GBP/3M&#39; with the EUR equivalent, if there  are no wildcards in the mask, the mask is taken as the MarketAsset for any dependency matching the rule.
   * @return mask
  **/
  @ApiModelProperty(value = "Allows for partial or complete override of the market asset resolved for a dependency  Either a named override or a dot separated string (A.B.C.D.*).  e.g. for Rates curve 'EUR.*' will replace the resolve MarketAsset 'GBP/12M', 'GBP/3M' with the EUR equivalent, if there  are no wildcards in the mask, the mask is taken as the MarketAsset for any dependency matching the rule.")
  public String getMask() {
    return mask;
  }

  public void setMask(String mask) {
    this.mask = mask;
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
    sb.append("class MarketDataKeyRule {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    dataScope: ").append(toIndentedString(dataScope)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    quoteInterval: ").append(toIndentedString(quoteInterval)).append("\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
    sb.append("    priceSource: ").append(toIndentedString(priceSource)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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
