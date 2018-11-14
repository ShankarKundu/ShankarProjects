package com.example.crudoperation.nt.service;

import com.example.crudoperation.nt.bo.EmployeeBo;
import com.example.crudoperation.nt.dto.EmployeeDto;
import com.example.crudoperation.nt.util.customException.CustomException;
import io.vavr.control.Either;

import java.util.List;

public interface EmployeeService {
    public Either<CustomException,String> Register(EmployeeDto dto);
    public List<EmployeeDto> Shows();
    public String Modify(EmployeeDto dto);
    public String Remove(int eno);

}
