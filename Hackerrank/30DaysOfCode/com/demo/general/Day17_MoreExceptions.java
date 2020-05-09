package com.demo.general;

import java.util.Scanner;

//Write your code here
class MyException extends Exception {
	public MyException(String expMsg) {
		super(expMsg);
	}
}

class Calculator {
	int power(int base, int raise) throws MyException {
		try {
			if (base < 0 || raise < 0) {
				throw new MyException("n and p should be non-negative");
			} else {
				// return Integer.parseInt(String.valueOf((Math.pow(base, raise))));
				return (int) Math.pow(base, raise);
			}
		} catch (Exception e) {
			throw new MyException("n and p should be non-negative");
		}

	}
}

class Day17_MoreExceptions {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
