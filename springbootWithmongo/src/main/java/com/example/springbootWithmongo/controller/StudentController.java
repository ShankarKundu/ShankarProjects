package com.example.springbootWithmongo.controller;

import com.example.springbootWithmongo.Repositary.StudentRepositary;
import com.example.springbootWithmongo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class StudentController {
    @Autowired
    private StudentRepositary employeeRepositary;

    @GetMapping("/getS")
    public List<Student> getAll(){

        return employeeRepositary.findAll();
    }
    @PostMapping("/Insert")
    public void InserVal(@RequestBody Student student){
        Random r=new Random();
       int r1= r.nextInt(100);
        //student.setStudent_id(String.valueOf(r1));
        employeeRepositary.save(student);
    }

    @GetMapping("/getOne/{id}")
    public Student getStu(@PathVariable String id){
        Optional<Student> op=employeeRepositary.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        return  new Student();
    }
@PutMapping(value = "/update/{id}")
public void UpdateVAl(@RequestBody Student s, @PathVariable String id){
        employeeRepositary.save(s);

}

    @DeleteMapping("/delete/{_id}")
    public void DeleteVal(@PathVariable(value = "_id") String _id){
        employeeRepositary.deleteById(_id);
    }

}
