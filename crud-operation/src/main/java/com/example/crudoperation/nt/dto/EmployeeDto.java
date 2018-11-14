package com.example.crudoperation.nt.dto;

import lombok.Data;





@Data
public class EmployeeDto {
    private int eno;
    private String ename;
    private String job;
    private float sal;

    public EmployeeDto() {
    }

    public EmployeeDto(int eno, String ename, String job, float sal) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }
}
