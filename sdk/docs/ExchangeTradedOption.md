

# ExchangeTradedOption

Exchange Traded Option Instrument; Lusid-ibor internal representation of an ET Option.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. | 
**contractDetails** | [**ExchangeTradedOptionContractDetails**](ExchangeTradedOptionContractDetails.md) |  | 
**contracts** | **java.math.BigDecimal** | The number of contracts held. | 
**refSpotPrice** | **java.math.BigDecimal** | The reference spot price for the option at which the contract was entered into. | 



