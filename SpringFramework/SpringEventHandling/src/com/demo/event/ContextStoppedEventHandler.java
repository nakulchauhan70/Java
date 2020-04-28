package com.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventHandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent cse) {
		System.out.println("ContextStartedEvent received");

		// ApplicationContext ctx = cse.getApplicationContext();

		System.out.println(cse.getSource());
	}

}
