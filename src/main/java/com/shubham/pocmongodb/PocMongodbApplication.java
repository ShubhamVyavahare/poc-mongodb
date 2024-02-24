package com.shubham.pocmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PocMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocMongodbApplication.class, args);
	}

}
