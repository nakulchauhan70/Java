package com.demo.model;

import org.springframework.beans.factory.annotation.Required;

public class Message {

	private int id;
	private String msg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}
	
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
