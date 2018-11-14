package com.example.springbootliquibase.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="student")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    @Column
    private String student_name;
    @Column
    private  String mark;
}
