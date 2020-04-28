package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Message;
import com.demo.service.Communication;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Communication communication = appContext.getBean("communication", Communication.class);

		System.out.println(communication.getClass().getSimpleName()+"\t"+communication.getCommId()+"\t"+communication.getCommNm()+"\n");
		
		Message message = communication.getMessage();
		
		System.out.println(message.getClass().getSimpleName()+"\t"+message.getId()+"\t"+message.getRole());
		message.displayMessage();

		((AbstractApplicationContext) appContext).close();
	}

}
