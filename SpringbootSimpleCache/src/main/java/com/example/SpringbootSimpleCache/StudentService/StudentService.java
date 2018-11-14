package com.example.SpringbootSimpleCache.StudentService;

import com.example.SpringbootSimpleCache.domain.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Cacheable("student")

    public Student getStudentById(String id){

        try {
            System.out.println("Going to sleep for 5 sec.to Simulate the backend");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Student(id,"Shankar","pass",90);
    }
}
