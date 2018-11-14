package com.example.crudoperation.util;

import com.example.crudoperation.util.customException.CustomException;
import io.vavr.control.Either;
import org.springframework.stereotype.Component;

@Component
public class UtliEmployeeNullClass {


    public Either<CustomException,String> IsNull(String nm) {
        if(nm==null||nm.length()==0||nm.equals("")){
            return Either.left(new CustomException("Null not allowed"));
        }
        else{
            return Either.right("Success");
        }
    }
}
