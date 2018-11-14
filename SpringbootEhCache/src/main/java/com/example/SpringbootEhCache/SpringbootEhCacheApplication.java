package com.example.SpringbootEhCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootEhCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEhCacheApplication.class, args);
	}
}
