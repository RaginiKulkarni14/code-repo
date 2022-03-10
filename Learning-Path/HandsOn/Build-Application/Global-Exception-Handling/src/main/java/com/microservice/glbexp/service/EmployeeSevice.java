package com.microservice.glbexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.glbexp.entity.Employee;
import com.microservice.glbexp.repository.EmployeeRepo;

@Service
public class EmployeeSevice implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = employeeRepo.findAll();
		return empList;
	}

	@Override
	public Employee getEmpById(int id) {
		return employeeRepo.getById(id);
	}

	@Override
	public void deleteEmpById(int id) {
		employeeRepo.deleteById(id);
	}

}