package com.boot.app.StudentSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/")
	public String getMessage() {
		return "Hello Student";
	}
}
