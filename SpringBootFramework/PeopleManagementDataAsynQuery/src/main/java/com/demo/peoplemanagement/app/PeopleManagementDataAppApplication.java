package com.demo.peoplemanagement.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.demo.peoplemanagement.app.entities.Person;
import com.demo.peoplemanagement.app.service.PeopleManagementService;

@SpringBootApplication
@EnableAsync
public class PeopleManagementDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CompletableFuture<Person> completableFuture = peopleManagementService.findByEmailName("mikehudson@gmail.com");
		Person person = completableFuture.get(20, TimeUnit.SECONDS);
		System.out.println(person);
	}

}
