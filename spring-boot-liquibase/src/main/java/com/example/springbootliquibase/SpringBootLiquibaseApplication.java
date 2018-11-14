package com.example.springbootliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.example.springbootliquibase")
public class SpringBootLiquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiquibaseApplication.class, args);
	}
}
