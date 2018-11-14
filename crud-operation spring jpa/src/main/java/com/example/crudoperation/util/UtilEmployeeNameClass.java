package com.example.crudoperation.util;

import com.example.crudoperation.util.customException.CustomException;
import io.vavr.control.Either;
import org.springframework.stereotype.Component;

@Component
public class UtilEmployeeNameClass {

    public Either<CustomException,String> getUser(String nm, String ename) {
        if(nm.equals(ename)){
            return Either.left(new CustomException("name is already available"));
        }
        else{
            return Either.right("Success");
        }
    }
}
