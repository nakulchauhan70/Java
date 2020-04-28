package com.demo.javasychnronizers.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = new Connection();

	private int noOfConncetions;

	Semaphore semaphore = new Semaphore(10, true);

	private Connection() {
	}

	public static Connection getConnection() {
		return instance;
	}

	public void connect() {
		try {
			semaphore.acquire();
			synchronized (this) {
				noOfConncetions++;
				System.out.println("Current connection :" + noOfConncetions);
			}

			Thread.sleep(1000);

			synchronized (this) {
				noOfConncetions--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}

	}
}
