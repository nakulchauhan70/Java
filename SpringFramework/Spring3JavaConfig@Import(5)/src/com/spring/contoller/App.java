package com.spring.contoller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.CustomerVO;
import com.spring.bean.SchedularVO;
import com.spring.config.AppConfig;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerVO obj = (CustomerVO) context.getBean("customer");
		obj.printMsg("Spring3 CustomerVO");
		
		SchedularVO obj1 = (SchedularVO) context.getBean("schedular");
		obj1.printMsg("Spring3 SchedularVO");
	}	
}

