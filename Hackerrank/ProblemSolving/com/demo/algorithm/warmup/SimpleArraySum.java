package com.demo.algorithm.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			sum = sum+sc.nextInt();
		}
		System.out.println(sum);
		sc.close();
	}

}
