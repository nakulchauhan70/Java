package com.demo.peoplemanagement.app.dao;

import java.util.concurrent.CompletableFuture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.demo.peoplemanagement.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {
	
	@Async
	CompletableFuture<Person> findByEmail(String email);

}
