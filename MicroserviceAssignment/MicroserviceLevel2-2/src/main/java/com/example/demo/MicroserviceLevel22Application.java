package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceLevel22Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceLevel22Application.class, args);
	}

}
