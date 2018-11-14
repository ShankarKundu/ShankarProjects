package com.example.SpringbootBeanValidation.beanclass;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
@Component

public class Employee {
    @Max(value=100,message = "Id must be 1-100")
    private int eid;

    @NotBlank(message = "name shoul not contain blank,null and space")
    private String name;
    @Min(value = 18,message = "age should not be lesthen 18")
    @Max(value = 100,message = "age must not grater then 100")
    private int age;

    private float sal;
    @Email(message = "please email should be valid")
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", email='" + email + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
