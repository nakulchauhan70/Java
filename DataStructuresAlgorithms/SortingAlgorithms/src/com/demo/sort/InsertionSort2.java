package com.demo.sort;

public class InsertionSort2 {
	
	public static void main(String[] args) {
		int[] arr = { 89, 45, 66, 0, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6 };

		arr = insertionSort(arr,arr.length);
		printArr(arr);

	}

	private static int[] insertionSort(int[] arr, int length) {
		
		for(int i=0;i<length;i++) {
			int prevInx = i;
			int secondPrevInx = prevInx-1;
			while(secondPrevInx >=0) {
				if(arr[prevInx]<arr[secondPrevInx]) {
					int temp = arr[prevInx];
					arr[prevInx] = arr[secondPrevInx];
					arr[secondPrevInx] = temp;
				}
				secondPrevInx--;
				prevInx--;	
			}
		}

		return arr;
	}

	private static void printArr(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


}
