package com.microservice.department.service;

import org.springframework.stereotype.Service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		Log.info("Inside saveDepatment method of Department Service");
		return departmentRepository.save(department);
	}

	public Department findDepartmrntById(int departmentId) {
		
		Log.info("Inside findDepartmrntById method of Department Service");
		return departmentRepository.findDepartmrntById(departmentId);
	}
	
	

}
