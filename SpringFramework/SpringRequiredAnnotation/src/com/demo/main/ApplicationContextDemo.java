package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Message;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Message message = appContext.getBean("message", Message.class);

		System.out.println(message.getClass().getSimpleName()+"\t"+message.getId()+"\t"+message.getMsg()+"\n");
		
		((AbstractApplicationContext) appContext).close();
	}

}
