package com.demo.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.peoplemanagement.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {	//Restrict user to use CrudRepository methods - Use Marker interface Repository

	@Query(value = "SELECT p FROM Person p WHERE p.lastName=?1")	//If we remove 1, 2 from query it will also work
	List<Person> findByLastName(String lastName);
	
	@Query(value = "SELECT * FROM person WHERE fname=?1 AND email=?2", nativeQuery=true)
	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
