

# CreateRecipeRequest

Specification class to request for the creation/supplementing of a configuration recipe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeCreationMarketDataScopes** | **List&lt;String&gt;** | The scopes in which the recipe creation would look for quotes/data. | 
**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**inlineRecipe** | [**ConfigurationRecipe**](ConfigurationRecipe.md) |  |  [optional]
**asAt** | **OffsetDateTime** | The asAt date to use |  [optional]
**effectiveAt** | **String** | The market data time, i.e. the recipe generated will look for rules with this effectiveAt. | 



