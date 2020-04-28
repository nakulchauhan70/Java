package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Ticket;
import com.demo.model.TicketVendingMachine;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");
		TicketVendingMachine ticketVendingMachine = appContext.getBean("ticketVendingMachine", TicketVendingMachine.class);

		Ticket ticket = ticketVendingMachine.generateTicket();

		System.out.println(ticket.printTicket());

		((AbstractApplicationContext) appContext).close();

	}

}
