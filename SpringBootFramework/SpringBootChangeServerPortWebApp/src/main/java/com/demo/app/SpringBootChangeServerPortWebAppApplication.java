package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootChangeServerPortWebAppApplication {
	
	//1st way - server.port = 8080 in application.properties (server.port = 0 will run on random available ports)
	//2nd way - SERVER_PORT = 9090 in run as - run configuration - environment
	//3rd way - --server.port = 9999 in run as - run configuration - argument
	//4th way - using cmd in project directory
	//			mvn clean install
	//			java -jar target/.....jar --server.port=9090 OR
	//			java -jar -Dserver.port=9090 target/....jar
	//preferences - Environment, Arguments, Application.properties

	@GetMapping(value="/hello")
	public String getMessage() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootChangeServerPortWebAppApplication.class, args);
	}

}
