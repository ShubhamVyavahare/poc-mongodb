package com.shubham.pocmongodb.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Tier {

    @Field(name = "spread_rate")
    private String spreadRate;

}

