package com.demo.general;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calc implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (0 == n % i) {
				sum += i;
			}
		}
		return sum;
	}
}

public class Day19_Interfaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calc();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}