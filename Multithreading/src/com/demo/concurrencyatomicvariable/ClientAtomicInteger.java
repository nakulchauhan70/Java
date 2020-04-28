package com.demo.concurrencyatomicvariable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class CounterAtomicInteger {

	private AtomicInteger atomicInteger = new AtomicInteger();

	public int getValue() {
		return atomicInteger.get();
	}

	public synchronized int increment() {
		return atomicInteger.getAndIncrement();
	}

}

public class ClientAtomicInteger {
	public static void main(String[] args) {
		ExecutorService executorService = null;
		Counter counter = new Counter();

		try {
			executorService = Executors.newFixedThreadPool(2);

			Runnable task1 = () -> {
				for (int i = 1; i <= 2; i++) {
					counter.increment();
				}
			};

			Runnable task2 = () -> {
				for (int i = 1; i <= 4; i++) {
					counter.increment();
				}
			};

			executorService.submit(task1);
			executorService.submit(task2);
			executorService.awaitTermination(1, TimeUnit.SECONDS);

			System.out.println("Final counter value : " + counter.getValue());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}
	}
}
