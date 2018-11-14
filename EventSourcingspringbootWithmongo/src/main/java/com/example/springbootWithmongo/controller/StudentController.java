package com.example.springbootWithmongo.controller;

import com.example.springbootWithmongo.Repositary.StudentEventRepositary;
import com.example.springbootWithmongo.StudentService.StudentService;
import com.example.springbootWithmongo.domain.Student;
import com.example.springbootWithmongo.event.EventStatus;
import com.example.springbootWithmongo.event.StudentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    private StudentEventRepositary studentEventRepositary;

    @GetMapping("/students")
    public Flux<Student> getAll(){

        return studentService.showAll();
    }


    @PostMapping("/students")
    public ResponseEntity<String> insertValue(@RequestBody Student student){
      Student s= studentService.Insertion(student).block();

        StudentEvent studentEvent = new StudentEvent(student,EventStatus.CREATE);
        StudentEvent studentEvent1 = studentEventRepositary.save(studentEvent).block();
        Student student1 = studentService.Insertion(student).block();
        if(student1 != null){
            return ResponseEntity.ok("Successfully inserted.");
        }
        return ResponseEntity.ok("Not inserted");
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id){
        Student st=studentService.showById(id).block();
        return  st;
    }
    @PutMapping("/students")
    public ResponseEntity<String> updateValue(@RequestBody Student student){
        Student student1= studentService.updation(student).block();

        StudentEvent studentEvent = new StudentEvent(student1,EventStatus.UPDATE);
        StudentEvent studentEvent1 = studentEventRepositary.save(studentEvent).block();

        if(student1 != null){
            return ResponseEntity.ok("Successfully updated.");
        }
        return ResponseEntity.ok("Not inserted");
    }


    @DeleteMapping("/students")
    public String DeleteVal(@RequestBody Student student){
       Student student1=studentService.showById(student.get_id()).block();
       studentService.Deletion(student.get_id());
        StudentEvent studentEvent=new StudentEvent(student1,EventStatus.DELETE);
        StudentEvent studentEvent1=studentEventRepositary.save(studentEvent).block();
        return "successfull";
    }

    @GetMapping("/studentsEvents")
    public Flux<StudentEvent> retrievePageContentEventsforPageContent() {

        Flux<StudentEvent> studentEvent = studentEventRepositary .findAll();
        int size = studentEvent.getPrefetch();

        if (size != 0) {
            return studentEvent;
        } else {
            return null;
        }
    }


}
