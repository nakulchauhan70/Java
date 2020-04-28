package com.demo.model;

public class EmailMessage implements Message {

	@Override
	public void displayMessage() {
		System.out.println("Display message from implementation - EmailMessage of message interface");
	}

}
