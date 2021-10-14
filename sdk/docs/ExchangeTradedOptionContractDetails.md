

# ExchangeTradedOptionContractDetails

Most, if not all, information about contracts is standardised. See, e.g. https://www.cmegroup.com/ for  common codes and similar data. This appears to be in common use by well known market information providers, e.g. Bloomberg and Refinitiv.  There is a lot of overlap with this and FuturesContractDetails but as that is an established DTO we must duplicate a number of fields here

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | currency in which the contract is paid. | 
**strike** | **Double** | The option strike, this can be negative for some options. | 
**contractSize** | **Double** | Size of a single contract. By default this should be set to 1000 if otherwise unknown and is defaulted to such. | 
**country** | **String** | Country (code) for the exchange. | 
**deliveryType** | **String** | The delivery type, cash or physical. An option on a future is physically settled if upon exerciseing the  holder receives a future.  Supported string (enumeration) values are: [Cash, Physical]. | 
**description** | **String** | Description of contract | 
**exchangeCode** | **String** | Exchange code for contract  Supported string (enumeration) values are: [ASX, CBOT, CBF, CME, CMX, EOP, HKG, KFE, MFM, OSE, SGX, NYBOT, KCBT, MGE, MATIF, SFE, NYFE, NYM, LIFFE, EUREX, ICE, MSE, NASDAQ, EEX]. | 
**exerciseDate** | **OffsetDateTime** | Exercise Date | 
**exerciseType** | **String** | The exercise type, European, American or Bermudan  Supported string (enumeration) values are: [None, European, Bermudan, American]. | 
**optionCode** | **String** | Option Contract Code, typically one or two letters, e.g. OG &#x3D;&gt; Option on Gold. | 
**optionType** | **String** | The option type, Call or Put.  Supported string (enumeration) values are: [None, Call, Put]. | 
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | 
**underlyingCode** | **String** | Code of the underlying, for an option on futures this should be the futures code | 


