package com.demo.stack;

//Last element is the top most element
public class StackUsingArray {

	int top;
	int max = 1000;
	int[] a = new int[max];

	boolean isEmpty() {
		return top < 0;
	}

	boolean push(int data) {
		if (top >= (max - 1)) {
			System.out.println("Stack overflow");
			return false;
		} else {
			a[++top] = data;
			System.out.println(data + " pushed to stack using array");
			return true;

		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int pop = a[--top];
			return pop;
		}
	}

	int peek() {
		return a[top];
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Peek element is : " + stack.peek());
	}

}
