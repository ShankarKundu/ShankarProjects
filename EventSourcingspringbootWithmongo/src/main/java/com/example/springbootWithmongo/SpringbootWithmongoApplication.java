package com.example.springbootWithmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringbootWithmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithmongoApplication.class, args);
	}
}
