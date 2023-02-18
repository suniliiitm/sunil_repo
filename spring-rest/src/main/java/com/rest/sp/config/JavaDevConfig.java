package com.rest.sp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;


@Profile("dev")
@Configuration
public class JavaDevConfig {
	
	@PostConstruct
	public void test() {
		System.out.println("Loded dev environment");
	}

}
