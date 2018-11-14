package com.example.crudoperation.nt.dao;
import com.example.crudoperation.nt.bo.EmployeeBo;
import com.example.crudoperation.nt.dto.EmployeeDto;

import java.util.List;

public interface EmplyeeDao {
    public String Insert (EmployeeBo bo);
    public List<EmployeeBo> Read();
    public String Update(EmployeeDto dto);
    public String Delete(int eno);
    public List<EmployeeBo> getEmployee();




}
