package com.demo.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.peoplemanagement.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {	//Restrict user to use CrudRepository methods - Use Marker interface Repository

	List<Person> findByLastName(String lastName);
	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
