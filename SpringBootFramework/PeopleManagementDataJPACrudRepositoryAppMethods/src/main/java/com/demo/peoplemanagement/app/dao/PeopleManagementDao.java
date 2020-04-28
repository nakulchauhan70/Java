package com.demo.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jmx.export.annotation.ManagedResource;

import com.demo.peoplemanagement.app.ntities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {	//Restrict user to use CrudRepository methods - Use Marker interface Repository

	List<Person> findByLastName(String lastName);
	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
