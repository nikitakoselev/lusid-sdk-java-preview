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
import com.finbourne.lusid.model.CorporateActionTransitionComponent;
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
 * A &#39;transition&#39; within a corporate action, representing a set of output movements paired to a single input position
 */
@ApiModel(description = "A 'transition' within a corporate action, representing a set of output movements paired to a single input position")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CorporateActionTransition {
  public static final String SERIALIZED_NAME_INPUT_TRANSITION = "inputTransition";
  @SerializedName(SERIALIZED_NAME_INPUT_TRANSITION)
  private CorporateActionTransitionComponent inputTransition;

  public static final String SERIALIZED_NAME_OUTPUT_TRANSITIONS = "outputTransitions";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TRANSITIONS)
  private List<CorporateActionTransitionComponent> outputTransitions = null;


  public CorporateActionTransition inputTransition(CorporateActionTransitionComponent inputTransition) {
    this.inputTransition = inputTransition; 
    return this;
  }

   /**
   * Get inputTransition
   * @return inputTransition
  **/
  @ApiModelProperty(value = "")
  public CorporateActionTransitionComponent getInputTransition() {
    return inputTransition;
  }

  public void setInputTransition(CorporateActionTransitionComponent inputTransition) {
    this.inputTransition = inputTransition;
  }


  public CorporateActionTransition outputTransitions(List<CorporateActionTransitionComponent> outputTransitions) {
    this.outputTransitions = outputTransitions; 
    return this;
  }

  public CorporateActionTransition addOutputTransitionsItem(CorporateActionTransitionComponent outputTransitionsItem) {
   
    if (this.outputTransitions == null) {
      this.outputTransitions = new ArrayList<>();
    }
    this.outputTransitions.add(outputTransitionsItem);
    return this;
  }

   /**
   * What will be generated relative to the input transition
   * @return outputTransitions
  **/
  @ApiModelProperty(value = "What will be generated relative to the input transition")
  public List<CorporateActionTransitionComponent> getOutputTransitions() {
    return outputTransitions;
  }

  public void setOutputTransitions(List<CorporateActionTransitionComponent> outputTransitions) {
    this.outputTransitions = outputTransitions;
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
    sb.append("class CorporateActionTransition {\n");
    sb.append("    inputTransition: ").append(toIndentedString(inputTransition)).append("\n");
    sb.append("    outputTransitions: ").append(toIndentedString(outputTransitions)).append("\n");
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
