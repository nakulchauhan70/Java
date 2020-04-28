package com.demo.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.book.ticket.app.entities.Ticket;
import com.demo.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingMangementSystemApplicationCLI implements CommandLineRunner {

	@Autowired
	TicketBookingService ticketBookingService;
	
	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingMangementSystemApplicationCLI.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("nakul");
		ticket.setEmail("nakul@yahoo.com");

		ticketBookingService.createTicket(ticket);
		
		System.out.println(dataSource);

	}
}