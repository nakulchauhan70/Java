package com.demo.StringManipulation;

import java.util.Scanner;

public class SpecialPalindromeAgain {

	public static boolean flag = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		sc.close();
		int count = n;
		for(int i=0;i<n-1;i++) {
			for(int j=i+2;j<=n;j++) {
					if(checkpalindrome(s.substring(i,j))) {
						count++;
					}
			}
		}
		System.out.println(count);
	}

	private static boolean checkpalindrome(String str) {
		char[] arr = str.toCharArray();
		for(int i=0;i<(arr.length/2)+1;i++) {
			if(arr[i]==arr[arr.length-1-i]) {
				flag=true;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
