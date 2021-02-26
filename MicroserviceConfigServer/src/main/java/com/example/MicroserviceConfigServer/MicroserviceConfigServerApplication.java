package com.example.MicroserviceConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer  //instruct Spring Boot to consider this service as a config server application.
@SpringBootApplication
public class MicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigServerApplication.class, args);
	}

}
