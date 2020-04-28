package com.demo.javasychnronizers.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class ClientTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" has started");
		
		CyclicBarrier barrier = new CyclicBarrier(4);
		
		PassangerThread p1 = new PassangerThread(1000, barrier, "John");
		PassangerThread p2 = new PassangerThread(2000, barrier, "Martin");
		PassangerThread p3 = new PassangerThread(3000, barrier, "Joya");
		PassangerThread p4 = new PassangerThread(4000, barrier, "Sam");
		PassangerThread p5 = new PassangerThread(5000, barrier, "Pipa");
		PassangerThread p6 = new PassangerThread(6000, barrier, "Dolly");
		PassangerThread p7 = new PassangerThread(7000, barrier, "Harman");
		PassangerThread p8 = new PassangerThread(8000, barrier, "Brad");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName()+" has finished");
	
	}

}
