package com.example.springbootliquibase.controller;


import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepositary extends JpaRepository<Student,Integer> {

}
