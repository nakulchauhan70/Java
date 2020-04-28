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
	
	//1st way - application.properties - /SpringBootChangeContextPathWebApp
	//2nd way - SERVER_CONTEXT_PATH = /SpringBootChangeContextPathWebApp - run configuration - environment
	//3rd way - USing EmbbeddebServletCongtainereCustomizeinterface
	//4th way - using cmd in project directory
	
	@GetMapping(value="/hello")
	public String getMessage() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootChangeServerPortWebAppProgram.class);
		
		Map<String, Object> configMap = new HashMap<>();
		configMap.put("SERVER_PORT", 9001);
		configMap.put("SERVER_CONTEXT_PATH", "/mywebappmap");
		
		springApplication.setDefaultProperties(configMap);
		springApplication.run(args);
	}

}
