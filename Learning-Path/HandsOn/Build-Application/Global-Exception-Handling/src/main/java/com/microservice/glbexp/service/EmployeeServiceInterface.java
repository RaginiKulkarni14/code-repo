package com.microservice.glbexp.service;

import java.util.*;

import com.microservice.glbexp.entity.Employee;

public interface EmployeeServiceInterface {
	
	public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmpById(int id);
	
	public void deleteEmpById(int id);
	

}
	