package com.rest.sp.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MessegingQueueConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessegingQueueConsumerApplication.class, args);
	}

}
