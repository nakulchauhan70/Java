package com.demo.model;

public class SMSMessage implements Message {

	@Override
	public void displayMessage() {
		System.out.println("Display message from implementation - SMSMessage of message interface");
	}

}
