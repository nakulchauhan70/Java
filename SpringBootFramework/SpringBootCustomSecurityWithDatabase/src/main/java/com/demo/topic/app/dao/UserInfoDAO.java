package com.demo.topic.app.dao;

import com.demo.topic.app.entities.UserInfo;

public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}