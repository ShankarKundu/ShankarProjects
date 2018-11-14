package com.example.crudoperation.nt.util.customException;


import lombok.Getter;

@Getter
public class ExceptionResponse {

    int errorcode;
    String msg;

    public ExceptionResponse(int errorcode, String msg) {
        this.errorcode = errorcode;
        this.msg = msg;
    }
}
