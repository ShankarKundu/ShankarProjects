package com.example.crudoperation.nt.bo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
@Data
public class EmployeeBo {
    @Id
    @Column(name="eno")
    private int Eno;
    @Column(name="ename")
    private String Ename;
    @Column(name="job")
    private String job;
    @Column(name="sal")
    private float sal;

    public EmployeeBo() {
    }
}
