package com.example.SpringbootBeanValidation.Controller;

import com.example.SpringbootBeanValidation.beanclass.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
Employee employee;


    public void setValue(Employee employee) {

        this.employee=employee;
    }
}
