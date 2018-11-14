package com.example.SpringbootEhCache.resource;

import com.example.SpringbootEhCache.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UserCache {

    @Cacheable(cacheNames ="userCache")
    public Student getStd(String id) {
        System.out.println("Get for Student Details from DB we need to tkae some time");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Student(id,"Shankar","90");

    }
}
