package com.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component				//Employee emp = new Employee();
@Scope("prototype")		//@Scope - mean default scope singleton
public class Employee {

	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
