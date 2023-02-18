package com.rest.sp.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pro/hello")
public class ProfileController {
	
	@Value("${spring.message}")
	public String message;
	
	@GetMapping
	public String hello() {
		
		return message;
	}
	

}
