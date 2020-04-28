package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDAO {
	
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployee(int employeeId);
	public abstract void deleteEmployee(int employeeId);
	public abstract void updateEmployeeByEmail(int employeeId, String newEmail);
	public abstract List<Employee> getAllEmployeeDetails();

}
