package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SherlockAndSquares {

	static ArrayList<Integer> countList = new ArrayList<>();

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

	public static void main(String[] args) {

		FastReader fr = new FastReader();

		int testCase = fr.nextInt();
		int a,b;
		
		while (testCase != 0) {
			a = fr.nextInt();
			b = fr.nextInt();
			countList.add((int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1); 
			testCase--;
		}

		countList.forEach(System.out::println);
	}

}
