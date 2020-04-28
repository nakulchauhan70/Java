package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void createEmployee(Employee employee) {
		hibernateTemplate.save(employee);		
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
	}}
