package com.microservice.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.department.entity.Department;
import com.microservice.department.service.DepartmentService;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
//@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/test")
	public String hello()
	{
		return "hello";
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		Log.info("Inside saveDepatment method of Department Controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmrntById(@PathVariable("id") int departmentId)
	{
		Log.info("Inside findDepartmrntById method of Department Controller");
		return departmentService.findDepartmrntById(departmentId);
	}

}
