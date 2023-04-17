package com.teena.spring.microservice.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TeenaVimalSofiaComp303Assignment4Application {

	public static void main(String[] args) {
		SpringApplication.run(TeenaVimalSofiaComp303Assignment4Application.class, args);
		System.out.println("Spring Boot Microservice discovery server started!!!");
	}

}
