package com.ds.bst;

public class InsertIntoBSTIterative {

	static class Node {

		private int key;
		private Node left, right;

		public Node(int key) {
			super();
			this.key = key;
			this.left = this.right = null;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}

	static Node root;

	public static void main(String[] args) {
		insert(10);
		
	}

	private static void insert(int key) {
		
		if(root == null) {
			root = createNewNode(key);
			return;
		}
		
		if(root.getKey() != 0){
			if(key > root.getKey()) {
				root.setRight(createNewNode(key));
			}else {
				root.setLeft(createNewNode(key));
			}
		}
		
		
	}

	private static Node createNewNode(int key) {
		return new Node(key);
	}

}
