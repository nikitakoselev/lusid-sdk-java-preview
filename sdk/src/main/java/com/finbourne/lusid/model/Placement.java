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
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.Version;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A street order for a quantity of a single instrument placed with a single market entity.
 */
@ApiModel(description = "A street order for a quantity of a single instrument placed with a single market entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Placement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_BLOCK_IDS = "blockIds";
  @SerializedName(SERIALIZED_NAME_BLOCK_IDS)
  private List<ResourceId> blockIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = null;

  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "lusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private String timeInForce;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_LIMIT_PRICE = "limitPrice";
  @SerializedName(SERIALIZED_NAME_LIMIT_PRICE)
  private CurrencyAndAmount limitPrice;

  public static final String SERIALIZED_NAME_STOP_PRICE = "stopPrice";
  @SerializedName(SERIALIZED_NAME_STOP_PRICE)
  private CurrencyAndAmount stopPrice;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private String counterparty;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Placement id(ResourceId id) {
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


  public Placement blockIds(List<ResourceId> blockIds) {
    this.blockIds = blockIds; 
    return this;
  }

  public Placement addBlockIdsItem(ResourceId blockIdsItem) {
   
    this.blockIds.add(blockIdsItem);
    return this;
  }

   /**
   * IDs of Blocks associated with this placement.
   * @return blockIds
  **/
  @ApiModelProperty(required = true, value = "IDs of Blocks associated with this placement.")
  public List<ResourceId> getBlockIds() {
    return blockIds;
  }

  public void setBlockIds(List<ResourceId> blockIds) {
    this.blockIds = blockIds;
  }


  public Placement properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties; 
    return this;
  }

  public Placement putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Client-defined properties associated with this placement.
   * @return properties
  **/
  @ApiModelProperty(value = "Client-defined properties associated with this placement.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }


  public Placement instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers; 
    return this;
  }

  public Placement putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
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


  public Placement lusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId; 
    return this;
  }

   /**
   * The LUSID instrument id for the instrument placement.
   * @return lusidInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The LUSID instrument id for the instrument placement.")
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }

  public void setLusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId;
  }


  public Placement quantity(Double quantity) {
    this.quantity = quantity; 
    return this;
  }

   /**
   * The quantity of given instrument ordered.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of given instrument ordered.")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public Placement state(String state) {
    this.state = state; 
    return this;
  }

   /**
   * The state of this placement (typically a FIX state; Open, Filled, etc).
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The state of this placement (typically a FIX state; Open, Filled, etc).")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Placement side(String side) {
    this.side = side; 
    return this;
  }

   /**
   * The side (Buy, Sell, ...) of this placement.
   * @return side
  **/
  @ApiModelProperty(required = true, value = "The side (Buy, Sell, ...) of this placement.")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }


  public Placement timeInForce(String timeInForce) {
    this.timeInForce = timeInForce; 
    return this;
  }

   /**
   * The time in force applicable to this placement (GTC, FOK, Day, etc)
   * @return timeInForce
  **/
  @ApiModelProperty(required = true, value = "The time in force applicable to this placement (GTC, FOK, Day, etc)")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }


  public Placement type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * The type of this placement (Market, Limit, etc).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of this placement (Market, Limit, etc).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Placement createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate; 
    return this;
  }

   /**
   * The active date of this placement.
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "The active date of this placement.")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public Placement limitPrice(CurrencyAndAmount limitPrice) {
    this.limitPrice = limitPrice; 
    return this;
  }

   /**
   * Get limitPrice
   * @return limitPrice
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getLimitPrice() {
    return limitPrice;
  }

  public void setLimitPrice(CurrencyAndAmount limitPrice) {
    this.limitPrice = limitPrice;
  }


  public Placement stopPrice(CurrencyAndAmount stopPrice) {
    this.stopPrice = stopPrice; 
    return this;
  }

   /**
   * Get stopPrice
   * @return stopPrice
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getStopPrice() {
    return stopPrice;
  }

  public void setStopPrice(CurrencyAndAmount stopPrice) {
    this.stopPrice = stopPrice;
  }


  public Placement counterparty(String counterparty) {
    this.counterparty = counterparty; 
    return this;
  }

   /**
   * The market entity this placement is placed with.
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "The market entity this placement is placed with.")
  public String getCounterparty() {
    return counterparty;
  }

  public void setCounterparty(String counterparty) {
    this.counterparty = counterparty;
  }


  public Placement version(Version version) {
    this.version = version; 
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }


  public Placement links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Placement addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class Placement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    blockIds: ").append(toIndentedString(blockIds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
    sb.append("    stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
