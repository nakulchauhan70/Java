package com.demo.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {	//Class, Primary key

}