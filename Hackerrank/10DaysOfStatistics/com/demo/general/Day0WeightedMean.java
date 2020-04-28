package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Day0WeightedMean {

	static DecimalFormat df = new DecimalFormat("0.0"); // #.## is used as optional, zero shows as absent

	private static void weightedMean(int[] x, int[] w, int noOfElements) {
		int sum = 0;
		int divisor = 0;
		for (int i = 0; i < noOfElements; i++) {
			sum += (x[i] * w[i]);
			divisor += (w[i]);
		}
		System.out.println(df.format((double) sum / divisor));
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int noOfElements = fr.nextInt();
		int[] x = new int[noOfElements];
		int[] w = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++)
			x[i] = fr.nextInt();

		for (int i = 0; i < noOfElements; i++)
			w[i] = fr.nextInt();

		weightedMean(x, w, noOfElements);
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
	}
}
