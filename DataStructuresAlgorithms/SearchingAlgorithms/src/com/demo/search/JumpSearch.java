package com.demo.search;

public class JumpSearch {

	public static void main(String[] args) {

		int[] arr = {0, 1, 6, 9, 9, 23, 34, 45, 56, 66, 66, 89, 100, 354, 849};
		
		jumpSearch(arr, 849);
		
	}

	private static void jumpSearch(int[] arr, int x) {
		int jump = (int) Math.ceil(Math.sqrt(arr.length));
		int startIndex=0;
		int jumpIndex = jump-1;
		
		while(x>arr[startIndex] && x>arr[jumpIndex]) {
			
		}
	}

}
