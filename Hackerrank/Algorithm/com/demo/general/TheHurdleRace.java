package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheHurdleRace {

	private static void minimumDose(int[] heights, int noOfHurdles, int maxHeight) {
		int temp;
		for (int i = 0; i < noOfHurdles; i++) {
			for (int j = 0; j < noOfHurdles - 1; j++) {
				if (heights[j] > heights[j + 1]) {
					temp = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = temp;
				}
			}
		}

		System.out.println((heights[noOfHurdles - 1] > maxHeight ? Math.abs(maxHeight - heights[noOfHurdles - 1]) : 0));
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int noOfHurdles = fr.nextInt();
		int maxHeight = fr.nextInt();
		int[] heights = new int[noOfHurdles];
		for (int i = 0; i < noOfHurdles; i++) {
			heights[i] = fr.nextInt();
		}
		minimumDose(heights, noOfHurdles, maxHeight);
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
