package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.SchedularVO;

@Configuration
public class SchedularConfig {
	
	@Bean(name="schedular")
	public SchedularVO suchedulerVO(){
		
		return new SchedularVO();
		
	}
	
}
