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
import com.finbourne.lusid.model.IUnitDefinitionDto;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * DataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataType {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  /**
   * The available values are: Open, Closed
   */
  @JsonAdapter(TypeValueRangeEnum.Adapter.class)
  public enum TypeValueRangeEnum {
    OPEN("Open"),
    
    CLOSED("Closed");

    private String value;

    TypeValueRangeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeValueRangeEnum fromValue(String value) {
      for (TypeValueRangeEnum b : TypeValueRangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeValueRangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeValueRangeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeValueRangeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeValueRangeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE_VALUE_RANGE = "typeValueRange";
  @SerializedName(SERIALIZED_NAME_TYPE_VALUE_RANGE)
  private TypeValueRangeEnum typeValueRange;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel
   */
  @JsonAdapter(ValueTypeEnum.Adapter.class)
  public enum ValueTypeEnum {
    STRING("String"),
    
    INT("Int"),
    
    DECIMAL("Decimal"),
    
    DATETIME("DateTime"),
    
    BOOLEAN("Boolean"),
    
    MAP("Map"),
    
    LIST("List"),
    
    PROPERTYARRAY("PropertyArray"),
    
    PERCENTAGE("Percentage"),
    
    CODE("Code"),
    
    ID("Id"),
    
    URI("Uri"),
    
    CURRENCYANDAMOUNT("CurrencyAndAmount"),
    
    TRADEPRICE("TradePrice"),
    
    CURRENCY("Currency"),
    
    METRICVALUE("MetricValue"),
    
    RESOURCEID("ResourceId"),
    
    RESULTVALUE("ResultValue"),
    
    CUTLOCALTIME("CutLocalTime"),
    
    DATEORCUTLABEL("DateOrCutLabel");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueTypeEnum fromValue(String value) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValueTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private ValueTypeEnum valueType;

  public static final String SERIALIZED_NAME_ACCEPTABLE_VALUES = "acceptableValues";
  @SerializedName(SERIALIZED_NAME_ACCEPTABLE_VALUES)
  private List<String> acceptableValues = null;

  /**
   * The available values are: NoUnits, Basic, Iso4217Currency
   */
  @JsonAdapter(UnitSchemaEnum.Adapter.class)
  public enum UnitSchemaEnum {
    NOUNITS("NoUnits"),
    
    BASIC("Basic"),
    
    ISO4217CURRENCY("Iso4217Currency");

    private String value;

    UnitSchemaEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitSchemaEnum fromValue(String value) {
      for (UnitSchemaEnum b : UnitSchemaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitSchemaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitSchemaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitSchemaEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitSchemaEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT_SCHEMA = "unitSchema";
  @SerializedName(SERIALIZED_NAME_UNIT_SCHEMA)
  private UnitSchemaEnum unitSchema;

  public static final String SERIALIZED_NAME_ACCEPTABLE_UNITS = "acceptableUnits";
  @SerializedName(SERIALIZED_NAME_ACCEPTABLE_UNITS)
  private List<IUnitDefinitionDto> acceptableUnits = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public DataType href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public DataType typeValueRange(TypeValueRangeEnum typeValueRange) {
    this.typeValueRange = typeValueRange; 
    return this;
  }

   /**
   * The available values are: Open, Closed
   * @return typeValueRange
  **/
  @ApiModelProperty(required = true, value = "The available values are: Open, Closed")
  public TypeValueRangeEnum getTypeValueRange() {
    return typeValueRange;
  }

  public void setTypeValueRange(TypeValueRangeEnum typeValueRange) {
    this.typeValueRange = typeValueRange;
  }


  public DataType id(ResourceId id) {
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


  public DataType displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public DataType description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DataType valueType(ValueTypeEnum valueType) {
    this.valueType = valueType; 
    return this;
  }

   /**
   * The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel
   * @return valueType
  **/
  @ApiModelProperty(required = true, value = "The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel")
  public ValueTypeEnum getValueType() {
    return valueType;
  }

  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  public DataType acceptableValues(List<String> acceptableValues) {
    this.acceptableValues = acceptableValues; 
    return this;
  }

  public DataType addAcceptableValuesItem(String acceptableValuesItem) {
   
    if (this.acceptableValues == null) {
      this.acceptableValues = new ArrayList<>();
    }
    this.acceptableValues.add(acceptableValuesItem);
    return this;
  }

   /**
   * Get acceptableValues
   * @return acceptableValues
  **/
  @ApiModelProperty(value = "")
  public List<String> getAcceptableValues() {
    return acceptableValues;
  }

  public void setAcceptableValues(List<String> acceptableValues) {
    this.acceptableValues = acceptableValues;
  }


  public DataType unitSchema(UnitSchemaEnum unitSchema) {
    this.unitSchema = unitSchema; 
    return this;
  }

   /**
   * The available values are: NoUnits, Basic, Iso4217Currency
   * @return unitSchema
  **/
  @ApiModelProperty(value = "The available values are: NoUnits, Basic, Iso4217Currency")
  public UnitSchemaEnum getUnitSchema() {
    return unitSchema;
  }

  public void setUnitSchema(UnitSchemaEnum unitSchema) {
    this.unitSchema = unitSchema;
  }


  public DataType acceptableUnits(List<IUnitDefinitionDto> acceptableUnits) {
    this.acceptableUnits = acceptableUnits; 
    return this;
  }

  public DataType addAcceptableUnitsItem(IUnitDefinitionDto acceptableUnitsItem) {
   
    if (this.acceptableUnits == null) {
      this.acceptableUnits = new ArrayList<>();
    }
    this.acceptableUnits.add(acceptableUnitsItem);
    return this;
  }

   /**
   * Get acceptableUnits
   * @return acceptableUnits
  **/
  @ApiModelProperty(value = "")
  public List<IUnitDefinitionDto> getAcceptableUnits() {
    return acceptableUnits;
  }

  public void setAcceptableUnits(List<IUnitDefinitionDto> acceptableUnits) {
    this.acceptableUnits = acceptableUnits;
  }


  public DataType links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public DataType addLinksItem(Link linksItem) {
   
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
    sb.append("class DataType {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    typeValueRange: ").append(toIndentedString(typeValueRange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    acceptableValues: ").append(toIndentedString(acceptableValues)).append("\n");
    sb.append("    unitSchema: ").append(toIndentedString(unitSchema)).append("\n");
    sb.append("    acceptableUnits: ").append(toIndentedString(acceptableUnits)).append("\n");
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
