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
import com.finbourne.lusid.model.RealisedGainLoss;
import com.finbourne.lusid.model.TransactionPrice;
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
 * A list of output transactions.
 */
@ApiModel(description = "A list of output transactions.")

public class OutputTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_INSTRUMENT_UID = "instrumentUid";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_UID)
  private String instrumentUid;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transactionDate";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private OffsetDateTime transactionDate;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlementDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private OffsetDateTime settlementDate;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Double units;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Double transactionAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_PRICE = "transactionPrice";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PRICE)
  private TransactionPrice transactionPrice = null;

  public static final String SERIALIZED_NAME_TOTAL_CONSIDERATION = "totalConsideration";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONSIDERATION)
  private CurrencyAndAmount totalConsideration = null;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchangeRate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private Double exchangeRate;

  public static final String SERIALIZED_NAME_TRANSACTION_TO_PORTFOLIO_RATE = "transactionToPortfolioRate";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TO_PORTFOLIO_RATE)
  private Double transactionToPortfolioRate;

  public static final String SERIALIZED_NAME_TRANSACTION_CURRENCY = "transactionCurrency";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CURRENCY)
  private String transactionCurrency;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_COUNTERPARTY_ID = "counterpartyId";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ID)
  private String counterpartyId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  /**
   * The status of the transaction. The available values are: Active, Amended, Cancelled
   */
  @JsonAdapter(TransactionStatusEnum.Adapter.class)
  public enum TransactionStatusEnum {
    ACTIVE("Active"),
    
    AMENDED("Amended"),
    
    CANCELLED("Cancelled");

    private String value;

    TransactionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionStatusEnum fromValue(String value) {
      for (TransactionStatusEnum b : TransactionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private TransactionStatusEnum transactionStatus;

  public static final String SERIALIZED_NAME_ENTRY_DATE_TIME = "entryDateTime";
  @SerializedName(SERIALIZED_NAME_ENTRY_DATE_TIME)
  private OffsetDateTime entryDateTime;

  public static final String SERIALIZED_NAME_CANCEL_DATE_TIME = "cancelDateTime";
  @SerializedName(SERIALIZED_NAME_CANCEL_DATE_TIME)
  private OffsetDateTime cancelDateTime;

  public static final String SERIALIZED_NAME_REALISED_GAIN_LOSS = "realisedGainLoss";
  @SerializedName(SERIALIZED_NAME_REALISED_GAIN_LOSS)
  private List<RealisedGainLoss> realisedGainLoss = new ArrayList<>();

  public OutputTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The unique identifier for the transaction.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier for the transaction.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OutputTransaction type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the transaction e.g. &#39;Buy&#39;, &#39;Sell&#39;. The transaction type should have been pre-configured via the System Configuration API endpoint.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the transaction e.g. 'Buy', 'Sell'. The transaction type should have been pre-configured via the System Configuration API endpoint.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OutputTransaction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the transaction. This only exists on transactions generated by LUSID e.g. a holdings adjustment transaction.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the transaction. This only exists on transactions generated by LUSID e.g. a holdings adjustment transaction.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OutputTransaction instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
    return this;
  }

  public OutputTransaction putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    if (this.instrumentIdentifiers == null) {
      this.instrumentIdentifiers = new HashMap<>();
    }
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * A set of instrument identifiers that can resolve the transaction to a unique instrument.
   * @return instrumentIdentifiers
  **/
  @ApiModelProperty(value = "A set of instrument identifiers that can resolve the transaction to a unique instrument.")
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }

  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }

  public OutputTransaction instrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
    return this;
  }

   /**
   * The unqiue Lusid Instrument Id (LUID) of the instrument that the transaction is in.
   * @return instrumentUid
  **/
  @ApiModelProperty(required = true, value = "The unqiue Lusid Instrument Id (LUID) of the instrument that the transaction is in.")
  public String getInstrumentUid() {
    return instrumentUid;
  }

  public void setInstrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
  }

  public OutputTransaction transactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * The date of the transaction.
   * @return transactionDate
  **/
  @ApiModelProperty(required = true, value = "The date of the transaction.")
  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public OutputTransaction settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * The settlement date of the transaction.
   * @return settlementDate
  **/
  @ApiModelProperty(required = true, value = "The settlement date of the transaction.")
  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }

  public OutputTransaction units(Double units) {
    this.units = units;
    return this;
  }

   /**
   * The number of units transacted in the associated instrument.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "The number of units transacted in the associated instrument.")
  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }

  public OutputTransaction transactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * The total value of the transaction in the transaction currency.
   * @return transactionAmount
  **/
  @ApiModelProperty(value = "The total value of the transaction in the transaction currency.")
  public Double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public OutputTransaction transactionPrice(TransactionPrice transactionPrice) {
    this.transactionPrice = transactionPrice;
    return this;
  }

   /**
   * Get transactionPrice
   * @return transactionPrice
  **/
  @ApiModelProperty(value = "")
  public TransactionPrice getTransactionPrice() {
    return transactionPrice;
  }

  public void setTransactionPrice(TransactionPrice transactionPrice) {
    this.transactionPrice = transactionPrice;
  }

  public OutputTransaction totalConsideration(CurrencyAndAmount totalConsideration) {
    this.totalConsideration = totalConsideration;
    return this;
  }

   /**
   * Get totalConsideration
   * @return totalConsideration
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getTotalConsideration() {
    return totalConsideration;
  }

  public void setTotalConsideration(CurrencyAndAmount totalConsideration) {
    this.totalConsideration = totalConsideration;
  }

  public OutputTransaction exchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate between the transaction and settlement currency (settlement currency being represented by the TotalConsideration.Currency). For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate.
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "The exchange rate between the transaction and settlement currency (settlement currency being represented by the TotalConsideration.Currency). For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate.")
  public Double getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OutputTransaction transactionToPortfolioRate(Double transactionToPortfolioRate) {
    this.transactionToPortfolioRate = transactionToPortfolioRate;
    return this;
  }

   /**
   * The exchange rate between the transaction and portfolio currency. For example if the transaction currency is in USD and the portfolio currency is in GBP this this the USD/GBP rate.
   * @return transactionToPortfolioRate
  **/
  @ApiModelProperty(value = "The exchange rate between the transaction and portfolio currency. For example if the transaction currency is in USD and the portfolio currency is in GBP this this the USD/GBP rate.")
  public Double getTransactionToPortfolioRate() {
    return transactionToPortfolioRate;
  }

  public void setTransactionToPortfolioRate(Double transactionToPortfolioRate) {
    this.transactionToPortfolioRate = transactionToPortfolioRate;
  }

  public OutputTransaction transactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
    return this;
  }

   /**
   * The transaction currency.
   * @return transactionCurrency
  **/
  @ApiModelProperty(value = "The transaction currency.")
  public String getTransactionCurrency() {
    return transactionCurrency;
  }

  public void setTransactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
  }

  public OutputTransaction properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
    return this;
  }

  public OutputTransaction putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Set of unique transaction properties and associated values to stored with the transaction. Each property will be from the &#39;Transaction&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "Set of unique transaction properties and associated values to stored with the transaction. Each property will be from the 'Transaction' domain.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }

  public OutputTransaction counterpartyId(String counterpartyId) {
    this.counterpartyId = counterpartyId;
    return this;
  }

   /**
   * The identifier for the counterparty of the transaction.
   * @return counterpartyId
  **/
  @ApiModelProperty(value = "The identifier for the counterparty of the transaction.")
  public String getCounterpartyId() {
    return counterpartyId;
  }

  public void setCounterpartyId(String counterpartyId) {
    this.counterpartyId = counterpartyId;
  }

  public OutputTransaction source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public OutputTransaction transactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * The status of the transaction. The available values are: Active, Amended, Cancelled
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "The status of the transaction. The available values are: Active, Amended, Cancelled")
  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public OutputTransaction entryDateTime(OffsetDateTime entryDateTime) {
    this.entryDateTime = entryDateTime;
    return this;
  }

   /**
   * The asAt datetime that the transaction was added to LUSID.
   * @return entryDateTime
  **/
  @ApiModelProperty(value = "The asAt datetime that the transaction was added to LUSID.")
  public OffsetDateTime getEntryDateTime() {
    return entryDateTime;
  }

  public void setEntryDateTime(OffsetDateTime entryDateTime) {
    this.entryDateTime = entryDateTime;
  }

  public OutputTransaction cancelDateTime(OffsetDateTime cancelDateTime) {
    this.cancelDateTime = cancelDateTime;
    return this;
  }

   /**
   * If the transaction has been cancelled, the asAt datetime that the transaction was cancelled.
   * @return cancelDateTime
  **/
  @ApiModelProperty(value = "If the transaction has been cancelled, the asAt datetime that the transaction was cancelled.")
  public OffsetDateTime getCancelDateTime() {
    return cancelDateTime;
  }

  public void setCancelDateTime(OffsetDateTime cancelDateTime) {
    this.cancelDateTime = cancelDateTime;
  }

  public OutputTransaction realisedGainLoss(List<RealisedGainLoss> realisedGainLoss) {
    this.realisedGainLoss = realisedGainLoss;
    return this;
  }

  public OutputTransaction addRealisedGainLossItem(RealisedGainLoss realisedGainLossItem) {
    if (this.realisedGainLoss == null) {
      this.realisedGainLoss = new ArrayList<>();
    }
    this.realisedGainLoss.add(realisedGainLossItem);
    return this;
  }

   /**
   * The collection of realised gains or losses resulting from relevant transactions e.g. a sale transaction. The cost used in calculating the realised gain or loss is determined by the accounting method defined when the transaction portfolio is created.
   * @return realisedGainLoss
  **/
  @ApiModelProperty(value = "The collection of realised gains or losses resulting from relevant transactions e.g. a sale transaction. The cost used in calculating the realised gain or loss is determined by the accounting method defined when the transaction portfolio is created.")
  public List<RealisedGainLoss> getRealisedGainLoss() {
    return realisedGainLoss;
  }

  public void setRealisedGainLoss(List<RealisedGainLoss> realisedGainLoss) {
    this.realisedGainLoss = realisedGainLoss;
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
    sb.append("class OutputTransaction {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    instrumentUid: ").append(toIndentedString(instrumentUid)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionPrice: ").append(toIndentedString(transactionPrice)).append("\n");
    sb.append("    totalConsideration: ").append(toIndentedString(totalConsideration)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    transactionToPortfolioRate: ").append(toIndentedString(transactionToPortfolioRate)).append("\n");
    sb.append("    transactionCurrency: ").append(toIndentedString(transactionCurrency)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    counterpartyId: ").append(toIndentedString(counterpartyId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    entryDateTime: ").append(toIndentedString(entryDateTime)).append("\n");
    sb.append("    cancelDateTime: ").append(toIndentedString(cancelDateTime)).append("\n");
    sb.append("    realisedGainLoss: ").append(toIndentedString(realisedGainLoss)).append("\n");
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
