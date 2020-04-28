package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

//Submitted
public class CutTheSticks {

	static List<Integer> inputList = null;

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
		int length = fr.nextInt();

		Integer[] arr = new Integer[length];
		int min = 0;

		for (int i = 0; i < length; i++) {
			arr[i] = fr.nextInt();
		}

		inputList = Arrays.asList(arr);

		while (!inputList.isEmpty()) {

			// trimArr
			inputList = inputList.stream().filter(no -> no > 0).collect(Collectors.toList());
			
			// findmin
			if (inputList.size() > 0) {
				min = inputList.stream().min(Integer::compare).get();
				
				// getCount
				getCount(inputList, min);
			}

		}

	}

	private static void getCount(List<Integer> inputList, int min) {

		int count = 0;
		int size = inputList.size();
		for (int i = 0; i < size; i++) {
			inputList.set(i, inputList.get(i) - min);
			count++;
		}

		System.out.println(count);
	}

}
