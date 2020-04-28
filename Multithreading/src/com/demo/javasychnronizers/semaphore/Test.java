package com.demo.javasychnronizers.semaphore;

import java.util.concurrent.Semaphore;

public class Test {

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(1);
		
		try {
			semaphore.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(semaphore.availablePermits());
		semaphore.release();
		System.out.println(semaphore.availablePermits());
	}

}
