package com.demo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLoggerApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootLoggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
		logger.error("Error found");
		logger.warn("Warn found");
		logger.info("Info foundkkkkkkkkkkkkkkkkkkkkkkkkkk"); // Default logging level is info
		logger.debug("Debug found");
	}

	@RequestMapping("/")
	public String welcome() {
		String name = "kk";
		if (name.length() == 2) {
			throw new RuntimeException("Opps exception has occured");
		}
		return "Hello World!!";
	}

}
