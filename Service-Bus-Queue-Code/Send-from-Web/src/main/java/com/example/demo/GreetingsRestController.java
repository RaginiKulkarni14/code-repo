package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.Instant;

@RestController
class GreetingsRestController {

		@GetMapping("/hi")
		String hello() {
				return "Hello " + Instant.now().toString();
		}
		
		
		@GetMapping("/home")
	    public ModelAndView home() {
	    	return new ModelAndView("home");
	    	
	    }
}
