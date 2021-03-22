package com.microservice.StudentAppliaction;

import javax.persistence.Entity;


public class ResponseTemplateVO {
	
	private Student student;
	private Department department;
	public ResponseTemplateVO() {
		super();
	}
	public ResponseTemplateVO(Student student, Department department) {
		super();
		this.student = student;
		this.department = department;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
