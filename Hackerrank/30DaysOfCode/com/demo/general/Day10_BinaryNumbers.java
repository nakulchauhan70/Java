package com.demo.general;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day10_BinaryNumbers {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String binary = Integer.toBinaryString(sc.nextInt());
		int count = 0;

		Pattern p = Pattern.compile("1+");
		Matcher m = p.matcher(binary);
		while (m.find()) {
			int grpLen = m.group().length();
			if (grpLen > count)
				count = grpLen;
		}
		System.out.println(count);
		sc.close();

	}

}
