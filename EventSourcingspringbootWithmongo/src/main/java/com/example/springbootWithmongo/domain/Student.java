package com.example.springbootWithmongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "")
public class Student {

    @Id
    private String _id=UUID.randomUUID().toString();

    private String student_name;

    private  String mark;
}
