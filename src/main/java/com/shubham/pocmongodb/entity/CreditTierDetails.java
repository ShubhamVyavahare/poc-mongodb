package com.shubham.pocmongodb.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class CreditTierDetails {

    @Field(name = "cr_tier_name")
    private String crTierName;

    @Field(name = "rate_condition")
    private RateCondition rateCondition;
}
