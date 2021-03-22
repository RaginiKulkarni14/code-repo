package com.microservice.CloudGatewayAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/studentServiceFallback")
	public String studentServiceFallback()
	{
		return "not responding studentServiceCallback";
	}

	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback()
	{
		return "not responding departmentServiceCallback";
	}

	
}
