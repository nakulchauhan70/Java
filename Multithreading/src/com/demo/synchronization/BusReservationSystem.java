package com.demo.synchronization;

public class BusReservationSystem {

	public static void main(String[] args) {

		// Problem : 3 seats are available but 2 people(threads) wants to book 2 2 tickets, which
		// is impossible
		
		TicketCounter ticketCounter = new TicketCounter();
		
		TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"Nakul",2);
		TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Ajay",1);

		t1.start();
		t2.start();
	}

}

class TicketCounter{
	private int availableSeats = 3;
	
	public synchronized void bookTicket(String pname, int noOfSeats) {
		if(noOfSeats>0 && availableSeats>=noOfSeats) {
			System.out.println("Hi, "+pname+" : "+noOfSeats+" seats are booked successfully.");
			availableSeats = availableSeats - noOfSeats;
		}else {
			System.out.println("hi, "+pname+" : "+" seats are not available");
		}
	}
}

class TicketBookingThread extends Thread{
	private TicketCounter ticketCounter;
	private String pname;
	private int noOfSeats;
	
	public TicketBookingThread(TicketCounter ticketCounter, String pname, int noOfSeats) {
		super();
		this.ticketCounter = ticketCounter;
		this.pname = pname;
		this.noOfSeats = noOfSeats;
	}

	public void run() {
		ticketCounter.bookTicket(pname, noOfSeats);
	}
	
	
}
