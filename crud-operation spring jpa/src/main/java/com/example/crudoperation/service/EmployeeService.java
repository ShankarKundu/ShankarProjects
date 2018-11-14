package com.example.crudoperation.service;

import com.example.crudoperation.bo.EmployeeBo;
import com.example.crudoperation.dto.EmployeeDto;
import com.example.crudoperation.util.customException.CustomException;
import io.vavr.control.Either;

import java.util.List;

public interface EmployeeService {
    public Either<CustomException,String> Register(EmployeeDto dto);
    public List<EmployeeDto> Shows();
    public String Modify(EmployeeDto dto);
    public String Remove(int eno);

    List<EmployeeBo> getAllEmployees();
}
