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

/**
 * CreateRelationshipDefinitionRequest
 */

public class CreateRelationshipDefinitionRequest {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SOURCE_ENTITY_TYPE = "sourceEntityType";
  @SerializedName(SERIALIZED_NAME_SOURCE_ENTITY_TYPE)
  private String sourceEntityType;

  public static final String SERIALIZED_NAME_TARGET_ENTITY_TYPE = "targetEntityType";
  @SerializedName(SERIALIZED_NAME_TARGET_ENTITY_TYPE)
  private String targetEntityType;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_OUTWARD_DESCRIPTION = "outwardDescription";
  @SerializedName(SERIALIZED_NAME_OUTWARD_DESCRIPTION)
  private String outwardDescription;

  public static final String SERIALIZED_NAME_INWARD_DESCRIPTION = "inwardDescription";
  @SerializedName(SERIALIZED_NAME_INWARD_DESCRIPTION)
  private String inwardDescription;

  public static final String SERIALIZED_NAME_LIFE_TIME = "lifeTime";
  @SerializedName(SERIALIZED_NAME_LIFE_TIME)
  private String lifeTime;

  public static final String SERIALIZED_NAME_RELATIONSHIP_CARDINALITY = "relationshipCardinality";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_CARDINALITY)
  private String relationshipCardinality;

  public CreateRelationshipDefinitionRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope that the relationship definition exists in.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The scope that the relationship definition exists in.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public CreateRelationshipDefinitionRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the relationship definition. Together with the scope this uniquely defines the relationship definition.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The code of the relationship definition. Together with the scope this uniquely defines the relationship definition.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CreateRelationshipDefinitionRequest sourceEntityType(String sourceEntityType) {
    this.sourceEntityType = sourceEntityType;
    return this;
  }

   /**
   * The entity type of the source entity object must be, allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39; and &#39;LegalEntity&#39;.
   * @return sourceEntityType
  **/
  @ApiModelProperty(required = true, value = "The entity type of the source entity object must be, allowed values are 'Portfolio', 'PortfolioGroup', 'Person' and 'LegalEntity'.")
  public String getSourceEntityType() {
    return sourceEntityType;
  }

  public void setSourceEntityType(String sourceEntityType) {
    this.sourceEntityType = sourceEntityType;
  }

  public CreateRelationshipDefinitionRequest targetEntityType(String targetEntityType) {
    this.targetEntityType = targetEntityType;
    return this;
  }

   /**
   * The entity type of the target entity object must be, allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39; and &#39;LegalEntity&#39;.
   * @return targetEntityType
  **/
  @ApiModelProperty(required = true, value = "The entity type of the target entity object must be, allowed values are 'Portfolio', 'PortfolioGroup', 'Person' and 'LegalEntity'.")
  public String getTargetEntityType() {
    return targetEntityType;
  }

  public void setTargetEntityType(String targetEntityType) {
    this.targetEntityType = targetEntityType;
  }

  public CreateRelationshipDefinitionRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the relationship definition.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name of the relationship definition.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CreateRelationshipDefinitionRequest outwardDescription(String outwardDescription) {
    this.outwardDescription = outwardDescription;
    return this;
  }

   /**
   * The description to relate source entity object and target entity object.
   * @return outwardDescription
  **/
  @ApiModelProperty(required = true, value = "The description to relate source entity object and target entity object.")
  public String getOutwardDescription() {
    return outwardDescription;
  }

  public void setOutwardDescription(String outwardDescription) {
    this.outwardDescription = outwardDescription;
  }

  public CreateRelationshipDefinitionRequest inwardDescription(String inwardDescription) {
    this.inwardDescription = inwardDescription;
    return this;
  }

   /**
   * The description to relate target entity object and source entity object.
   * @return inwardDescription
  **/
  @ApiModelProperty(required = true, value = "The description to relate target entity object and source entity object.")
  public String getInwardDescription() {
    return inwardDescription;
  }

  public void setInwardDescription(String inwardDescription) {
    this.inwardDescription = inwardDescription;
  }

  public CreateRelationshipDefinitionRequest lifeTime(String lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

   /**
   * Describes how the relationships can change over time. Allowed values are &#39;Perpetual&#39; and &#39;TimeVariant&#39;, defaults to &#39;Perpetual&#39; if not specified.
   * @return lifeTime
  **/
  @ApiModelProperty(value = "Describes how the relationships can change over time. Allowed values are 'Perpetual' and 'TimeVariant', defaults to 'Perpetual' if not specified.")
  public String getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(String lifeTime) {
    this.lifeTime = lifeTime;
  }

  public CreateRelationshipDefinitionRequest relationshipCardinality(String relationshipCardinality) {
    this.relationshipCardinality = relationshipCardinality;
    return this;
  }

   /**
   * Describes the cardinality of the relationship with a specific source entity object and relationships under this definition. Allowed values are &#39;ManyToMany&#39; and &#39;OneToMany&#39;, defaults to &#39;ManyToMany&#39; if not specified.
   * @return relationshipCardinality
  **/
  @ApiModelProperty(value = "Describes the cardinality of the relationship with a specific source entity object and relationships under this definition. Allowed values are 'ManyToMany' and 'OneToMany', defaults to 'ManyToMany' if not specified.")
  public String getRelationshipCardinality() {
    return relationshipCardinality;
  }

  public void setRelationshipCardinality(String relationshipCardinality) {
    this.relationshipCardinality = relationshipCardinality;
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
    sb.append("class CreateRelationshipDefinitionRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    sourceEntityType: ").append(toIndentedString(sourceEntityType)).append("\n");
    sb.append("    targetEntityType: ").append(toIndentedString(targetEntityType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    outwardDescription: ").append(toIndentedString(outwardDescription)).append("\n");
    sb.append("    inwardDescription: ").append(toIndentedString(inwardDescription)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    relationshipCardinality: ").append(toIndentedString(relationshipCardinality)).append("\n");
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
