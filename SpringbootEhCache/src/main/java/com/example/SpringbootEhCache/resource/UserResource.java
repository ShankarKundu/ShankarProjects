package com.example.SpringbootEhCache.resource;

import com.example.SpringbootEhCache.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    @Autowired
    UserCache userCache;
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return userCache.getStd(id);

    }
}
