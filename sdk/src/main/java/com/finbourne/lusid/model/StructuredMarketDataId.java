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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An identifier that uniquely describes an item of structured market data such as an interest rate curve or volatility surface.
 */
@ApiModel(description = "An identifier that uniquely describes an item of structured market data such as an interest rate curve or volatility surface.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StructuredMarketDataId {
  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_PRICE_SOURCE = "priceSource";
  @SerializedName(SERIALIZED_NAME_PRICE_SOURCE)
  private String priceSource;

  public static final String SERIALIZED_NAME_LINEAGE = "lineage";
  @SerializedName(SERIALIZED_NAME_LINEAGE)
  private String lineage;

  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private String effectiveAt;

  public static final String SERIALIZED_NAME_MARKET_ELEMENT_TYPE = "marketElementType";
  @SerializedName(SERIALIZED_NAME_MARKET_ELEMENT_TYPE)
  private String marketElementType;

  public static final String SERIALIZED_NAME_MARKET_ASSET = "marketAsset";
  @SerializedName(SERIALIZED_NAME_MARKET_ASSET)
  private String marketAsset;


  public StructuredMarketDataId provider(String provider) {
    this.provider = provider; 
    return this;
  }

   /**
   * The platform or vendor that provided the structured market data, e.g. &#39;DataScope&#39;, &#39;LUSID&#39;, &#39;ISDA&#39; etc.
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "The platform or vendor that provided the structured market data, e.g. 'DataScope', 'LUSID', 'ISDA' etc.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public StructuredMarketDataId priceSource(String priceSource) {
    this.priceSource = priceSource; 
    return this;
  }

   /**
   * The source or originator of the structured market data, e.g. a bank or financial institution.
   * @return priceSource
  **/
  @ApiModelProperty(value = "The source or originator of the structured market data, e.g. a bank or financial institution.")
  public String getPriceSource() {
    return priceSource;
  }

  public void setPriceSource(String priceSource) {
    this.priceSource = priceSource;
  }


  public StructuredMarketDataId lineage(String lineage) {
    this.lineage = lineage; 
    return this;
  }

   /**
   * Description of the structured market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;.
   * @return lineage
  **/
  @ApiModelProperty(value = "Description of the structured market data's lineage e.g. 'FundAccountant_GreenQuality'.")
  public String getLineage() {
    return lineage;
  }

  public void setLineage(String lineage) {
    this.lineage = lineage;
  }


  public StructuredMarketDataId effectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt; 
    return this;
  }

   /**
   * The effectiveAt or cut label that this item of structured market data is/was updated/inserted with.
   * @return effectiveAt
  **/
  @ApiModelProperty(value = "The effectiveAt or cut label that this item of structured market data is/was updated/inserted with.")
  public String getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public StructuredMarketDataId marketElementType(String marketElementType) {
    this.marketElementType = marketElementType; 
    return this;
  }

   /**
   * The type of the market element that the market entity represents, e.g. a vol surface or credit curve
   * @return marketElementType
  **/
  @ApiModelProperty(value = "The type of the market element that the market entity represents, e.g. a vol surface or credit curve")
  public String getMarketElementType() {
    return marketElementType;
  }

  public void setMarketElementType(String marketElementType) {
    this.marketElementType = marketElementType;
  }


  public StructuredMarketDataId marketAsset(String marketAsset) {
    this.marketAsset = marketAsset; 
    return this;
  }

   /**
   * The name of the market entity that the document represents
   * @return marketAsset
  **/
  @ApiModelProperty(value = "The name of the market entity that the document represents")
  public String getMarketAsset() {
    return marketAsset;
  }

  public void setMarketAsset(String marketAsset) {
    this.marketAsset = marketAsset;
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
    sb.append("class StructuredMarketDataId {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    priceSource: ").append(toIndentedString(priceSource)).append("\n");
    sb.append("    lineage: ").append(toIndentedString(lineage)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    marketElementType: ").append(toIndentedString(marketElementType)).append("\n");
    sb.append("    marketAsset: ").append(toIndentedString(marketAsset)).append("\n");
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
