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
import com.finbourne.lusid.model.ReconciliationLeftRightAddressKeyPair;
import com.finbourne.lusid.model.ValuationRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specification for the reconciliation request. Left and Right hand sides are constructed. Each consists of a valuation of a portfolio  using an aggregation request. The results of this can then be compared to each other. The difference, which is effectively a risk based  difference allows comparison of the effects of changing a recipe, valuation date, or (though it may or may not make logical sense) a portfolio.  For instance, one might look at the difference in risk caused by the addition of transaction to a portfolio, or through changing the valuation  methodology or system.
 */
@ApiModel(description = "Specification for the reconciliation request. Left and Right hand sides are constructed. Each consists of a valuation of a portfolio  using an aggregation request. The results of this can then be compared to each other. The difference, which is effectively a risk based  difference allows comparison of the effects of changing a recipe, valuation date, or (though it may or may not make logical sense) a portfolio.  For instance, one might look at the difference in risk caused by the addition of transaction to a portfolio, or through changing the valuation  methodology or system.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValuationsReconciliationRequest {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private ValuationRequest left;

  public static final String SERIALIZED_NAME_RIGHT = "right";
  @SerializedName(SERIALIZED_NAME_RIGHT)
  private ValuationRequest right;

  public static final String SERIALIZED_NAME_LEFT_TO_RIGHT_MAPPING = "leftToRightMapping";
  @SerializedName(SERIALIZED_NAME_LEFT_TO_RIGHT_MAPPING)
  private List<ReconciliationLeftRightAddressKeyPair> leftToRightMapping = null;

  public static final String SERIALIZED_NAME_PRESERVE_KEYS = "preserveKeys";
  @SerializedName(SERIALIZED_NAME_PRESERVE_KEYS)
  private List<String> preserveKeys = null;


  public ValuationsReconciliationRequest left(ValuationRequest left) {
    this.left = left; 
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @ApiModelProperty(required = true, value = "")
  public ValuationRequest getLeft() {
    return left;
  }

  public void setLeft(ValuationRequest left) {
    this.left = left;
  }


  public ValuationsReconciliationRequest right(ValuationRequest right) {
    this.right = right; 
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @ApiModelProperty(required = true, value = "")
  public ValuationRequest getRight() {
    return right;
  }

  public void setRight(ValuationRequest right) {
    this.right = right;
  }


  public ValuationsReconciliationRequest leftToRightMapping(List<ReconciliationLeftRightAddressKeyPair> leftToRightMapping) {
    this.leftToRightMapping = leftToRightMapping; 
    return this;
  }

  public ValuationsReconciliationRequest addLeftToRightMappingItem(ReconciliationLeftRightAddressKeyPair leftToRightMappingItem) {
   
    if (this.leftToRightMapping == null) {
      this.leftToRightMapping = new ArrayList<>();
    }
    this.leftToRightMapping.add(leftToRightMappingItem);
    return this;
  }

   /**
   * The mapping from property keys requested by left aggregation to property keys on right hand side
   * @return leftToRightMapping
  **/
  @ApiModelProperty(value = "The mapping from property keys requested by left aggregation to property keys on right hand side")
  public List<ReconciliationLeftRightAddressKeyPair> getLeftToRightMapping() {
    return leftToRightMapping;
  }

  public void setLeftToRightMapping(List<ReconciliationLeftRightAddressKeyPair> leftToRightMapping) {
    this.leftToRightMapping = leftToRightMapping;
  }


  public ValuationsReconciliationRequest preserveKeys(List<String> preserveKeys) {
    this.preserveKeys = preserveKeys; 
    return this;
  }

  public ValuationsReconciliationRequest addPreserveKeysItem(String preserveKeysItem) {
   
    if (this.preserveKeys == null) {
      this.preserveKeys = new ArrayList<>();
    }
    this.preserveKeys.add(preserveKeysItem);
    return this;
  }

   /**
   * List of keys to preserve (from rhs) in the diff. Used in conjunction with filtering/grouping
   * @return preserveKeys
  **/
  @ApiModelProperty(value = "List of keys to preserve (from rhs) in the diff. Used in conjunction with filtering/grouping")
  public List<String> getPreserveKeys() {
    return preserveKeys;
  }

  public void setPreserveKeys(List<String> preserveKeys) {
    this.preserveKeys = preserveKeys;
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
    sb.append("class ValuationsReconciliationRequest {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    leftToRightMapping: ").append(toIndentedString(leftToRightMapping)).append("\n");
    sb.append("    preserveKeys: ").append(toIndentedString(preserveKeys)).append("\n");
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
