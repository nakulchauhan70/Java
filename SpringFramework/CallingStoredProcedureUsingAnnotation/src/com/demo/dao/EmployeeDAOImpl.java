package com.demo.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SimpleJdbcCall simpleJdbcCall;
//
//	public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
//		this.simpleJdbcCall = simpleJdbcCall;
//	}

	@Override
	public Employee getEmployee(int employeeId) {

		simpleJdbcCall.withProcedureName("getEmployeeNameAndSalaryById");

		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empId", employeeId); // empId - used in stored procedure

		Map<String, Object> outMap = simpleJdbcCall.execute(inputMap);

		Employee emp = new Employee();
		emp.setEmployeeName((String) outMap.get("name"));
		emp.setSalary((double) outMap.get("sal"));

		return emp;
	}
}