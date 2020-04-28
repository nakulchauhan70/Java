package com.demo.peoplemanagement.app.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.peoplemanagement.app.dao.PeopleManagementDao;
import com.demo.peoplemanagement.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementDao peopleManagementDao;

	public CompletableFuture<Person> findByEmailName(String email) {
		return peopleManagementDao.findByEmail(email);
	}

}