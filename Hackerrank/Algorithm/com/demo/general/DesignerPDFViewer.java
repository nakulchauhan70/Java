package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DesignerPDFViewer {

	private static void getWordArea(Map<Character, Integer> m, String str) {
		int max = Integer.MIN_VALUE;
		int strLen = str.length();
		char[] ch = str.toCharArray();
		for (int i = 0; i < strLen; i++) {
			int value = m.get(ch[i]);
			if (value > max)
				max = value;
		}

		System.out.println(max * strLen);

	}

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		int ascii = 97; // A
		FastReader fr = new FastReader();
		for (int i = 0; i < 26; i++, ascii++) {
			m.put((char) ascii, fr.nextInt());
		}
		String str = fr.nextLine();
		getWordArea(m, str);
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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
