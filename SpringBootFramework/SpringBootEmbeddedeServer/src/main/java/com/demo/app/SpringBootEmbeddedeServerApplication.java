package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootEmbeddedeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmbeddedeServerApplication.class, args);
	}

}


@RestController
class MyRestController{
	
	@GetMapping("/")
	public String welcome() {
		return "Hello Wolrd!!";
	}
	
}
