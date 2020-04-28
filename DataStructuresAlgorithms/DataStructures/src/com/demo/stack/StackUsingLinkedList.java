package com.demo.stack;

//Root element is the top most element
public class StackUsingLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
			next = null;
		}
	}

	boolean isEmpty() {
		return (root == null) ? true : false;
	}
	
	void push(int data) {
		StackNode newNode= new StackNode(data);
		
		if(root == null) {
			root = newNode;
		}else {
			StackNode temp = root;
			root=newNode;
			newNode.next = temp;
		}
		
		System.out.println(data + " pushed to stack using linked list");
	}
	
	int peek() {
		return (root == null)?Integer.MIN_VALUE:root.data;
	}
	

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Peek element is : "+stack.peek());
	}

}
