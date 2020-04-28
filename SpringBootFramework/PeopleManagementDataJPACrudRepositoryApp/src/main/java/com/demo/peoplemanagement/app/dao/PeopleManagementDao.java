package com.demo.peoplemanagement.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.peoplemanagement.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

}
