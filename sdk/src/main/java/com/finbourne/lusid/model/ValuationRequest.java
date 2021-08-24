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
import com.finbourne.lusid.model.AggregateSpec;
import com.finbourne.lusid.model.OrderBySpec;
import com.finbourne.lusid.model.PortfolioEntityId;
import com.finbourne.lusid.model.PropertyFilter;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.ValuationSchedule;
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
import java.util.List;

/**
 * Specification object for the parameters of a valuation
 */
@ApiModel(description = "Specification object for the parameters of a valuation")

public class ValuationRequest {
  public static final String SERIALIZED_NAME_RECIPE_ID = "recipeId";
  @SerializedName(SERIALIZED_NAME_RECIPE_ID)
  private ResourceId recipeId = null;

  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<AggregateSpec> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_BY = "groupBy";
  @SerializedName(SERIALIZED_NAME_GROUP_BY)
  private List<String> groupBy = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<PropertyFilter> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<OrderBySpec> sort = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_CURRENCY = "reportCurrency";
  @SerializedName(SERIALIZED_NAME_REPORT_CURRENCY)
  private String reportCurrency;

  public static final String SERIALIZED_NAME_EQUIP_WITH_SUBTOTALS = "equipWithSubtotals";
  @SerializedName(SERIALIZED_NAME_EQUIP_WITH_SUBTOTALS)
  private Boolean equipWithSubtotals;

