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
import com.finbourne.lusid.model.RelatedEntity;
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
import java.net.URI;
import java.time.OffsetDateTime;

/**
 * Representation of a relationship containing details of source and target entities, and both outward and inward descriptions.
 */
@ApiModel(description = "Representation of a relationship containing details of source and target entities, and both outward and inward descriptions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompleteRelationship {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_RELATIONSHIP_DEFINITION_ID = "relationshipDefinitionId";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_DEFINITION_ID)
  private ResourceId relationshipDefinitionId;

  public static final String SERIALIZED_NAME_SOURCE_ENTITY = "sourceEntity";
  @SerializedName(SERIALIZED_NAME_SOURCE_ENTITY)
  private RelatedEntity sourceEntity;

  public static final String SERIALIZED_NAME_TARGET_ENTITY = "targetEntity";
  @SerializedName(SERIALIZED_NAME_TARGET_ENTITY)
  private RelatedEntity targetEntity;

  public static final String SERIALIZED_NAME_OUTWARD_DESCRIPTION = "outwardDescription";
  @SerializedName(SERIALIZED_NAME_OUTWARD_DESCRIPTION)
  private String outwardDescription;

  public static final String SERIALIZED_NAME_INWARD_DESCRIPTION = "inwardDescription";
  @SerializedName(SERIALIZED_NAME_INWARD_DESCRIPTION)
  private String inwardDescription;

  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private OffsetDateTime effectiveFrom;


  public CompleteRelationship href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @ApiModelProperty(value = "The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public CompleteRelationship version(Version version) {
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


  public CompleteRelationship relationshipDefinitionId(ResourceId relationshipDefinitionId) {
    this.relationshipDefinitionId = relationshipDefinitionId; 
    return this;
  }

   /**
   * Get relationshipDefinitionId
   * @return relationshipDefinitionId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getRelationshipDefinitionId() {
    return relationshipDefinitionId;
  }

  public void setRelationshipDefinitionId(ResourceId relationshipDefinitionId) {
    this.relationshipDefinitionId = relationshipDefinitionId;
  }


  public CompleteRelationship sourceEntity(RelatedEntity sourceEntity) {
    this.sourceEntity = sourceEntity; 
    return this;
  }

   /**
   * Get sourceEntity
   * @return sourceEntity
  **/
  @ApiModelProperty(required = true, value = "")
  public RelatedEntity getSourceEntity() {
    return sourceEntity;
  }

  public void setSourceEntity(RelatedEntity sourceEntity) {
    this.sourceEntity = sourceEntity;
  }


  public CompleteRelationship targetEntity(RelatedEntity targetEntity) {
    this.targetEntity = targetEntity; 
    return this;
  }

   /**
   * Get targetEntity
   * @return targetEntity
  **/
  @ApiModelProperty(required = true, value = "")
  public RelatedEntity getTargetEntity() {
    return targetEntity;
  }

  public void setTargetEntity(RelatedEntity targetEntity) {
    this.targetEntity = targetEntity;
  }


  public CompleteRelationship outwardDescription(String outwardDescription) {
    this.outwardDescription = outwardDescription; 
    return this;
  }

   /**
   * Description of the relationship based on relationship definition&#39;s outward description.
   * @return outwardDescription
  **/
  @ApiModelProperty(required = true, value = "Description of the relationship based on relationship definition's outward description.")
  public String getOutwardDescription() {
    return outwardDescription;
  }

  public void setOutwardDescription(String outwardDescription) {
    this.outwardDescription = outwardDescription;
  }


  public CompleteRelationship inwardDescription(String inwardDescription) {
    this.inwardDescription = inwardDescription; 
    return this;
  }

   /**
   * Description of the relationship based on relationship definition&#39;s inward description.
   * @return inwardDescription
  **/
  @ApiModelProperty(required = true, value = "Description of the relationship based on relationship definition's inward description.")
  public String getInwardDescription() {
    return inwardDescription;
  }

  public void setInwardDescription(String inwardDescription) {
    this.inwardDescription = inwardDescription;
  }


  public CompleteRelationship effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom; 
    return this;
  }

   /**
   * The effective datetime from which the relationship is valid.
   * @return effectiveFrom
  **/
  @ApiModelProperty(value = "The effective datetime from which the relationship is valid.")
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
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
    sb.append("class CompleteRelationship {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    relationshipDefinitionId: ").append(toIndentedString(relationshipDefinitionId)).append("\n");
    sb.append("    sourceEntity: ").append(toIndentedString(sourceEntity)).append("\n");
    sb.append("    targetEntity: ").append(toIndentedString(targetEntity)).append("\n");
    sb.append("    outwardDescription: ").append(toIndentedString(outwardDescription)).append("\n");
    sb.append("    inwardDescription: ").append(toIndentedString(inwardDescription)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
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
