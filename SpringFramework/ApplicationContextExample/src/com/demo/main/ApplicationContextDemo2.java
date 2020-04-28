package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Employee;

public class ApplicationContextDemo2 {

	public static void main(String[] args) {

		//ApplicationContext appContext = new FileSysteXmlApplicationContext("G:\\Nakul\\Workspace\\JAVA\\SpringFramework\\Bean.xml");
		// Preffered way - give relative path
		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Employee employee = appContext.getBean("employee", Employee.class);

		System.out.println(employee.getEmpId() + "\t" + employee.getEmpName());

		((AbstractApplicationContext) appContext).close();
	}

}
