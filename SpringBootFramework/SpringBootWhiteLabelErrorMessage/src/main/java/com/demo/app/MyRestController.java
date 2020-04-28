package com.demo.app;

//If we are placing this class in other package then localhost:8080/welcome won't work
//To make it run successfully add this file in same package or add @ComponenetScan(basePackae="{com.demo.controller}") in after @SpringBootApplication

/*@RestController
public class MyRestController {

	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome() {
		return "Hello World!!!!!!!!!";
	}
}
*/