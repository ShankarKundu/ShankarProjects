package com.example.crudoperation.Controller;
import com.example.crudoperation.bo.EmployeeBo;
import com.example.crudoperation.bo.repository.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class EmployeeController {

        @Autowired
    EmployeeRepositary employeeRepositary;


    @GetMapping("/alldetails")
    public List<EmployeeBo> retrieveAllStudents() {
        List<EmployeeBo> lstb=new ArrayList<>();
        return employeeRepositary.findAll();

    }
    @PostMapping("/insert")
    public EmployeeBo insertion(@RequestBody EmployeeBo bo){
        return employeeRepositary.save(bo);
    }




}
