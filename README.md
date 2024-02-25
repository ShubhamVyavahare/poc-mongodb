GET Request : 
curl --location 'http://localhost:8080/api/country/getByCountryCodeAndName?currency=USD&currencyCode=133'

PUT Request : 
curl --location --request PUT 'http://localhost:8080/api/country/update' \
--header 'Content-Type: application/json' \
--data '{
    "countryId": {
        "currency": "USD",
        "countryCode": "133"
    },
    "countryName": "INDIA",
    "creditTierDetails": [
        {
            "crTierName": "crTierName_1e223fe2e09a-2",
            "rateCondition": {
                "pricingMethod": "pricingMethod_4cc620dcb058",
                "calBasis": 0,
                "tierList": [
                    {
                        "spreadRate": "spreadRate_93b2e0b261bd"
                    }
                ]
            }
        },
        {
            "crTierName": "crTierName_1e223fe2e09a-1",
            "rateCondition": {
                "pricingMethod": "pricingMethod_4cc620dcb058-1",
                "calBasis": 1,
                "tierList": [
                    {
                        "spreadRate": "spreadRate_93b2e0b261bd-1"
                    }
                ]
            }
        }
    ]
}'
