package com.example.crudoperation.nt.useCase;

import com.example.crudoperation.nt.dto.EmployeeDto;
import com.example.crudoperation.nt.util.customException.CustomException;
import io.vavr.control.Either;

import java.util.List;

public interface CheckAvalabilityInteface {
    public Either<CustomException,String> getuserAvailable(EmployeeDto dto);
    public Either<CustomException,String> getNullCheck(EmployeeDto dto);
}
