package com.microservice.glbexp.controller;

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

import com.microservice.glbexp.entity.Employee;
import com.microservice.glbexp.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
			Employee empCreated = employeeServiceInterface.addEmployee(employee);
			return new ResponseEntity<Employee>(empCreated,HttpStatus.CREATED);
		
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