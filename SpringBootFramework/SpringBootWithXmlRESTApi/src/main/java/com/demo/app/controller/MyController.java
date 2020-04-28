package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.service.MessageProviderService;

@RestController
public class MyController {
	
	@Autowired
	MessageProviderService messageProviderService;
	

	@GetMapping("/hello")
	public String getMessage() {
		return messageProviderService.getMessage();
	}
	
}
