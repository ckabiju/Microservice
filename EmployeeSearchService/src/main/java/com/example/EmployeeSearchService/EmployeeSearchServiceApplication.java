package com.example.EmployeeSearchService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient  // register this service as a eureka client.
@SpringBootApplication
public class EmployeeSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSearchServiceApplication.class, args);
	}

}
