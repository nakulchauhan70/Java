package com.spring.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.CustomerService;

public class App {
	public static void main(String[] args) {
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	      
	    CustomerService cust = (CustomerService) context.getBean("customerservice");
	    cust.displayList();
	}	
}