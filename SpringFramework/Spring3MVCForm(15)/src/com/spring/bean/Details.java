package com.spring.bean;

public class Details {
	
	private String name;
	private String address;
	private int age;
	
	
	public Details() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//getter and setter methods
	public String toString(){
		return " name : " +name + "\n address : "
               + address + "\n age : " + age;
	}		

}
