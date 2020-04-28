package com.demo.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	//Employee emp = new Employee();	- default employee
public class Employee {

	@Value("1000")
	private int id;
	
	@Value("Nakul Chauhan")
	private String name;
	
	@Value("nkul.ic20@gmail.com")
	private String email;
	
	@Value("67")
	private int age;

	@Resource	//Another way to inject bean	but to make - @Value("#{employee.name}") to work - use @Autowired
	private Pancard pancard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

}