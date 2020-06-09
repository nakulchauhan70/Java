package com.kafka.model;

public class User {

	private String name;
	private int age;
	private String dept;

	public User() {
		super();
	}

	public User(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

//	@Override
//	public String toString() {
//		return "User [name=" + name + ", age=" + age + ", dept=" + dept + "]";
//	}

}
