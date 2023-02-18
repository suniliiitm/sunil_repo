package com.rest.sp;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/payment")
public class PayController {
	
	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod="dummyPayment")
	public String doPayment() {
		if(new Random().nextInt(100)<=50) {
			throw new RuntimeException("Real logic");
		}
		return "success";
	}
	public String dummyPayment() {
		
		return "fail ";
	}

}
