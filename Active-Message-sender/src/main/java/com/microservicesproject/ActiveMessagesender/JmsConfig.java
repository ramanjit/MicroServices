package com.microservicesproject.ActiveMessagesender;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



//Configuring queue
@Configuration
public class JmsConfig {
	
	
	//declare a bean queue
	@Bean
	public Queue queue()
	{
		//queue name is "test-queue"
		return new ActiveMQQueue("test-queue");
	}
	
}
