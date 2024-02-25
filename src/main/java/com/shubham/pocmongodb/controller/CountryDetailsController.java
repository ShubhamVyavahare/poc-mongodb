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

    @GetMapping("/getByCountryCodeAndName")
    public Country fetchCountryDetailsById(@RequestParam String currency, @RequestParam String currencyCode) {
        return countryDetailsService.fetchCountryDetailsByIdAndName(currency, currencyCode);
    }

}
