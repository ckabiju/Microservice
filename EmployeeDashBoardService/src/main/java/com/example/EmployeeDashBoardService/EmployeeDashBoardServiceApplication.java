package com.example.EmployeeDashBoardService;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EmployeeDashBoardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDashBoardServiceApplication.class, args);
	}

	
	  @Bean
	  @LoadBalanced 
	  public RestTemplate restTemplate(RestTemplateBuilder builder) {
	  return builder
			  .setReadTimeout(Duration.ofMillis(100))
			  .setConnectTimeout(Duration.ofMillis(100))
			  .build(); }
	 
}
