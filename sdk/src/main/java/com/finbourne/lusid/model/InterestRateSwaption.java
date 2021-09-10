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
import com.finbourne.lusid.model.InterestRateSwap;
import com.finbourne.lusid.model.InterestRateSwaptionAllOf;
import com.finbourne.lusid.model.LusidInstrument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A swaption, an option to enter into an interest rate swap.
 */
@ApiModel(description = "A swaption, an option to enter into an interest rate swap.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InterestRateSwaption extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  /**
   * The available values are: NotDefined, Pay, Receive
   */
  @JsonAdapter(PayOrReceiveFixedEnum.Adapter.class)
  public enum PayOrReceiveFixedEnum {
    NOTDEFINED("NotDefined"),
    
    PAY("Pay"),
    
    RECEIVE("Receive");

    private String value;

    PayOrReceiveFixedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayOrReceiveFixedEnum fromValue(String value) {
      for (PayOrReceiveFixedEnum b : PayOrReceiveFixedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayOrReceiveFixedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayOrReceiveFixedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayOrReceiveFixedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayOrReceiveFixedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_OR_RECEIVE_FIXED = "payOrReceiveFixed";
  @SerializedName(SERIALIZED_NAME_PAY_OR_RECEIVE_FIXED)
  private PayOrReceiveFixedEnum payOrReceiveFixed;

  /**
   * The available values are: Cash, Physical
   */
  @JsonAdapter(DeliveryMethodEnum.Adapter.class)
  public enum DeliveryMethodEnum {
    CASH("Cash"),
    
    PHYSICAL("Physical");

    private String value;

    DeliveryMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryMethodEnum fromValue(String value) {
      for (DeliveryMethodEnum b : DeliveryMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_METHOD = "deliveryMethod";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHOD)
  private DeliveryMethodEnum deliveryMethod;

  public static final String SERIALIZED_NAME_SWAP = "swap";
  @SerializedName(SERIALIZED_NAME_SWAP)
  private InterestRateSwap swap = null;

  public InterestRateSwaption() {
    //this.instrumentType = this.getClass().getSimpleName();
  }

  public InterestRateSwaption startDate(OffsetDateTime startDate) {
    this.startDate = startDate; 
    return this;
  }

   /**
   * The start date of the instrument. This is normally synonymous with the trade-date.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The start date of the instrument. This is normally synonymous with the trade-date.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public InterestRateSwaption payOrReceiveFixed(PayOrReceiveFixedEnum payOrReceiveFixed) {
    this.payOrReceiveFixed = payOrReceiveFixed; 
    return this;
  }

   /**
   * The available values are: NotDefined, Pay, Receive
   * @return payOrReceiveFixed
  **/
  @ApiModelProperty(required = true, value = "The available values are: NotDefined, Pay, Receive")
  public PayOrReceiveFixedEnum getPayOrReceiveFixed() {
    return payOrReceiveFixed;
  }

  public void setPayOrReceiveFixed(PayOrReceiveFixedEnum payOrReceiveFixed) {
    this.payOrReceiveFixed = payOrReceiveFixed;
  }


  public InterestRateSwaption deliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod; 
    return this;
  }

   /**
   * The available values are: Cash, Physical
   * @return deliveryMethod
  **/
  @ApiModelProperty(required = true, value = "The available values are: Cash, Physical")
  public DeliveryMethodEnum getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  public InterestRateSwaption swap(InterestRateSwap swap) {
    this.swap = swap; 
    return this;
  }

   /**
   * Get swap
   * @return swap
  **/
  @ApiModelProperty(required = true, value = "")
  public InterestRateSwap getSwap() {
    return swap;
  }

  public void setSwap(InterestRateSwap swap) {
    this.swap = swap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestRateSwaption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    payOrReceiveFixed: ").append(toIndentedString(payOrReceiveFixed)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    swap: ").append(toIndentedString(swap)).append("\n");
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
