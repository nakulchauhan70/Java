package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.app.service.MessageServiceProvider;

@SpringBootApplication
public class SpringBootApplicationRunnerDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(SpringBootApplicationRunnerDemoApplication.class, args);

		MessageServiceProvider messageServiceProvider = configurableApplicationContext
				.getBean(MessageServiceProvider.class);

		System.out.println(messageServiceProvider.message());
	}

}
