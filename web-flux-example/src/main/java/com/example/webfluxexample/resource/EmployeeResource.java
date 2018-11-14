package com.example.webfluxexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeResource {
    @Autowired
    private EmployeeRepositary employeeRepositary;

    @GetMapping("/all")
    public Flux<Employee> getAll(){
        return employeeRepositary .findAll();
    }
}
