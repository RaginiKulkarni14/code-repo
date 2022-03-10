package com.microservice.custexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.custexp.entity.Employee;
import com.microservice.custexp.repository.EmployeeRepo;
import com.microservice.custexption.BusinessException;

@Service
public class EmployeeSevice implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		if (employee.getName().isEmpty() || employee.getName().length() == 0) {
			throw new BusinessException("600", "Name field is empty");
		}
		try {
			return employeeRepo.save(employee);
		} catch (IllegalArgumentException ex) {
			throw new BusinessException("601", "Emp object doesn't have valid data" + ex.getMessage());
		} catch (Exception ex) {
			throw new BusinessException("602", "Something went wrong in service layer" + ex.getMessage());
		}

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = employeeRepo.findAll();
		if(empList.isEmpty())
		{
			throw new BusinessException("609", "Emp list is empty");
		}
		try {
			return empList;
		} catch (Exception ex) {
			throw new BusinessException("608", "Something went wrong in service layer" + ex.getMessage());
		}
	}

	@Override
	public Employee getEmpById(int id) {
		try {
			return employeeRepo.getById(id);
		} catch (IllegalArgumentException ex) {
			throw new BusinessException("604", "Emp ID isn't valid" + ex.getMessage());
		} catch (Exception ex) {
			throw new BusinessException("605", "Something went wrong in service layer" + ex.getMessage());
		}

	}

	@Override
	public void deleteEmpById(int id) {
		try {
			employeeRepo.deleteById(id);
		} catch (IllegalArgumentException ex) {
			throw new BusinessException("606", "Emp ID isn't valid" + ex.getMessage());
		} catch (Exception ex) {
			throw new BusinessException("607", "Something went wrong in service layer" + ex.getMessage());
		}
	}

}