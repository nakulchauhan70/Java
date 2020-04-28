package com.spring.controller;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.bean.CustomerService;

public class App {
	public static void main(String[] args) {
		
	    ApplicationContext context1 = new ClassPathXmlApplicationContext("Spring-Module.xml");
	      

	    CustomerService custA = new CustomerService();
	    custA.setMsg("Message by custA");
    	System.out.println("Message : " + custA.getMsg());
    	
    	//retrieve it again
    	CustomerService custB = new CustomerService();
    	System.out.println("Message : " + custB.getMsg());

	}	
}
/*https://www.mkyong.com/spring/spring-auto-scanning-components/*/