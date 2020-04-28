package com.demo.StringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpecialStringAgain {

	public static void main(String[] args) {

		FastReader fr = new FastReader();
		int length = fr.nextInt();
		StringBuilder str = new StringBuilder(fr.nextLine());

		int specialStrCount = 0;

		for (int i = 1; i <= length; i++) {
			for (int j = 0; j <= length - i; j++) {
				specialStrCount += specialStr(str.substring(j, j + i));
			}
		}
		
		System.out.println(specialStrCount);

	}

	private static int specialStr(String string) {
		
		int length = string.length();
		int mid = length/2;
		String left, right;
		
		if (length == 1)
			return 1;
		
		if (length > 1) {
			if(length%2==0) {
				left = string.substring(0, mid);
				right = string.substring(mid);
				if(checkCharSame(left.toCharArray()) && checkCharSame(right.toCharArray()) && left.equals(right))
					return 1;
			}else {
				left = string.substring(0, mid);
				right = string.substring(mid+1);
				if(checkCharSame(left.toCharArray()) && checkCharSame(right.toCharArray()) && left.equals(right))
					return 1;
			}
		}
		
		return 0;
	}
	
	private static boolean checkCharSame(char[] ch) {

		int length = ch.length;

		if (length == 1)
			return true;
		
		if(length > 1){
			int a = ch[0];
			for (int j = 1; j < length; j++) {
				if (a != ch[j])
					return false;
			}

			return true;
		}
		
		return false;
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
