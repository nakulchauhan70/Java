package com.demo.peoplemanagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.peoplemanagement.app.dao.PeopleManagementDao;
import com.demo.peoplemanagement.app.entities.Person;

@Service
public class PeopleManagementService{
	
	@Autowired
	PeopleManagementDao peopleManagementDao;

	public Person createPerson(Person person) {
		return peopleManagementDao.save(person);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peopleManagementDao.save(personList);
		return list;
	}

	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		Iterable<Person> list = peopleManagementDao.findAll(ids);
		//make default constructor of person
		
		return list;
	}

	public void deletePersonEntity(Person person) {
		peopleManagementDao.delete(person);
	}

	public void updatePersonEmailById(int id, String newEmail) {
		Person person = peopleManagementDao.findOne(id);
		
		if(id==person.getId())
			person.setEmail(newEmail);
		
		peopleManagementDao.save(person);
	}

}
