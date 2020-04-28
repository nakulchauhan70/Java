package com.spring.contoller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.CustomerVO;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("SpringModule.xml");

		CustomerVO obj = (CustomerVO) context.getBean("CustomerBean");
		//obj.printMsg("Spring3 CustomerVO");
		System.out.println("obj::"+obj);
		
	}	
}

