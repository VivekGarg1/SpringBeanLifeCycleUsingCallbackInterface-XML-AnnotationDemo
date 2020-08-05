package com.home.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message {//implements  DisposableBean,InitializingBean//Callback interfaces
	
	private int messageId;
	private String message;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//Callback interfaces implemented methods
	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going through init process!!!");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroyed!!!");
		
	}*/
	
	//Using XML configuration
	/*public void inIt() throws Exception {
		System.out.println("Bean is going through init process!!!");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroyed!!!");
		
	}*/
	
	//Using annotation configuration

	@PostConstruct
	public void inIt() throws Exception {
		System.out.println("Bean is going through init process!!!");
		
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroyed!!!");
		
	}
}
