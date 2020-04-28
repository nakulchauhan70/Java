package com.ds.list;

public class LinkedListDeleteElement {

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
		head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);

		
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println("List before deleting 20");
		printLinkedList();

		deleteNode(20);
		System.out.println("List after deleting 20");
		printLinkedList();

	}

	private static void deleteNode(int data) {
		Node current = head, prev = null;
		while (current != null && current.data != data) {
			prev = current;
			current = current.next;
		}

		if (current == null) {
			System.out.println("Entered key is not present");
			return;
		}
		
		prev.next = current.next;
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
}
