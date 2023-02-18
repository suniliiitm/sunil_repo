package com.rest.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rest.sp.model.BankUser;

@Controller
public class BankUserController {
	
	
	@GetMapping("/")
	public  String showRegister(Model model) {
		model.addAttribute("bankUser",new BankUser());
		return "BankUserRegister";
		
	}
	
	@PostMapping("/save")
	public String saveBankUser() {
		
		
		return null;
		
	}

}
