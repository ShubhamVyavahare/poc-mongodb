package com.shubham.pocmongodb.repository;

import com.shubham.pocmongodb.entity.Country;
import com.shubham.pocmongodb.entity.CountryId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDetailsRepository extends MongoRepository<Country, CountryId> {
}
