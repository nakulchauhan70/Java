package com.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CustomerService {
	private List lists;
	
	public void setLists(List lists) {
		this.lists = lists;
	}
	
	public void displayList() {
		System.out.println(lists);
	}
		
}
