package com.microservice.jpamysqlexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getAllUser()
	{
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") int id)
	{
		return userRepository.findById(id).orElseThrow(() -> new ResourseNotFound("User not found"));
	}
	
	@PostMapping
	public User createUser(@RequestBody User newUser)
	{
		return userRepository.save(newUser);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User newUser,@PathVariable("id") int id)
	{
		User existingUser = userRepository.findById(id).orElseThrow(() -> new ResourseNotFound("User not found"));
		existingUser.setId(newUser.getId());
		existingUser.setName(newUser.getName());
		existingUser.setEmail(newUser.getEmail());
		return existingUser;
		
	}
}
