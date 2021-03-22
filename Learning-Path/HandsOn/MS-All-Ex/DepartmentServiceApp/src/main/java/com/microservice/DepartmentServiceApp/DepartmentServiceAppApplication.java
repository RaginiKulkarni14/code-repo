package com.microservice.DepartmentServiceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DepartmentServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceAppApplication.class, args);
	}

}
