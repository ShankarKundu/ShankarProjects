package com.example.springjpanewcurdApp.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.val;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
   private int errorCode;
   private String message;
   private String problemWith;

}
