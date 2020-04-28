package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/welcome")
	public ModelAndView test() {
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		return new ModelAndView("welcome");
	}
}