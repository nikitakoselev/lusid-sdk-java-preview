

# ForwardRateAgreementAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | 
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date | 
**domCcy** | **String** | The domestic currency of the instrument. | 
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the rate to be paid, the reference rate, is confirmed/observed | 
**fraRate** | **Double** | The rate at which the FRA is traded. | 
**notional** | **Double** | The amount for which the FRA is traded. | 
**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CashSettled, CdsIndex, Basket, FundingLeg, CrossCurrencySwap, FxSwap, ForwardRateAgreement | 



## Enum: InstrumentTypeEnum

Name | Value
---- | -----
QUOTEDSECURITY | &quot;QuotedSecurity&quot;
INTERESTRATESWAP | &quot;InterestRateSwap&quot;
FXFORWARD | &quot;FxForward&quot;
FUTURE | &quot;Future&quot;
EXOTICINSTRUMENT | &quot;ExoticInstrument&quot;
FXOPTION | &quot;FxOption&quot;
CREDITDEFAULTSWAP | &quot;CreditDefaultSwap&quot;
INTERESTRATESWAPTION | &quot;InterestRateSwaption&quot;
BOND | &quot;Bond&quot;
EQUITYOPTION | &quot;EquityOption&quot;
FIXEDLEG | &quot;FixedLeg&quot;
FLOATINGLEG | &quot;FloatingLeg&quot;
BESPOKECASHFLOWSLEG | &quot;BespokeCashFlowsLeg&quot;
UNKNOWN | &quot;Unknown&quot;
TERMDEPOSIT | &quot;TermDeposit&quot;
CONTRACTFORDIFFERENCE | &quot;ContractForDifference&quot;
EQUITYSWAP | &quot;EquitySwap&quot;
CASHPERPETUAL | &quot;CashPerpetual&quot;
CASHSETTLED | &quot;CashSettled&quot;
CDSINDEX | &quot;CdsIndex&quot;
BASKET | &quot;Basket&quot;
FUNDINGLEG | &quot;FundingLeg&quot;
CROSSCURRENCYSWAP | &quot;CrossCurrencySwap&quot;
FXSWAP | &quot;FxSwap&quot;
FORWARDRATEAGREEMENT | &quot;ForwardRateAgreement&quot;


