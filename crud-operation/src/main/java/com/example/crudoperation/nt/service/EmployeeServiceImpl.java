package com.example.crudoperation.nt.service;

import com.example.crudoperation.nt.bo.EmployeeBo;
import com.example.crudoperation.nt.dao.EmployeeDaoImpl;
import com.example.crudoperation.nt.dao.EmplyeeDao;
import com.example.crudoperation.nt.dto.EmployeeDto;
import com.example.crudoperation.nt.useCase.CheckAvalability;
import com.example.crudoperation.nt.util.customException.CustomException;
import io.vavr.control.Either;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmplyeeDao dao;
    @Autowired
    private CheckAvalability checkAvalability;




    @Override
    public Either<CustomException,String> Register(EmployeeDto dto) {
        EmployeeBo bo = new EmployeeBo();


        Either<CustomException,String> val= checkAvalability.getuserAvailable(dto);
        Either<CustomException,String>  nullChk=checkAvalability.getNullCheck(dto);

        if(val.isRight()&&nullChk.isRight()){
            System.out.println("if block Service()");
            BeanUtils.copyProperties(dto, bo);
            String res = dao.Insert(bo);
            return val;
        }
        else {
            if(val.isLeft()) {
                return val;
            }
            else {

                return nullChk;
            }
        }
    }

    @Override
    public List<EmployeeDto> Shows() {

        List<EmployeeDto> listdto = new ArrayList<>();
        List<EmployeeBo> listBo=dao.Read();
        EmployeeDto dto;
        for (EmployeeBo bo : listBo) {
            dto = new EmployeeDto();
            BeanUtils.copyProperties(bo,dto);
            listdto.add(dto);
        }
        return listdto;
    }

    @Override
    public String Modify(EmployeeDto dto) {

            String res = dao.Update(dto);

            System.out.println(res);
            return res;


    }

    @Override
    public String Remove(int eno) {
        String res = dao.Delete(eno);
        return res;
    }
}
