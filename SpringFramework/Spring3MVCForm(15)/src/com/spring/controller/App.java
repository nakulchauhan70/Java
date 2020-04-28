package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


import com.spring.bean.Details;

@Controller
public class App {
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","command", new Details());
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String student(@ModelAttribute("SpringWeb") Details details, ModelMap model) {
		
		model.addAttribute("name", details.getName());
	      model.addAttribute("age", details.getAge());
	      model.addAttribute("address", details.getAddress());
	      
	      return "result";

	}
	

}
