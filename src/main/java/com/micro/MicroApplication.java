package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroApplication {
	public static void main(String[] args) throws Exception {
		 System.setProperty("spring.config.name", "MicroServer-server");
		 System.out.println("this is microservice1");
		SpringApplication.run(MicroApplication.class, args);
	}

}
