package com.demo.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YetAnotherArrayPartitioningTask {

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

		double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		double n = fr.nextDouble();
		double b = fr.nextDouble();

		double fact = factorial(n);

		int f = (int) fact;
		int r = (int) b;

		String baseR = Integer.toString(Integer.parseInt(String.valueOf(f), 10), r);

		char[] baseRArr = baseR.toCharArray();

		int length = baseRArr.length;
		int count = 0, i = 0;
		while (baseRArr[length - 1] == '0') {
			count++;
			length--;
		}
		System.out.println(count);
	}

	private static double factorial(double n) {
		if (0 == n) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
