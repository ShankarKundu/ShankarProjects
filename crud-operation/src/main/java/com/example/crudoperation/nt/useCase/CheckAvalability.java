package com.example.crudoperation.nt.useCase;

import com.example.crudoperation.nt.bo.EmployeeBo;
import com.example.crudoperation.nt.dao.EmplyeeDao;
import com.example.crudoperation.nt.dto.EmployeeDto;
import com.example.crudoperation.nt.util.UtilEmployeeNameClass;
import com.example.crudoperation.nt.util.UtliEmployeeNullClass;
import com.example.crudoperation.nt.util.customException.CustomException;
import io.vavr.control.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CheckAvalability implements  CheckAvalabilityInteface                    {
    @Autowired
    UtilEmployeeNameClass unc;
    @Autowired
    UtliEmployeeNullClass nulC;
    @Autowired
    EmplyeeDao dao;

    public Either<CustomException,String> getuserAvailable(EmployeeDto dto) {
        Either<CustomException,String>  rs=null;
    String nm=dto.getEname();
    List<EmployeeBo> show=dao.Read();
    for(EmployeeBo edto:show){
        rs=unc.getUser(nm,edto.getEname());
    }
    return rs;
    }


    public Either<CustomException,String>  getNullCheck(EmployeeDto dto) {
        String nm=dto.getEname();
        return nulC.IsNull(nm);

    }
}
