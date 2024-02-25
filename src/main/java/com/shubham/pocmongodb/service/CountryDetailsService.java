package com.shubham.pocmongodb.service;

import com.shubham.pocmongodb.entity.Country;
import com.shubham.pocmongodb.entity.CountryId;
import com.shubham.pocmongodb.repository.CountryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class CountryDetailsService {

    @Autowired
    private CountryDetailsRepository countryDetailsRepository;


    public Country createUpdateCountry(Country country) {
        return countryDetailsRepository.save(country);
    }

    public Country fetchCountryDetailsByIdAndName(String currency, String currencyCode) {

        CountryId countryId = new CountryId(currency, currencyCode);

        Optional<Country> countryDetails = countryDetailsRepository.findById(countryId);

        if (countryDetails.isPresent())
            return countryDetails.get();

        return null;
    }
}
