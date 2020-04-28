package com.ds.list;

import java.util.HashSet;

public class LinkedListDetectLoop {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		head = new Node(0);
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		printLinkedList();

		/* Create loop for testing */
		head.next.next.next.next = head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");

	}

	private static void printLinkedList() {

		Node node = head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		System.out.println();
		System.out.println();
	}

	private static boolean detectLoop(Node node) {

		HashSet<Node> set = new HashSet<>();
		
		while(node!=null) {
			if(set.contains(node)) {
				return true;
			}
			
			set.add(node);
			
			node = node.next;
		}
		return false;
	}

}
