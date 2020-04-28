package com.demo.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class LeftRotation {

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

	public static int[] rotateArray(int[] elements, int rotation) {

		int length = elements.length;

		while (rotation > 0) {

			int i;
			int temp = elements[0];

			for (i = 0; i < length - 1; i++)
				elements[i] = elements[i + 1];
			elements[i] = temp;

			rotation--;
		}

		return elements;

	}

	public static void main(String[] args) {

		FastReader fr = new FastReader();

		int elmntsNo = fr.nextInt();
		int rotation = fr.nextInt();

		int[] elements = new int[elmntsNo];

		for (int i = 0; i < elmntsNo; i++) {
			elements[i] = fr.nextInt();
		}

		int[] rotatedArr = rotateArray(elements, rotation);
		
		Consumer<int[]> c= (arr)->{
			for (int k : arr)
				System.out.print(k + " ");
			System.out.println();
		};

		c.accept(rotatedArr);
	}

}
