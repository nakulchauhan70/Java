package com.demo.general;

import java.util.*;

public class Day6_LetsReview {

	public static void split(String str) {
		char[] ch = str.toCharArray();
		String newEvenStr = "";
		String newOddStr = "";
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				newEvenStr = newEvenStr + ch[i];
			} else {
				newOddStr = newOddStr + ch[i];
			}
		}
		System.out.println(newEvenStr + " " + newOddStr);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] s = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			split(s[i]);
		}
	}
}