package com.microservice.user.VO;

import com.microservice.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
	
	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Department department;
	private User user;
	public ResponseTemplate(Department department, User user) {
		super();
		this.department = department;
		this.user = user;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


}