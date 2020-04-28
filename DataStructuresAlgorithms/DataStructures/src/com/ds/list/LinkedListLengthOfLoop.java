package com.ds.list;

public class LinkedListLengthOfLoop {

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

		head.next.next.next.next.next = head.next;

		System.out.println(countNodesinLoop(head));

	}

	private static int countNodesinLoop(Node head2) {

		Node p_slow = head, p_fast = head;

		while (p_slow != null && p_fast != null && p_fast.next != null) {
			p_slow = p_slow.next;
			p_fast = p_fast.next.next;

			if (p_slow == p_fast) {
				return countNode(p_slow);
			}
		}
		return 0;
	}

	private static int countNode(Node p_slow) {
		int res = 1;
		Node temp = p_slow;

		while (temp.next != p_slow) {
			res++;
			temp = temp.next;
		}

		return res;
	}

}
