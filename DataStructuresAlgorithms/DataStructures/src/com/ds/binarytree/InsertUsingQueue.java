package com.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertUsingQueue {

	static class Node {

		int key;
		Node left, right;

		public Node(int key) {
			this.key = key;
			left = right = null;
		}
	}

	static Node root;
	static Node temp = root;
	
	private static void insert(int key, Node temp) {
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(temp);
		
		while(!queue.isEmpty()) {
			temp = queue.peek();
			queue.remove();	
			
			if(temp.left == null) {
				temp.left = new Node(key);
				break;
			}else {
				queue.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(key);
				break;
			}else {
				queue.add(temp.right);
			}
			
		}
	}

	private static void inOrderTravesal(Node root) {

		if (root == null)
			return;

		inOrderTravesal(root.left);
		System.out.print(root.key+" ");
		inOrderTravesal(root.right);
	}
	
	private static void levelOrderTravesal(Node root) {
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			temp = queue.peek();
			queue.remove();
			
			System.out.print(temp.key+" ");
			
			if(temp.left != null)
				queue.add(temp.left);
			
			if(temp.right != null)
				queue.add(temp.right);
		}
		
	}

	public static void main(String[] args) {

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.println("Inorder travesal before insertion : ");

		inOrderTravesal(root);
		
		System.out.println("Level order travesal : ");
		
		levelOrderTravesal(root);

		insert(8, root);

		System.out.println("Inorder travesal After insertion : ");

		inOrderTravesal(root);

	}

}
