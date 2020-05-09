package com.demo.general;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;
	public int length;

	public Difference(int[] elements) {
		this.elements = elements;
		length = elements.length;
	}

	public void computeDifference() {

		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int diff = Math.abs(elements[i] - elements[j]);
				if (maximumDifference < diff)
					maximumDifference = diff;
			}
		}

	}

} // End of Difference class

public class Day14_Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}