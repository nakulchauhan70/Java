package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//Submitted
public class AngryProfessor {

	static ArrayList<String> decision = null;

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

		decision = new ArrayList<String>(testCase);
		while (testCase > 0) {
			int student = fr.nextInt();
			int threshold = fr.nextInt();

			int[] students = new int[student];

			for (int s = 0; s < students.length; s++) {
				students[s] = fr.nextInt();
			}

			decide(students, threshold);

			testCase--;
		}

		decision.forEach(System.out::println);
	}

	private static void decide(int[] students, int threshold) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] <= 0)
				count++;

			if (count == threshold) {
				decision.add("NO");
				return;
			}

		}

		decision.add("YES");
	}
}
