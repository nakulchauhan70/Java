package com.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.demo.model.Employee;

public class EmployeeDAOImpl extends NamedParameterJdbcDaoSupport implements EmployeeDAO {

	@Override
	public void createEmployee(Employee employee) {
		
		String sql = "INSERT INTO `management`.`employee` (`emp_name`, `salary`, `email`, `gender`) VALUES (:empName, :salary, :email, :gender)";
		
//		Map<String, Object> inputMap = new HashMap<>();
//		inputMap.put("empId", employeeId);
		
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empName", employee.getEmployeeName());
		inputMap.addValue("salary", employee.getSalary());
		inputMap.addValue("email", employee.getEmail());
		inputMap.addValue("gender", employee.getGender());
		
		int update = getNamedParameterJdbcTemplate().update(sql, inputMap);
		
		if(update>0) {
			System.out.println("Employee created successfully.");
		}else {
			System.out.println("Employee is unable to create");
		}
		
	}
	
	@Override
	public Employee getEmployee(int employeeId) {
		String sql = "SELECT * FROM `management`.`employee` WHERE emp_id = :empId";

		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empId", employeeId);
		
		Employee emp = getNamedParameterJdbcTemplate().queryForObject(sql, inputMap, new EmployeeRowMapper());
		return emp;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		String sql = "DELETE FROM `management`.`employee` WHERE emp_id = :empId";
		
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empId", employeeId);
		
		int delete = getNamedParameterJdbcTemplate().update(sql, inputMap);
		
		if(delete>0) {
			System.out.println("Employee deleted successfully.");
		}else {
			System.out.println("Employee is unable to delete");
		}
	}

	@Override
	public void updateEmployeeByEmail(int employeeId, String newEmail) {
		String sql = "UPDATE `management`.`employee` SET email = :email WHERE emp_id = :empId";
		
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empId", employeeId);
		inputMap.addValue("email", newEmail);

		int update = getNamedParameterJdbcTemplate().update(sql, inputMap);
		
		if(update>0) {
			System.out.println("Employee updated successfully.");
		}else {
			System.out.println("Employee is unable to update");
		}
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		String sql = "SELECT * FROM `management`.`employee`";
		List<Employee> empList = getNamedParameterJdbcTemplate().query(sql, new EmployeeRowMapper());
		return empList;

	}

}
