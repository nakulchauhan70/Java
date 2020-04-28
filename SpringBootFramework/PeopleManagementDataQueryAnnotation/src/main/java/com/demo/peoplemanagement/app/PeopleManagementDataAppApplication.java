package com.demo.peoplemanagement.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.peoplemanagement.app.entities.Person;
import com.demo.peoplemanagement.app.service.PeopleManagementService;

//@ComponentScan("com.demo.peoplemanagement.*")
@SpringBootApplication
public class PeopleManagementDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getPersonsInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
	}

	private void getPersonsInfoByFirstNameAndEmail() {
		List<Person> personList = peopleManagementService.getPersonsInfoByFirstNameAndEmail("hela","helabrow@gmail.com");
		personList.forEach(System.out::println);
	}

	private void getPersonsInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("Hele");
		personList.forEach(p -> System.out.println(p));
	}
	
}
