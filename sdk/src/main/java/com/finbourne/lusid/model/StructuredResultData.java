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
import com.finbourne.lusid.model.DataMapKey;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An item of structured result data that is to be inserted into Lusid. This will typically be a Json or Xml document that  contains a set of result data appropriate to a specific entity such as an instrument or potentially an index.
 */
@ApiModel(description = "An item of structured result data that is to be inserted into Lusid. This will typically be a Json or Xml document that  contains a set of result data appropriate to a specific entity such as an instrument or potentially an index.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StructuredResultData {
  public static final String SERIALIZED_NAME_DOCUMENT_FORMAT = "documentFormat";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_FORMAT)
  private String documentFormat;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private String document;

  public static final String SERIALIZED_NAME_DATA_MAP_KEY = "dataMapKey";
  @SerializedName(SERIALIZED_NAME_DATA_MAP_KEY)
  private DataMapKey dataMapKey;


  public StructuredResultData documentFormat(String documentFormat) {
    this.documentFormat = documentFormat; 
    return this;
  }

   /**
   * The format of the accompanying document.
   * @return documentFormat
  **/
  @ApiModelProperty(required = true, value = "The format of the accompanying document.")
  public String getDocumentFormat() {
    return documentFormat;
  }

  public void setDocumentFormat(String documentFormat) {
    this.documentFormat = documentFormat;
  }


  public StructuredResultData version(String version) {
    this.version = version; 
    return this;
  }

   /**
   * The semantic version of the document format; MAJOR.MINOR.PATCH
   * @return version
  **/
  @ApiModelProperty(value = "The semantic version of the document format; MAJOR.MINOR.PATCH")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public StructuredResultData name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The name or description for the document
   * @return name
  **/
  @ApiModelProperty(value = "The name or description for the document")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public StructuredResultData document(String document) {
    this.document = document; 
    return this;
  }

   /**
   * The document that will be stored (or retrieved) and which describes a unit result data entity such as a set of prices or yields
   * @return document
  **/
  @ApiModelProperty(required = true, value = "The document that will be stored (or retrieved) and which describes a unit result data entity such as a set of prices or yields")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }


  public StructuredResultData dataMapKey(DataMapKey dataMapKey) {
    this.dataMapKey = dataMapKey; 
    return this;
  }

   /**
   * Get dataMapKey
   * @return dataMapKey
  **/
  @ApiModelProperty(value = "")
  public DataMapKey getDataMapKey() {
    return dataMapKey;
  }

  public void setDataMapKey(DataMapKey dataMapKey) {
    this.dataMapKey = dataMapKey;
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
    sb.append("class StructuredResultData {\n");
    sb.append("    documentFormat: ").append(toIndentedString(documentFormat)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    dataMapKey: ").append(toIndentedString(dataMapKey)).append("\n");
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
