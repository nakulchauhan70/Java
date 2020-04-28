package com.demo.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiplesof3and5 {

	private static void calculateSumOfmultiples(int[] input) {

		int length = input.length;
		int sum = 0;
		for(int i=0;i<length;i++) {
			for(int j=3,k=5;j<input[i]||k<input[i];j=j+3,k=k+5) {
				if(0==j%3 || 0==k%5) {
					sum+=j;
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int cases = fr.nextInt();
		int[] input = new int[cases];

		for (int i = 0; i < cases; i++) {
			input[i] = fr.nextInt();
		}

		calculateSumOfmultiples(input);
	}

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

}
