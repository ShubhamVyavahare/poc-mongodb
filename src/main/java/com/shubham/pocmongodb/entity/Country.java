package com.shubham.pocmongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "country-details")
@Data
public class Country {

    @Id
    @Field(name = "country_id")
    private CountryId countryId;

    @Field(name = "country_name")
    private String countryName;

    @Field(name = "credit_tier_details")
    private List<CreditTierDetails> creditTierDetails;

}
