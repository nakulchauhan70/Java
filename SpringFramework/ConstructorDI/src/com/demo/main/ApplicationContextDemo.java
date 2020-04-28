package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.service.Communication;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Communication communication = appContext.getBean("communication", Communication.class);

		communication.display();

		((AbstractApplicationContext) appContext).close();
	}

}
