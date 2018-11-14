package com.example.springbootWithmongo.service;


import com.example.springbootWithmongo.SpringbootWithmongoApplication;
import com.example.springbootWithmongo.domain.Student;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes =SpringbootWithmongoApplication.class)
public class StudentServiceTestIT {

    @Test
    public void saveTest(){
        Student student = new Student();
        student.setStudent_name("abc");
        student.setMark("A");


    }
}
