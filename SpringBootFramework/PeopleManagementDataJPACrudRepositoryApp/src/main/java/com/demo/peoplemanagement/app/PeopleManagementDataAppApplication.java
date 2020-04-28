package com.demo.peoplemanagement.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.peoplemanagement.app.entities.Person;
import com.demo.peoplemanagement.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createPerson();
		// createPersons();
		// getPersonByiIds();
		// deletePersonEntity();
//		updatePersonEmailById();
	}

	private void createPerson() {
		Person person = new Person("nakul", "chauhan", "abc@gmail.com", new Date());
		System.out.println(person);
		Person personDb = peopleManagementService.createPerson(person);
		System.out.println(personDb);
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Mike", "Hudson", "mikehudson@gmail.com", new Date()),
				new Person("hela", "brow", "helobrow@gmail.com", new Date()));

		Iterable<Person> persons = peopleManagementService.createPersons(personList);

		persons.forEach(person -> System.out.println(person));
	}

	private void getPersonByiIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);

		Iterable<Person> persons = peopleManagementService.getPersonByIds(ids);

		persons.forEach(System.out::println);
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(3);
		peopleManagementService.deletePersonEntity(person);
	}

	private void updatePersonEmailById() {
		peopleManagementService.updatePersonEmailById(2, "halesdate@gmail.com");

	}

}
