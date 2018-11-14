package com.example.springbootWithmongo.StudentService;

import com.example.springbootWithmongo.Repositary.StudentRepositary;
import com.example.springbootWithmongo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class StudentService {


    @Autowired
   StudentRepositary studentRepositary;

    public Flux<Student> showAll(){

        return studentRepositary.findAll();
    }

    public Mono<Student> Insertion(Student student){

        return studentRepositary.save(student);

    }

    public Mono<Student> showById(String id){
        return studentRepositary.findById(id);


    }

   public  Mono<Student> updation(Student s){
       return  studentRepositary.save(s);

    }
    public void Deletion(String id){
        studentRepositary.deleteById(id).subscribe().isDisposed();
    }
}
