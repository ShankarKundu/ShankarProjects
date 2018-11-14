package com.example.crudoperation.nt.dao;

import com.example.crudoperation.nt.bo.EmployeeBo;
import com.example.crudoperation.nt.cfg.DataSourceConfig;
import com.example.crudoperation.nt.dto.EmployeeDto;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class EmployeeDaoImpl implements EmplyeeDao {
//private String sql="Insert into employee values(?,?,?,?)";

        @Autowired
        SessionFactory ss;

        Session ses;
        public Session getObj(){
            return  ss.getCurrentSession();
        }

    @Override
    public String Insert(EmployeeBo bo) {
            ses=getObj();
               ses.save(bo);
        return "Insert successfully";
    }

    @Override
    public List<EmployeeBo> Read() {
            ses=getObj();

        Query query=ses.createQuery("from EmployeeBo");
       return query.list();

    }

    @Override
    public String Update(EmployeeDto dto) {
        ses=getObj();
        EmployeeBo bo=new EmployeeBo();
        BeanUtils.copyProperties(dto,bo);
        ses.update(bo);
        return "Update Successfully";
    }

    @Override
    public String Delete(int eno) {
            EmployeeBo bo=new EmployeeBo();
            bo.setEno(eno);
            ses=getObj();
            ses.delete(bo);
        return "Delect Successfully";
    }

    @Override
    public List<EmployeeBo> getEmployee() {
        EmployeeBo bo=new EmployeeBo();
        EmployeeBo bo2=new EmployeeBo();

       List<EmployeeBo> lst=new ArrayList<>() ;
       bo.setEname("Shankar");bo.setEno(1);bo.setSal(100.02f);bo.setJob("Developer");

        bo2.setEname("raja");bo2.setEno(2);bo2.setSal(1235.02f);bo2.setJob("tester");
        lst.add(bo);
        lst.add(bo2);
        return lst;

    }


}
