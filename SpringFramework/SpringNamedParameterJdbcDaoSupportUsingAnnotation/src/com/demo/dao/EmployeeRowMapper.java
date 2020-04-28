package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {	//mapRow is callback method

		Employee emp = new Employee();
		emp.setEmployeeId(rs.getInt("emp_id"));
		emp.setEmployeeName(rs.getString("emp_name"));
		emp.setSalary(rs.getDouble("salary"));
		emp.setEmail(rs.getString("email"));
		emp.setGender(rs.getString("gender"));

		return emp;
	}


}
