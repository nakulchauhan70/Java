package com.demo.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.peoplemanagement.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

	@Query("SELECT p FROM Person p WHERE p.firstName = :FIRSTNAME AND p.lastName = :LASTNAME")
	List<Person> findByFirstAndLastName(@Param("FIRSTNAME") String firstname, @Param("LASTNAME") String lastname);

}
