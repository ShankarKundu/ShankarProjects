package com.example.SpringbootBeanValidation.Controller;

import com.example.SpringbootBeanValidation.beanclass.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @PostMapping("/validate")
    public void getDisplay(@RequestBody @Valid Employee employee){
         employeeDao.setValue(employee);
    }





}
