package com.demo.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class NewYearChaos {

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

	public static int[] bubbleSort(int[] inputArray) {

		int length = inputArray.length;
		int temp = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}

		return inputArray;

	}

	public static void main(String[] args) {

		FastReader fr = new FastReader();

		int cases = fr.nextInt();

		int rotation = fr.nextInt();

		for (int i = 0; i < cases; i++) {
			int elmntsNo = fr.nextInt();
			int[] elements = new int[elmntsNo];
			for (int j = 0; j < elmntsNo; j++) {
				elements[j] = fr.nextInt();
			}
			int[] a = bubbleSort(elements);
			Consumer<int[]> c = (arr) -> {
				for (int k : arr)
					System.out.print(k + " ");
				System.out.println();
			};
			c.accept(a);

		}

	}

}
