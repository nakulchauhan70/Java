package com.demo.general;

public class StringMatches {

	public void isStringNumber(String s){
		System.out.println(s.matches("\\d+"));
	}
	public static void main(String[] args) {

		StringMatches m = new StringMatches();
		m.isStringNumber("3");
		m.isStringNumber("jfjdf");
		m.isStringNumber("076787");
		m.isStringNumber("");
	}

}
