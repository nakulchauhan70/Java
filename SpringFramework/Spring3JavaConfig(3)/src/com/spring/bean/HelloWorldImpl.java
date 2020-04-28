package com.spring.bean;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public void printHelloWorld(String name) {
		System.out.println("Hello "+name);		
	}

}
