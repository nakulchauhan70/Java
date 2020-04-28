package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeByEmail(int employeeId, String newEmail) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
