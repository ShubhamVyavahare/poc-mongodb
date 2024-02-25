package com.shubham.pocmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
public class CountryId {

    @Field(name = "curr")
    private String currency;

    @Field(name = "curr_code")
    private String countryCode;
}
