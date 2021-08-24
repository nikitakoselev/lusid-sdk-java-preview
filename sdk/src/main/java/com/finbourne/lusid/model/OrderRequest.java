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
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A request to create or update an Order.
 */
@ApiModel(description = "A request to create or update an Order.")

public class OrderRequest {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_ORDER_BOOK_ID = "orderBookId";
  @SerializedName(SERIALIZED_NAME_ORDER_BOOK_ID)
  private ResourceId orderBookId = null;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private ResourceId portfolioId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private String timeInForce;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CurrencyAndAmount price = null;

  public static final String SERIALIZED_NAME_ORDER_INSTRUCTION = "orderInstruction";
  @SerializedName(SERIALIZED_NAME_ORDER_INSTRUCTION)
  private ResourceId orderInstruction = null;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private ResourceId _package = null;

  public OrderRequest properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
    return this;
  }

  public OrderRequest putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Client-defined properties associated with this order.
   * @return properties
  **/
  @ApiModelProperty(value = "Client-defined properties associated with this order.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }

  public OrderRequest instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
    return this;
  }

  public OrderRequest putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * The instrument ordered.
   * @return instrumentIdentifiers
  **/
  @ApiModelProperty(required = true, value = "The instrument ordered.")
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }

  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }

  public OrderRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of given instrument ordered.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of given instrument ordered.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderRequest side(String side) {
    this.side = side;
    return this;
  }

   /**
   * The client&#39;s representation of the order&#39;s side (buy, sell, short, etc)
   * @return side
  **/
  @ApiModelProperty(required = true, value = "The client's representation of the order's side (buy, sell, short, etc)")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public OrderRequest orderBookId(ResourceId orderBookId) {
    this.orderBookId = orderBookId;
    return this;
  }

   /**
   * Get orderBookId
   * @return orderBookId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getOrderBookId() {
    return orderBookId;
  }

  public void setOrderBookId(ResourceId orderBookId) {
    this.orderBookId = orderBookId;
  }

  public OrderRequest portfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
  }

  public OrderRequest id(ResourceId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getId() {
    return id;
  }

  public void setId(ResourceId id) {
    this.id = id;
  }

  public OrderRequest state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The order&#39;s state (examples: New, PartiallyFilled, ...)
   * @return state
  **/
  @ApiModelProperty(value = "The order's state (examples: New, PartiallyFilled, ...)")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OrderRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The order&#39;s type (examples: Limit, Market, ...)
   * @return type
  **/
  @ApiModelProperty(value = "The order's type (examples: Limit, Market, ...)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderRequest timeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * The order&#39;s time in force (examples: Day, GoodTilCancel, ...)
   * @return timeInForce
  **/
  @ApiModelProperty(value = "The order's time in force (examples: Day, GoodTilCancel, ...)")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  public OrderRequest date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date on which the order was made
   * @return date
  **/
  @ApiModelProperty(value = "The date on which the order was made")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public OrderRequest price(CurrencyAndAmount price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getPrice() {
    return price;
  }

  public void setPrice(CurrencyAndAmount price) {
    this.price = price;
  }

  public OrderRequest orderInstruction(ResourceId orderInstruction) {
    this.orderInstruction = orderInstruction;
    return this;
  }

   /**
   * Get orderInstruction
   * @return orderInstruction
  **/
  @ApiModelProperty(value = "")
  public ResourceId getOrderInstruction() {
    return orderInstruction;
  }

  public void setOrderInstruction(ResourceId orderInstruction) {
    this.orderInstruction = orderInstruction;
  }

  public OrderRequest _package(ResourceId _package) {
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @ApiModelProperty(value = "")
  public ResourceId getPackage() {
    return _package;
  }

  public void setPackage(ResourceId _package) {
    this._package = _package;
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
    sb.append("class OrderRequest {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderBookId: ").append(toIndentedString(orderBookId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    orderInstruction: ").append(toIndentedString(orderInstruction)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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
