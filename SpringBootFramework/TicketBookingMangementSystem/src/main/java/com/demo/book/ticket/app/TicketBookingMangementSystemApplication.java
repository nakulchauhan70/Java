package com.demo.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.book.ticket.app.entities.Ticket;
import com.demo.book.ticket.app.service.TicketBookingService;

@SpringBootApplication	// it will automatically make component scan like this: @ComponentScan("com.demo.book.ticket.app.entities.Ticket")
public class TicketBookingMangementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingMangementSystemApplication.class, args);
		
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		
//		String[] beans = applicationContext.getBeanDefinitionNames();
//        Arrays.sort(beans);
//        for (String bean : beans) {
//            System.out.println(bean);
//        }
		
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("nakul");
		ticket.setEmail("nakul@yahoo.com");
		
		ticketBookingService.createTicket(ticket);
	}
}