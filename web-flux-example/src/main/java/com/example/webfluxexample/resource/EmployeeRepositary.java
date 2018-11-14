package com.example.webfluxexample.resource;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepositary extends  ReactiveMongoRepository<Employee,String> {
}
