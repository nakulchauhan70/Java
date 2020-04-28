package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Employee;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Employee employee = appContext.getBean("employee", Employee.class);
		System.out.println(employee.getEmpId() + "\t" + employee.getEmpName());

		employee.setEmpId(1332909);
		employee.setEmpName("Nakul Chauhan");

		Employee employeeSingletone = appContext.getBean("employee", Employee.class);
		System.out.println(employeeSingletone.getEmpId() + "\t" + employeeSingletone.getEmpName());
		

		Employee employee1 = appContext.getBean("employee1", Employee.class);
		System.out.println(employee1.getEmpId() + "\t" + employee1.getEmpName());

		((AbstractApplicationContext) appContext).close();
	}

}
