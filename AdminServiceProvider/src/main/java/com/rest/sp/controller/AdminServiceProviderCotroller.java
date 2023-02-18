package com.rest.sp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class AdminServiceProviderCotroller {

	@GetMapping("/show")
	public String showMessage() {
		
		return "Hello";
	}
}
