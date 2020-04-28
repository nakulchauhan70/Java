package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.HelloWorld;
import com.spring.bean.HelloWorldImpl;

@Configuration
public class AppConfig {

	@Bean(name="helloBean")
	public HelloWorld helloworld() {
		return new HelloWorldImpl();

	}
}
