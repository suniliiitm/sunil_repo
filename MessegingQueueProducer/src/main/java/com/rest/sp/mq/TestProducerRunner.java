package com.rest.sp.mq;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rest.sp.mq.producer.MessageProducerGenrator;

@Component
public class TestProducerRunner implements CommandLineRunner {
	@Autowired
	private MessageProducerGenrator messageProducerGenrator;

	@Override
	public void run(String... args) throws Exception {
		
		boolean sent=messageProducerGenrator.sendDate("Hello :"+new Date());
		if(sent) {
			System.out.println("Producer sent data");
		}else {
			System.out.println("Producer did not sent data");
		}
		
	}

}
