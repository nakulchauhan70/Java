package com.demo.general;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfElem = sc.nextInt();
		int[] arr = new int[noOfElem];
		int rotate = sc.nextInt();
		for (int i = 0; i < noOfElem; i++) {
			arr[i] = sc.nextInt();
		}

		int length = arr.length;
		
		arr = rotateArr(arr, rotate, length);

		for(int i=0;i<length;i++)
			System.out.print(arr[i]+" ");

		sc.close();

	}

	private static int[] rotateArr(int[] arr, int rotate, int length) {
		int count = 1;

		while (count <= rotate) {
			int temp = arr[0];
			for (int i = 0; i < length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[length - 1] = temp;
			count++;
		}

		return arr;
	}

}
