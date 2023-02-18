package com.rest.sp.mq.cons;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerService {
	
	@JmsListener(destination="${my.jsm.dest}")
	public void readData(String message) {
		
		System.out.println("Data at Consumer ===>"+message);
	}

}
