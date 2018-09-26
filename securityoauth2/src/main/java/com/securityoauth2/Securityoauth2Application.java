package com.securityoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Securityoauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Securityoauth2Application.class, args);
	}
}
