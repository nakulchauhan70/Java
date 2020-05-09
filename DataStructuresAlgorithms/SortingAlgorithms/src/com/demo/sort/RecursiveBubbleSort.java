package com.demo.sort;

public class RecursiveBubbleSort {
	
	public static void main(String[] args) {
		int[] arr = { 89, 45, 66, 0, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6 };

		arr = bubbleSort(arr,arr.length);
		printArr(arr);

	}

	private static void printArr(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	private static int[] bubbleSort(int[] arr, int length) {
		
		if(length == 1) {
			return arr;
		}
		
		for(int i=0;i<length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		return bubbleSort(arr, length-1);
	}

}
