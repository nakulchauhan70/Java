package com.demo.introduction;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());
			Integer.toString(n);
			System.out.println("Good job");
		} catch (Exception e) {
			System.out.println("Wrong answer");
		}
		sc.close();

	}

}
