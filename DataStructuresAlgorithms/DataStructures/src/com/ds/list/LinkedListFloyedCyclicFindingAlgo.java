package com.ds.list;

public class LinkedListFloyedCyclicFindingAlgo {

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

	private static boolean detectLoop(Node node) {
		Node slow_p = head, fast_p = head;

		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;

			if (slow_p == fast_p) {
				return true;
			}
		}

		return false;
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
