

# FloatSchedule

Schedule for fixed coupon payments

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | Date to start generate from |  [optional]
**maturityDate** | **OffsetDateTime** | Date to generate to |  [optional]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  |  [optional]
**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  |  [optional]
**indexConventionName** | [**FlowConventionName**](FlowConventionName.md) |  |  [optional]
**indexConventions** | [**IndexConvention**](IndexConvention.md) |  |  [optional]
**notional** | **java.math.BigDecimal** | Scaling factor, the quantity outstanding on which the rate will be paid. |  [optional]
**paymentCurrency** | **String** | Payment currency. This does not have to be the same as the nominal bond or observation/reset currency. |  [optional]
**spread** | **java.math.BigDecimal** | Spread over floating rate given as a fraction. |  [optional]


