package com.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.VO.ResponseTemplate;
import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService ;
	
	@PostMapping("/")
	public User saveAllUser(@RequestBody User user)
	{
		Log.info("Inside the saveAllUser method in UserController class");
		return userService.saveAllUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("id") int userId)
	{
		return userService.getUserWithDepartment(userId);
	}
	
	

}
