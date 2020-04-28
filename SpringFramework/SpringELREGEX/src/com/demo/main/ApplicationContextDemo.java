package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.EmailValidator;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		EmailValidator emailValidator = appContext.getBean("emailValidator", EmailValidator.class);

		System.out.println(emailValidator.isValidEmail());
		
		((AbstractApplicationContext) appContext).close();

	}

}