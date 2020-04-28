package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PickingNumbers {

	static int listCount;

	private static void pickingNumbers(List<Integer> list) {
		int size = list.size();

		while (listCount <= size) {
			for (int i = 0; i < size; i++) {
				for (int j = i; j < size; j++) {
					if (Math.abs(list.get(i) - list.get(j)) <= 0) {

					} else {
						list.remove(j);
						pickingNumbers(list);
					}
				}
			}
			listCount++;
			generateArray();
		}

	}

	private static void generateArray() {

	}

	public static void main(String[] args) {

		FastReader fr = new FastReader();
		int no = fr.nextInt();
		List<Integer> list = new ArrayList<Integer>(no);
		for (int i = 0; i < no; i++) {
			list.add(fr.nextInt());
		}

		pickingNumbers(list);

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