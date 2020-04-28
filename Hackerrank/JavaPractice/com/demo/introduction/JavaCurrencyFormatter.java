package com.demo.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

public class JavaCurrencyFormatter {

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
		double amount = fr.nextDouble();

		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		// Write your code here.

		System.out.println("US: " + usFormat.format(amount));
		System.out.println("India: Rs." + indiaFormat.format(amount));
		System.out.println("China: " + chinaFormat.format(amount));
		System.out.println("France: " + franceFormat.format(amount));
	}
}
