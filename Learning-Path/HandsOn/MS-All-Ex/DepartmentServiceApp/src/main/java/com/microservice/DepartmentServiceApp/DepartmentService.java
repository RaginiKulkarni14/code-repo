package com.microservice.DepartmentServiceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) 
	{
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(int departmentId)
	{
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	

}
