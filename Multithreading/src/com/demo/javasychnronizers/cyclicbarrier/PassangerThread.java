package com.demo.javasychnronizers.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class PassangerThread extends Thread{
	private int duration;
	private CyclicBarrier barrier;

	public PassangerThread(int duration, CyclicBarrier barrier, String pname) {
		super(pname);
		this.duration = duration;
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+" is arrived.");
			
			int await = barrier.await();
			if(await == 00) {
				System.out.println("Four passanges have arrived so cab is going to start");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
