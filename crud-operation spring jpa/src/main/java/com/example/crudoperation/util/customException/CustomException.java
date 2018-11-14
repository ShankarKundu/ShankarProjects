package com.example.crudoperation.util.customException;

import lombok.Data;

@Data
public class CustomException extends RuntimeException
{
    String msg;
    public CustomException(String msg){
        this.msg=msg;
    }

}
