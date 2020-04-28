package com.spring.controller;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import com.spring.bean.OutputHelper;

public class App {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("Spring-Module.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      

	    OutputHelper obj = (OutputHelper) factory.getBean("OutputHelper");
		obj.generateOutput();
	}	
}
 