package com.example.springbootWithmongo.Repositary;

import com.example.springbootWithmongo.event.EventStatus;
import com.example.springbootWithmongo.event.StudentEvent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentEventRepositary extends ReactiveMongoRepository<StudentEvent,String> {

}
