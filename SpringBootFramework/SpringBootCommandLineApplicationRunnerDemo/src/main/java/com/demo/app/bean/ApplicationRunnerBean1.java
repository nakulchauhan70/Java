package com.demo.app.bean;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-10000)	//negatives having the highest priority
public class ApplicationRunnerBean1 implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(getClass().getSimpleName());
	}

}
