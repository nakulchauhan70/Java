package com.demo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaStringReverse {

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

		double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	public static void main(String[] args) {

		FastReader fr = new FastReader();
		String input = fr.next();

		StringBuilder sb = new StringBuilder(input);

		if (input.equals(sb.reverse().toString()))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
