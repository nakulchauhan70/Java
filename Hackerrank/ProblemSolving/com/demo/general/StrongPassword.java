package com.demo.general;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Submitted
public class StrongPassword {

	private static boolean matchPattern(String pattern, String password) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(password);

		if (m.find())
			return true;

		return false;
	}

	static int minimumNumber(int length, String password) {

		int validLength = 6, count = 0;

		boolean isValidDigit = matchPattern("\\d+", password);
		boolean isValidLowercase = matchPattern("[a-z]+", password);
		boolean isValidUppercase = matchPattern("[A-Z]+", password);
		boolean isValidSpecialChar = matchPattern("[!@#$%^&*()\\-+]+", "--");		//matchPattern("\\W+", "--")

		if (length >= validLength && (isValidDigit && isValidLowercase && isValidUppercase && isValidSpecialChar))
			return 0;

		if (!isValidDigit)
			count++;

		if (!isValidLowercase)
			count++;

		if (!isValidUppercase)
			count++;

		if (!isValidSpecialChar)
			count++;

		int lengthDifference = validLength - length;

		if (lengthDifference > 0 && count <= lengthDifference)
			return lengthDifference;

		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		String password = sc.nextLine();
		System.out.println(minimumNumber(length, password));
		sc.close();
	}

}
