package com.demo.peoplemanagement.app.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.demo.peoplemanagement.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

	@Transactional							//Use whenever using delete or update otherwise it will throw error
	@Modifying(clearAutomatically = true)	//Entity manager flushes all the changes in the database - Optional(By default it will work
	@Query(value = "UPDATE Person set email = :newEmail WHERE id = :personId")
	void updatePersonsEmailById(@Param("personId") int id, @Param("newEmail") String newEmail);

}
