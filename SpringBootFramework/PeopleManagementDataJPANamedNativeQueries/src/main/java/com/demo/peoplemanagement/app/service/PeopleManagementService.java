package com.demo.peoplemanagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.peoplemanagement.app.dao.PeopleManagementDao;
import com.demo.peoplemanagement.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementDao peopleManagementDao;

	public List<Person> getPersonsInfoByLastName(String lastName) {
		return peopleManagementDao.findByLastName(lastName);
	}

	public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {

		return peopleManagementDao.findByFirstNameAndEmail(firstName, email);
	}

}