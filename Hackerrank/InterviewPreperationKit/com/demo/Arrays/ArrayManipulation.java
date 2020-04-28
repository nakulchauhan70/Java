package com.demo.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayManipulation {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			try {
				while (st == null || !st.hasMoreElements()) {
					st = new StringTokenizer(br.readLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {

		int[] arr = new int[n];
		long max = Long.MIN_VALUE;
		int arrLen = queries.length;
		int startIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < arrLen; i++) {
			int incrementSum = queries[i][2];
//			for (int j = 0; j < queries[i].length - 1; j++) {
//				if (0 == j) {
					startIndex = queries[i][0];
//				} else {
					endIndex = queries[i][1];
//				}
//			}

			for (int k = startIndex - 1; k <= endIndex - 1; k++) {
				arr[k] = arr[k] + incrementSum;
			}
			for (int l = 0; l < endIndex; l++) {
				if (max < arr[l])
					max = arr[l];
			}
		}

		return max;

	}

	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();
		int n = fr.nextInt();
		int m = fr.nextInt();
		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				queries[i][j] = fr.nextInt();
			}
		}

		long result = arrayManipulation(n, queries);

		System.out.println(String.valueOf(result));
	}
}
