package com.example.crudoperation.nt.Controller;


import com.example.crudoperation.nt.dto.EmployeeDto;
import com.example.crudoperation.nt.service.EmployeeService;
import com.example.crudoperation.nt.util.customException.CustomException;
import io.vavr.control.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;


    @PostMapping("insert1")
    public ResponseEntity<String> InsertVal(@RequestBody EmployeeDto dto) {
        Either<CustomException, String> res = service.Register(dto);
        if (res.isRight()) {

            return ResponseEntity.ok(res.get());

        } else {

            throw res.getLeft();
        }
    }
    @GetMapping("getdata")
    public List<EmployeeDto> Display(){
        List<EmployeeDto> lst=service.Shows();
        return  lst ;
    }
    @PutMapping("update")
    public String UpdateValue(@RequestBody EmployeeDto dto){
        return service.Modify(dto);
    }

    @DeleteMapping("delete")
    public String DeleteVal(@RequestParam(value ="id") int id){
        return service.Remove(id);

    }


}
