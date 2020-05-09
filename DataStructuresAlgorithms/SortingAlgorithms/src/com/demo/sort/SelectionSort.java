package com.demo.sort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {89,45,66,0,100,34,56,23,01,9,849,9,66,354,6};
		
		arr = selectionSort(arr);
		printArr(arr);
	}
	
	private static int[] selectionSort(int[] arr) {  
		
		int length = arr.length;
	
		for(int i=0;i<length;i++) {
			int minReddix = i;
			
			for(int j=i+1;j<length;j++) {
				if(arr[j]<arr[minReddix])
					minReddix=j;
			}
			
			if(arr[i]>arr[minReddix]) {
				int temp = arr[i];
				arr[i] = arr[minReddix];
				arr[minReddix] = temp;
			}
		}
		
		return arr;
	}

	private static void printArr(int[] arr) {
		int length = arr.length;
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
