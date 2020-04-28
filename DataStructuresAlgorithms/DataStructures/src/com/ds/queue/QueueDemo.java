package com.ds.queue;

public class QueueDemo {

	int front, rear, size, capacity;
	int[] array;

	public QueueDemo(int capacity) {
		super();
		this.front = this.size = 0;
		this.capacity = capacity;
		this.array = new int[this.capacity];
		this.rear = this.capacity - 1;
	}

	private void enqueue(int data) {
		this.rear = (this.rear + 1) % this.capacity;
		System.out.println(this.rear);
		this.array[this.rear] = data;
		this.size = this.size + 1;
		System.out.println(data + " enqueued to queue");
	}

	private void dequeue() {
		int data = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		System.out.println(data + " dequeued to queue");
	}

	private boolean isEmpty() {
		return (this.size == 0);
	}

	private boolean isFull() {
		return (this.size == this.capacity);
	}

	private int size() {
		return this.size;
	}

	public static void main(String[] args) {
		
		QueueDemo queue = new QueueDemo(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		System.out.println();

		queue.dequeue();
		queue.dequeue();

		System.out.println();

		System.out.println("queue is empty : " + queue.isEmpty());
		System.out.println("queue is full : " + queue.isFull());
		System.out.println("size of queue : " + queue.size());

	}

}
