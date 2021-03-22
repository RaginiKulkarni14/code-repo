package com.microservice.EurekaServerAppliaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerAppliactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAppliactionApplication.class, args);
	}

}
