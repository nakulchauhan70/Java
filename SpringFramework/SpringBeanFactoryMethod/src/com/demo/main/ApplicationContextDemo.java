package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.ATM;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");
		ATM atm = appContext.getBean("atm", ATM.class);

		atm.printBalanceInformation("AAAA32232Q32AA");
		
		((AbstractApplicationContext) appContext).close();

	}

}
