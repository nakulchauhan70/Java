package com.spring.controller;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import com.spring.bean.CustomerService;

public class App {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("Spring-Module.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      

	    CustomerService custA = (CustomerService) factory.getBean("customerService");
	    custA.setMsg("Message by custA");
    	System.out.println("Message : " + custA.getMsg());
    	
    	//retrieve it again
    	CustomerService custB = (CustomerService)factory.getBean("customerService");
    	System.out.println("Message : " + custB.getMsg());

	}	
}
 