  public static final String SERIALIZED_NAME_PORTFOLIO_ENTITY_IDS = "portfolioEntityIds";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ENTITY_IDS)
  private List<PortfolioEntityId> portfolioEntityIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUATION_SCHEDULE = "valuationSchedule";
  @SerializedName(SERIALIZED_NAME_VALUATION_SCHEDULE)
  private ValuationSchedule valuationSchedule = null;

  public ValuationRequest recipeId(ResourceId recipeId) {
    this.recipeId = recipeId;
    return this;
  }

   /**
   * Get recipeId
   * @return recipeId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getRecipeId() {
    return recipeId;
  }

  public void setRecipeId(ResourceId recipeId) {
    this.recipeId = recipeId;
  }

  public ValuationRequest asAt(OffsetDateTime asAt) {
    this.asAt = asAt;
    return this;
  }

   /**
   * The asAt date to use
   * @return asAt
  **/
  @ApiModelProperty(value = "The asAt date to use")
  public OffsetDateTime getAsAt() {
    return asAt;
  }

  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
  }

  public ValuationRequest metrics(List<AggregateSpec> metrics) {
    this.metrics = metrics;
    return this;
  }

  public ValuationRequest addMetricsItem(AggregateSpec metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * The set of specifications to calculate or retrieve during the valuation and present in the results. For example:  AggregateSpec(&#39;Holding/default/PV&#39;,&#39;Sum&#39;) for returning the PV (present value) of holdings  AggregateSpec(&#39;Holding/default/Units&#39;,&#39;Sum&#39;) for returning the units of holidays  AggregateSpec(&#39;Instrument/default/LusidInstrumentId&#39;,&#39;Value&#39;) for returning the Lusid Instrument identifier
   * @return metrics
  **/
  @ApiModelProperty(required = true, value = "The set of specifications to calculate or retrieve during the valuation and present in the results. For example:  AggregateSpec('Holding/default/PV','Sum') for returning the PV (present value) of holdings  AggregateSpec('Holding/default/Units','Sum') for returning the units of holidays  AggregateSpec('Instrument/default/LusidInstrumentId','Value') for returning the Lusid Instrument identifier")
  public List<AggregateSpec> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<AggregateSpec> metrics) {
    this.metrics = metrics;
  }

  public ValuationRequest groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ValuationRequest addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

   /**
   * The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out.
   * @return groupBy
  **/
  @ApiModelProperty(value = "The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out.")
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public ValuationRequest filters(List<PropertyFilter> filters) {
    this.filters = filters;
    return this;
  }

  public ValuationRequest addFiltersItem(PropertyFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * A set of filters to use to reduce the data found in a request. Equivalent to the &#39;where ...&#39; part of a Sql select statement.  For example, filter a set of values within a given range or matching a particular value.
   * @return filters
  **/
  @ApiModelProperty(value = "A set of filters to use to reduce the data found in a request. Equivalent to the 'where ...' part of a Sql select statement.  For example, filter a set of values within a given range or matching a particular value.")
  public List<PropertyFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<PropertyFilter> filters) {
    this.filters = filters;
  }

  public ValuationRequest sort(List<OrderBySpec> sort) {
    this.sort = sort;
    return this;
  }

  public ValuationRequest addSortItem(OrderBySpec sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * A (possibly empty/null) set of specifications for how to order the results.
   * @return sort
  **/
  @ApiModelProperty(value = "A (possibly empty/null) set of specifications for how to order the results.")
  public List<OrderBySpec> getSort() {
    return sort;
  }

  public void setSort(List<OrderBySpec> sort) {
    this.sort = sort;
  }

  public ValuationRequest reportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
    return this;
  }

   /**
   * Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.  If not present, then the currency of the relevant portfolio will be used in its place.
   * @return reportCurrency
  **/
  @ApiModelProperty(value = "Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.  If not present, then the currency of the relevant portfolio will be used in its place.")
  public String getReportCurrency() {
    return reportCurrency;
  }

  public void setReportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
  }

  public ValuationRequest equipWithSubtotals(Boolean equipWithSubtotals) {
    this.equipWithSubtotals = equipWithSubtotals;
    return this;
  }

   /**
   * Flag directing the Valuation call to populate the results with subtotals of aggregates.
   * @return equipWithSubtotals
  **/
  @ApiModelProperty(value = "Flag directing the Valuation call to populate the results with subtotals of aggregates.")
  public Boolean getEquipWithSubtotals() {
    return equipWithSubtotals;
  }

  public void setEquipWithSubtotals(Boolean equipWithSubtotals) {
    this.equipWithSubtotals = equipWithSubtotals;
  }

  public ValuationRequest portfolioEntityIds(List<PortfolioEntityId> portfolioEntityIds) {
    this.portfolioEntityIds = portfolioEntityIds;
    return this;
  }

  public ValuationRequest addPortfolioEntityIdsItem(PortfolioEntityId portfolioEntityIdsItem) {
    if (this.portfolioEntityIds == null) {
      this.portfolioEntityIds = new ArrayList<>();
    }
    this.portfolioEntityIds.add(portfolioEntityIdsItem);
    return this;
  }

   /**
   * The set of portfolio or portfolio group identifier(s) that is to be valued.
   * @return portfolioEntityIds
  **/
  @ApiModelProperty(value = "The set of portfolio or portfolio group identifier(s) that is to be valued.")
  public List<PortfolioEntityId> getPortfolioEntityIds() {
    return portfolioEntityIds;
  }

  public void setPortfolioEntityIds(List<PortfolioEntityId> portfolioEntityIds) {
    this.portfolioEntityIds = portfolioEntityIds;
  }

  public ValuationRequest valuationSchedule(ValuationSchedule valuationSchedule) {
    this.valuationSchedule = valuationSchedule;
    return this;
  }

   /**
   * Get valuationSchedule
   * @return valuationSchedule
  **/
  @ApiModelProperty(value = "")
  public ValuationSchedule getValuationSchedule() {
    return valuationSchedule;
  }

  public void setValuationSchedule(ValuationSchedule valuationSchedule) {
    this.valuationSchedule = valuationSchedule;
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
    sb.append("class ValuationRequest {\n");
    sb.append("    recipeId: ").append(toIndentedString(recipeId)).append("\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    reportCurrency: ").append(toIndentedString(reportCurrency)).append("\n");
    sb.append("    equipWithSubtotals: ").append(toIndentedString(equipWithSubtotals)).append("\n");
    sb.append("    portfolioEntityIds: ").append(toIndentedString(portfolioEntityIds)).append("\n");
    sb.append("    valuationSchedule: ").append(toIndentedString(valuationSchedule)).append("\n");
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
