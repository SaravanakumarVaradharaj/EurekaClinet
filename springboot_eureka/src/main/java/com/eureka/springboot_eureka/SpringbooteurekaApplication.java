package com.eureka.springboot_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbooteurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooteurekaApplication.class, args);
	}

}
