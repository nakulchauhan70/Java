package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Employee;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Employee employee = appContext.getBean("employee", Employee.class);

		System.out.println(employee.getClass().getSimpleName() + "\t" + employee.getId() + "\t" + employee.getName()
				+ "\t" + employee.getGender() + "\t" + employee.getPanNo() + "\n");

		((AbstractApplicationContext) appContext).close();
	}

}
