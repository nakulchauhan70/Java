package com.spring.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppMethod3Spring {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("Spring-Common.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    OutputHelperSpring output = (OutputHelperSpring)factory.getBean("OutputHelperSpring");
    	output.generateOutput();

	}

}
