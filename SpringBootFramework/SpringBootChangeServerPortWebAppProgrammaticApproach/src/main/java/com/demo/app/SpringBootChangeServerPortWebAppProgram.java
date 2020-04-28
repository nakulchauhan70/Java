package com.demo.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootChangeServerPortWebAppProgram {
	
	//preferences - EmbeddedServletContainerCustomizer - application.properties - programmatic way
	
	@GetMapping(value="/hello")
	public String getMessage() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootChangeServerPortWebAppProgram.class);
		
		Map<String, Object> configMap = new HashMap<>();
		configMap.put("SERVER_PORT", 9001);
		
		springApplication.setDefaultProperties(configMap);
		springApplication.run(args);
	}

}
