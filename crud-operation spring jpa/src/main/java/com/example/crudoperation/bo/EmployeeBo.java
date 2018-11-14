package com.example.crudoperation.bo;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

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
