package com.microservice.custexp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.custexp.entity.Employee;
import com.microservice.custexp.service.EmployeeServiceInterface;
import com.microservice.custexption.BusinessException;
import com.microservice.custexption.ControllerException;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		try
		{
			Employee empCreated = employeeServiceInterface.addEmployee(employee);
			return new ResponseEntity<Employee>(empCreated,HttpStatus.CREATED);
		}
		catch(BusinessException ex)
		{
			ControllerException ce = new ControllerException(ex.getErrCode(),ex.getDesc());
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		catch(Exception ex)
		{
			ControllerException ce = new ControllerException("610","Something went wrong in controller");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> retrieveEmp = employeeServiceInterface.getAllEmployees();
		return new ResponseEntity<List<Employee>>(retrieveEmp,HttpStatus.OK);
	}

	@GetMapping("/update/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("id") int id) {
		Employee empUpdated = employeeServiceInterface.getEmpById(id);
		return new ResponseEntity<Employee>(empUpdated,HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmpById(@PathVariable("id") int id) {
		employeeServiceInterface.deleteEmpById(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}