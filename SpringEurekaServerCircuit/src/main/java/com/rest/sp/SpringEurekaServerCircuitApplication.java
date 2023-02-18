package com.rest.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServerCircuitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerCircuitApplication.class, args);
	}

}
