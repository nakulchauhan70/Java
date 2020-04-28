package com.demo.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class AbstractApplicationContextDemo {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");
		EmployeeService employeeService = appContext.getBean("employeeService", EmployeeServiceImpl.class);

		getEmployeeById(employeeService);

		appContext.close();
	}

	private static void getEmployeeById(EmployeeService employeeService) {
		Employee emp = employeeService.getEmployee(15);
		System.out.println(emp);
	}
}