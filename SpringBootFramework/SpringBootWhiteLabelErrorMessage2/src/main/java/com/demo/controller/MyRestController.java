package com.demo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController implements ErrorController{
	
	private static final String PATH = "/error";

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "Hello World!!!!!!!####@#$!!";
	}
	
	@RequestMapping(value=PATH, method=RequestMethod.GET)
	public String defaultErrorMessage() {
		return "Requested resource is not available";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}
