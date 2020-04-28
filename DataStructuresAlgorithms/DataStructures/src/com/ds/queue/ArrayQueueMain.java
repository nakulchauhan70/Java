package com.ds.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

class Employee {

	private int id;
	private String firstName;
	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void add(Employee emp) {
		if (back == queue.length) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, newArray.length);
		}

		queue[back] = emp;
		back++;
	}

	public void remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		queue[front] = null;
		front++;

		if (size() == 0) {
			front = 0;
			back = 0;
		}
	}

	public Employee peek() {
		return queue[front];
	}
	
	public void printQueue() {
		Arrays.asList(queue).forEach(System.out::println);;
	}

	private int size() {
		return back - front;
	}
}

public class ArrayQueueMain {

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(new Employee(10, "Nakul", "Chauhan"));
		queue.add(new Employee(20, "Nakul", "Chauhan"));
		queue.add(new Employee(30, "Nakul", "Chauhan"));

		queue.printQueue();
		queue.remove();
		queue.printQueue();
		System.out.println(queue.peek());

	}

}
