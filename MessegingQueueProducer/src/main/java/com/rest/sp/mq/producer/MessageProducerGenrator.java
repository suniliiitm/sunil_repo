package com.rest.sp.mq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducerGenrator {
	@Autowired
	private JmsTemplate jt;
	@Value("${my.jsm.dest}")
	private String destnationName;
	
	public boolean sendDate(String message){
		
		boolean sent=false;
		
		try{
			jt.send(destnationName, (session)->session.createTextMessage(message));
			sent=true;
			
		}catch(Exception e) {
			sent=false;
			e.printStackTrace();
		}
		
		 return sent;
		 
	}
	

}
