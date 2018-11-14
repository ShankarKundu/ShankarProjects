package com.example.springbootWithmongo.Repositary;


import com.example.springbootWithmongo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepositary extends MongoRepository<Student,String> {
}
