package com.shubham.pocmongodb.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class RateCondition {

    @Field(name = "pricing_method")
    private String pricingMethod;

    @Field(name = "cal_basis")
    private Integer calBasis;

    @Field(name = "tier_list")
    private List<Tier> tierList;
}
