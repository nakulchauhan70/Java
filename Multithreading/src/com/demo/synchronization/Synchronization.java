package com.demo.synchronization;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {

		Display d = new Display();
		//Display d1 = new Display();

		Mythread t1 = new Mythread(d, "Dhoni");
		Mythread t2 = new Mythread(d, "Yuvraj");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(d.getCounter());
	}

}

class Mythread extends Thread {
	Display d;
	String name;

	Mythread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class Display {
	int counter;
	public void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning ");
			counter++;
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(name);
		}
		
		System.out.println();

	}
	
	public int getCounter() {
		return counter;
	}
}
