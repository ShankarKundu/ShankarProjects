package com.example.SpringbootSimpleCache.StudentController;

import com.example.SpringbootSimpleCache.StudentService.StudentService;
import com.example.SpringbootSimpleCache.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;
    @GetMapping("/student/{id}")
    public Student get(@PathVariable String id){
        System.out.println("Search by ID "+id);
        return service.getStudentById(id);
    }
}

