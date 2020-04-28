package com.demo.general;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		StringTokenizer stk = new StringTokenizer("Nakul Chauhan"); // Default pattern for STK is space \\s
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		//Split target string with particular pattern
		StringTokenizer stk1 = new StringTokenizer("16/09/2018","/"); // Where "/" is RE/Pattern/Delimeter
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}
	}

}
