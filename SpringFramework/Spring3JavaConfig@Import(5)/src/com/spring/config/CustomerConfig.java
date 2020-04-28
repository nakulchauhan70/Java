package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.CustomerVO;

@Configuration
public class CustomerConfig {
	
	@Bean(name="customer")
	public CustomerVO customerVO(){
		return new CustomerVO();
	}

}
