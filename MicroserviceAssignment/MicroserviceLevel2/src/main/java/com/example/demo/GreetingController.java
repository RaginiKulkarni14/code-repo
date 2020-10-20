package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	public GreetingController() {
	}

	@Value("${my.greeting:default value}")
	private String greetingMessage;
	
	@Value("${my.list.value}")
	private List<String> listValues;
	
	@Autowired
	private CoSettings coSettings;

	@GetMapping("/greetings")
	public String greetings()
	{
		//return "my.greeting"+greetingMessage+"dbConnection"+coSettings.getConnection();
		return "my.list::"+listValues+" "+"dbhost"+coSettings.getHost();
	}
}
