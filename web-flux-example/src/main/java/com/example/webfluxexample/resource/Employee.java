package com.example.webfluxexample.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Employee {
    private String id;
    private String name;
    private Long  sal;
}
