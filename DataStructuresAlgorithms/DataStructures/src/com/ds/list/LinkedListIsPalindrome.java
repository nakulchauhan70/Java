package com.ds.list;

import java.util.Stack;

public class LinkedListIsPalindrome {

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
		Node third = new Node(10);
		Node fourth = new Node(0);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		printLinkedList();

		System.out.println("isPalindrome : " + isPalindrome(head));

	}

	private static boolean isPalindrome(Node head) {
		Node slow = head;
		boolean isPalin = true;
		Stack<Integer> stack = new Stack<>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.next;
		}

		while (head != null) {
			int i = stack.pop();
			if (head.data == i) {
				isPalin = true;
			} else {
				isPalin = false;
				break;
			}

			head = head.next;
		}

		return isPalin;

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
