package com.demo.sort;

//Inplace algorithm
public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 89, 45, 66, 0, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6 };

		arr = bubbleSort(arr);
		printArr(arr);
	}

	//Stable Sort
	private static int[] bubbleSort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-i-1;j++) {
				if(arr[j]>arr[j+1]) {		//< Ascending
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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
