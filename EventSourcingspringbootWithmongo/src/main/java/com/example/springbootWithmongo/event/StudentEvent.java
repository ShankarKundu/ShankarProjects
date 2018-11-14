package com.example.springbootWithmongo.event;

import com.example.springbootWithmongo.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Data
@Document
public class StudentEvent {
@Id
    private String eventId =UUID.randomUUID().toString();
    private Student student;
    private EventStatus eventStatus;

    public StudentEvent(Student student, EventStatus eventStatus) {
        this.student = student;
        this.eventStatus = eventStatus;
    }
}
