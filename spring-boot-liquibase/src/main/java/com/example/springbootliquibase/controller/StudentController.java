package com.example.springbootliquibase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@RestController
public class StudentController {
    @Autowired
    private EmployeeRepositary employeeRepositary;

    @GetMapping("/getS")
    public List<Student> getAll(){

        return employeeRepositary.findAll();
    }
    @PostMapping("/Insert")
    public void InserVal(@RequestBody Student student){
        Random r=new Random();
       int r1= r.nextInt(100);

        employeeRepositary.save(student);
    }

    @GetMapping("/getOne/{id}")
    public Student getStu(@PathVariable Integer id){
        Optional<Student> op=employeeRepositary.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        return  new Student();
    }
@PutMapping(value = "/update/{id}")
public void UpdateVAl(@RequestBody Student s,@PathVariable Integer id){
        employeeRepositary.save(s);

}

    @DeleteMapping("/delete/{id}")
    public void DeleteVal(@PathVariable(value = "id") Integer id){
        employeeRepositary.deleteById(id);
    }

}
