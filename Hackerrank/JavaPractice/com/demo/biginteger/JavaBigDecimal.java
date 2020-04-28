package com.demo.biginteger;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class JavaBigDecimal {
	public static void main(String[] args) {
		// Input

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		// Write your code here
		Map<BigDecimal, String> map = new HashMap<>();
		BigDecimal[] bd = new BigDecimal[s.length];
		for (int i = 0; i < n; i++) {
			bd[i] = new BigDecimal(s[i]);
			map.put(bd[i], s[i]);
		}
		
		Comparator<BigDecimal> c = (b1,b2)->{
			return b1.compareTo(b2);
		};
		Arrays.sort(bd,Collections.reverseOrder(c));

		// Output
//		for (int i = 0; i < n; i++) {
//			System.out.println(bd[i]+"    "+map.get(bd[i]));
//		}

		for (int i = 0; i < n; i++) {
			System.out.println(map.get(bd[i]));
		}
		
		map.forEach((k,v)->System.out.println("bigdecimal : " + k + " string : " + v));
		
		
//		BigDecimal d = new BigDecimal("1.");
//		System.out.println(d);

	}
}