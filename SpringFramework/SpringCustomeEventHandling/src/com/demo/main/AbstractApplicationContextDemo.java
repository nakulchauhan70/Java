package com.demo.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.event.CustomEventPublisher;

public class AbstractApplicationContextDemo {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		CustomEventPublisher customEventPublisher = appContext.getBean("customEventPublisher", CustomEventPublisher.class);

		customEventPublisher.publishEvent();
		
		appContext.close();

	}

}
