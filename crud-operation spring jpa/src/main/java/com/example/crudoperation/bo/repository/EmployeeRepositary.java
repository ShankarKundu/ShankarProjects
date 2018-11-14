package com.example.crudoperation.bo.repository;

import com.example.crudoperation.bo.EmployeeBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmployeeRepositary extends JpaRepository<EmployeeBo,Long> {
}
