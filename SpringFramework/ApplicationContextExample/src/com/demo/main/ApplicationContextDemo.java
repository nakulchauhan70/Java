package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Employee;

public class ApplicationContextDemo {
	
	
public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Bean.xml");
		Employee employee = appContext.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmpId()+"\t"+employee.getEmpName());
		
		((AbstractApplicationContext) appContext).close();
	}

	
}
