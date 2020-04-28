package com.demo.peoplemanagement.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.peoplemanagement.app.dao.PeopleManagementDao;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementDao peopleManagementDao;

	public void updatePersonsEmailById(int id, String newEmail) {
		peopleManagementDao.updatePersonsEmailById(id, newEmail);
	}

}