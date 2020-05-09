package com.demo.sort;

public class Practice {

	public static void main(String[] args) {
		int[] arr = {89,45,66,0,100,34,56,23,01,9,849,9,66,354,6};

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minR = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minR]) {
					minR = j;
				}
			}

			if (arr[i] > arr[minR]) {
				int temp = arr[i];
				arr[i] = arr[minR];
				arr[minR] = temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
