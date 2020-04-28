package com.demo.regex.practice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheBritishandAmericanStyleofSpelling {

	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s  = new String[n];
		for(int i=0;i<n;i++) {
			s[i] = sc.nextLine();
		}
		int testCase = Integer.parseInt(sc.nextLine());
		String[] testCaseArr = new String[testCase];
		for(int i=0;i<testCase;i++) {
			testCaseArr[i] = sc.nextLine();
		}
		check(s,testCaseArr);
		sc.close();
	}

	public static void check(String[] str, String[] testCaseArr) {

		for(int i=0;i<testCaseArr.length;i++) {
			String strngMatch = testCaseArr[i];
			for(int j=0;j<str.length;j++) {
				String[] splttdStr = str[j].split("\\s");
				matchPattern(splttdStr,strngMatch);
			}
			System.out.println(count);
			count = 0;
		}
	}

	private static void matchPattern(String[] splttdStr, String strngMatch) {
		Pattern p = Pattern.compile("^\\w*(ze|se)$");
		String s2 = strngMatch.substring(0, strngMatch.length()-2);
		for(int i=0;i<splttdStr.length;i++) {
			if(3<=splttdStr[i].length()) {
				String s1 = splttdStr[i].substring(0, splttdStr[i].length()-2);
				if(s1.equalsIgnoreCase(s2)) {
					Matcher m = p.matcher(splttdStr[i]);
					while(m.find()) {
						count++;
					}
				}
			}
		}	
	}
}
