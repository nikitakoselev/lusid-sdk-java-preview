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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representation of a relation containing details of source and target entities, and both outward and inward descriptions.
 */
@ApiModel(description = "Representation of a relation containing details of source and target entities, and both outward and inward descriptions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompleteRelation {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_RELATION_DEFINITION_ID = "relationDefinitionId";
  @SerializedName(SERIALIZED_NAME_RELATION_DEFINITION_ID)
  private ResourceId relationDefinitionId;

  public static final String SERIALIZED_NAME_SOURCE_ENTITY_ID = "sourceEntityId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ENTITY_ID)
  private Map<String, String> sourceEntityId = new HashMap<>();

  public static final String SERIALIZED_NAME_TARGET_ENTITY_ID = "targetEntityId";
  @SerializedName(SERIALIZED_NAME_TARGET_ENTITY_ID)
  private Map<String, String> targetEntityId = new HashMap<>();

  public static final String SERIALIZED_NAME_OUTWARD_DESCRIPTION = "outwardDescription";
  @SerializedName(SERIALIZED_NAME_OUTWARD_DESCRIPTION)
  private String outwardDescription;

  public static final String SERIALIZED_NAME_INWARD_DESCRIPTION = "inwardDescription";
  @SerializedName(SERIALIZED_NAME_INWARD_DESCRIPTION)
  private String inwardDescription;

  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private OffsetDateTime effectiveFrom;


  public CompleteRelation href(URI href) {
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


  public CompleteRelation version(Version version) {
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


  public CompleteRelation relationDefinitionId(ResourceId relationDefinitionId) {
    this.relationDefinitionId = relationDefinitionId; 
    return this;
  }

   /**
   * Get relationDefinitionId
   * @return relationDefinitionId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getRelationDefinitionId() {
    return relationDefinitionId;
  }

  public void setRelationDefinitionId(ResourceId relationDefinitionId) {
    this.relationDefinitionId = relationDefinitionId;
  }


  public CompleteRelation sourceEntityId(Map<String, String> sourceEntityId) {
    this.sourceEntityId = sourceEntityId; 
    return this;
  }

  public CompleteRelation putSourceEntityIdItem(String key, String sourceEntityIdItem) {
    this.sourceEntityId.put(key, sourceEntityIdItem);
    return this;
  }

   /**
   * Get sourceEntityId
   * @return sourceEntityId
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getSourceEntityId() {
    return sourceEntityId;
  }

  public void setSourceEntityId(Map<String, String> sourceEntityId) {
    this.sourceEntityId = sourceEntityId;
  }


  public CompleteRelation targetEntityId(Map<String, String> targetEntityId) {
    this.targetEntityId = targetEntityId; 
    return this;
  }

  public CompleteRelation putTargetEntityIdItem(String key, String targetEntityIdItem) {
    this.targetEntityId.put(key, targetEntityIdItem);
    return this;
  }

   /**
   * Get targetEntityId
   * @return targetEntityId
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getTargetEntityId() {
    return targetEntityId;
  }

  public void setTargetEntityId(Map<String, String> targetEntityId) {
    this.targetEntityId = targetEntityId;
  }


  public CompleteRelation outwardDescription(String outwardDescription) {
    this.outwardDescription = outwardDescription; 
    return this;
  }

   /**
   * Get outwardDescription
   * @return outwardDescription
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOutwardDescription() {
    return outwardDescription;
  }

  public void setOutwardDescription(String outwardDescription) {
    this.outwardDescription = outwardDescription;
  }


  public CompleteRelation inwardDescription(String inwardDescription) {
    this.inwardDescription = inwardDescription; 
    return this;
  }

   /**
   * Get inwardDescription
   * @return inwardDescription
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInwardDescription() {
    return inwardDescription;
  }

  public void setInwardDescription(String inwardDescription) {
    this.inwardDescription = inwardDescription;
  }


  public CompleteRelation effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom; 
    return this;
  }

   /**
   * Get effectiveFrom
   * @return effectiveFrom
  **/
  @ApiModelProperty(value = "")
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
    sb.append("class CompleteRelation {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    relationDefinitionId: ").append(toIndentedString(relationDefinitionId)).append("\n");
    sb.append("    sourceEntityId: ").append(toIndentedString(sourceEntityId)).append("\n");
    sb.append("    targetEntityId: ").append(toIndentedString(targetEntityId)).append("\n");
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
