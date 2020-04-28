package com.demo.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.app.config.EnvBasedConfig;


//Profile can be set using VM argument as well
//-Dspring.profiles.active=dev - Then no need to define this in application.properties, If you are writing this, it will ignore and run according to VM argument set in rum=n configuration
@SpringBootApplication
public class SpringBootProfilesAppApplication implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	
	
	@Autowired
	EnvBasedConfig envBasedConfig;
	
	//Concept - When dev or prod profile is sactive in application.properties accordingly all the beans defined int the porod/dev will be active. Here we are only using single method with void type, but we can create multiple beans in the profile set bean
	//spring.profiles.active=dev - This dev must be same as Profile("dev") of Profilebean
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesAppApplication.class, args);
	}


	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("DataSource : "+dataSource);
		envBasedConfig.setup();
	}
}