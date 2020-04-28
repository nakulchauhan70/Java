package com.demo.service;

import com.demo.model.Message;

public class Communication {	//Target bean
	Message message;			//Injecting Bean

	public Communication(Message message) {
		super();
		this.message = message;
	}
	
	public void display() {
		this.message.displayMessage();
	}

}
