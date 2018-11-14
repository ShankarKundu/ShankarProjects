package com.example.crudoperation;

import com.example.crudoperation.nt.dto.EmployeeDto;
import com.example.crudoperation.nt.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CrudOperationApplicationTests {

	@Autowired
	EmployeeService ser;

	@Test
	public void contextLoads() {
		/*String insertVal=ser.Register(new EmployeeDto(11,"sha","test",500.02f));
		assertEquals("Insert successfully",insertVal);*/
	}
	@Test
	public void readDataSuccessfullyTest(){
		List<EmployeeDto> lstdto=ser.Shows();
		assertEquals((ser.Shows()).toString(),lstdto.toString());
	}

	@Test
	public void updateDataTest(){
		assertEquals("Update Successfully",ser.Modify(new EmployeeDto(11,"gvbf","test",500.02f)));
	}

	@Test
	public void DeleteDataTest(){
		assertEquals("Delect Successfully",ser.Remove(11));

	}

}
