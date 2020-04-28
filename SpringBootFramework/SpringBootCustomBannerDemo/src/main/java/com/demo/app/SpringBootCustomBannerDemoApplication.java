package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCustomBannerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomBannerDemoApplication.class, args);
		
//		SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
//      app.setBannerMode(Banner.Mode.OFF);
//      app.run(args);
//        
//      There are 3 Banner.Mode
//        1. OFF – Disable printing of the banner.
//        2. CONSOLE – Print the banner to System.out.
//        3. LOG – Print the banner to the log file.
	}

}
