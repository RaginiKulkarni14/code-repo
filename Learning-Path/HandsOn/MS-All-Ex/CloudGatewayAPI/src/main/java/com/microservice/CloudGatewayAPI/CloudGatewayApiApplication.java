package com.microservice.CloudGatewayAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
public class CloudGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApiApplication.class, args);
	}

}
