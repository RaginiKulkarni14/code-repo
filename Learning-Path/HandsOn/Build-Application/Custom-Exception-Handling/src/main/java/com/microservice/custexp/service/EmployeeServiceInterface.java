package com.microservice.custexp.service;

import java.util.*;

import com.microservice.custexp.entity.Employee;

public interface EmployeeServiceInterface {
	
	public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmpById(int id);
	
	public void deleteEmpById(int id);
	

}
	