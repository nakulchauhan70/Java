package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Submitted
public class Pangrams {

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

	private static void isPangram(String str) {
		
		boolean flag = true;
		
		
		for(int i=65; i<=90;i++) {
			if(-1 ==  str.indexOf(i)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("pangram");
			return ;
		}
		
		System.out.println("not pangram");
	}

	public static boolean isAlpha(String s) {
		return s != null && s.matches("^[a-zA-Z]*$");
	}

	public static void main(String[] args) {

		
		FastReader fr = new FastReader();
		String str = fr.nextLine();
		
		isPangram(str.toUpperCase());

	}
}