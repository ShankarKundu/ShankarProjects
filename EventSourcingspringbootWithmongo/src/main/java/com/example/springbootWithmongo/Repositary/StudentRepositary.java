package com.example.springbootWithmongo.Repositary;


import com.example.springbootWithmongo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepositary extends ReactiveMongoRepository<Student,String> {
}
