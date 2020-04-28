package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringBootWithXmlRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithXmlRestApiApplication.class, args);
	}

}
