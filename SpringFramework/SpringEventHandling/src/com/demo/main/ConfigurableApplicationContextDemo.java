package com.demo.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Message;

public class ConfigurableApplicationContextDemo {

	public static void main(String[] args) {

		ConfigurableApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");
		appContext.start();

		Message message = appContext.getBean("message", Message.class);

		System.out.println(message.getClass().getSimpleName() + "\t" + message.getMessageId() + "\t" + message.getMessage());

		System.out.println("//////////////////////////////////////////////////////////////////////");

		appContext.stop();

		appContext.close();

	}

}
