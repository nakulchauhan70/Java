package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DayOfProgrammer {

	static void dayOfProgrammer(int year) {

		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year == 1918) {
			daysOfMonth[1] = 15;
		} else if (((year <= 1917) && (year % 4 == 0))
				|| ((year > 1917) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))) {
			daysOfMonth[1] = 29;
		}

		int dayOfProgrammer = 256;
		int monthCount = 0;
		String month;
		for (int i = 0; i < 12; i++) {
			monthCount++;
			if (dayOfProgrammer < daysOfMonth[i]) {
				break;
			} else {
				dayOfProgrammer -= daysOfMonth[i];
			}
		}
		if (monthCount % 10 != 1) {
			month = String.valueOf("0" + monthCount);
		} else {
			month = String.valueOf(monthCount);
		}

		System.out.println(dayOfProgrammer + "." + month + "." + year);

	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int year = fr.nextInt();
		dayOfProgrammer(year);
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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
