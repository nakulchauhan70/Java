package com.demo.model;

public class Message {

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

	public void init() throws Exception {
		System.out.println("init custome name to afterPropertiesSet is called after bean initialization ");
	}

	public void destroyMethod() throws Exception {
		System.out.println("destroMethod custome name to destroy bean is going to destroy");
	}

}
