package com.demo.synchronization;

public class SynchronizedJoin {

	public static void main(String[] args) throws InterruptedException {
		MakingCounter r = new MakingCounter();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(r.getCounter());
	}

}

class MakingCounter implements Runnable {

	int counter;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 20000; i++) {
				counter++;
			}
		}
	}

	public int getCounter() {
		return counter;
	}
}
