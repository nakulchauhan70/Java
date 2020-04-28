package com.demo.datastructures;

import java.util.Scanner;

public class JavaSubarray {

	static int negSubArrCnt = 0;

	static void subArray(int[] a, int start, int last) {
		int sum =0;
		for(int i=start;i<=last;i++) {
			sum+=a[i];
		}
		if(sum<0)
			negSubArrCnt++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] a = new int[cases];
		for (int i = 0; i < cases; i++)
			a[i] = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			for(int j=i;j<cases;j++) {
				subArray(a,i,j);
			}
		}
		
		System.out.println(negSubArrCnt);
	}

}
