package com.microservice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.user.VO.Department;
import com.microservice.user.VO.ResponseTemplate;
import com.microservice.user.entity.User;
import com.microservice.user.repository.UserRepository;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	public User saveAllUser(User user) {
		
		Log.info("Inside the saveAllUser method in UserRepository class");
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(int userId) {
		ResponseTemplate responseTemplate = new ResponseTemplate();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://localhost:8080/departments" + user.getDepartmentId(), Department.class);
		responseTemplate.setDepartment(department);
		responseTemplate.setUser(user);
		return responseTemplate;
	}

}
