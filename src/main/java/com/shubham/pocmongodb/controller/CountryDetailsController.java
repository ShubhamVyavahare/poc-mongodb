package com.shubham.pocmongodb.controller;

import com.shubham.pocmongodb.entity.Country;
import com.shubham.pocmongodb.entity.CountryId;
import com.shubham.pocmongodb.service.CountryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/country")
public class CountryDetailsController {

    @Autowired
    private CountryDetailsService countryDetailsService;

    @PutMapping("/update")
    public Country createCountry(@RequestBody Country country) {
        return countryDetailsService.createUpdateCountry(country);
    }

    @PostMapping("/getByCountryCodeAndName")
    public Country fetchCountryDetailsById(@RequestBody CountryId countryId) {
        return countryDetailsService.fetchCountryDetailsByIdAndName(countryId);
    }

}
