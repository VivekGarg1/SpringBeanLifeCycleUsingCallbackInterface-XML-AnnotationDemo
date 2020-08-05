package com.home.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		//ApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingXml.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingAnnotation.xml");
		Message message = context.getBean("message", Message.class);
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		((AbstractApplicationContext) context).close();
		
	}

}
