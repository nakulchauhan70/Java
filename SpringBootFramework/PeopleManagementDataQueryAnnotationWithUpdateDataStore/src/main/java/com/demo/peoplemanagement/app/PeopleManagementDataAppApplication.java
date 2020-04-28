package com.demo.peoplemanagement.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.peoplemanagement.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		peopleManagementService.updatePersonsEmailById(9,"newEmail@gmail.com");
	}

}
