package com.demo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class JavaAnagrams {

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

	}

	private static void checkAnagram(String str1, String str2) {

		boolean flag = false;
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		if(str1.length() == str2.length()) {
			
			int length = str1.length();
			
			char[] inp1 = (str1.toLowerCase()).toCharArray();
			char[] inp2 = (str2.toLowerCase()).toCharArray();

			for (char ch : inp1) {
				if (map1.containsKey(ch)) {
					int val = map1.get(ch);
					map1.put(ch, ++val);
				} else {
					map1.put(ch, 1);
				}
			}

			for (char ch : inp2) {
				if (map2.containsKey(ch)) {
					int val = map2.get(ch);
					map2.put(ch, ++val);
				} else {
					map2.put(ch, 1);
				}
			}
					
			for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
				char key = entry.getKey();
				int value = entry.getValue();
				if(map2.containsKey(key)) {
					if(value==map2.get(key)) {
						flag = true;
					}
				}else {
					flag = false;
				}
			}
			
			if (flag)
				System.out.println("Anagrams");
			else
				System.out.println("Not Anagrams");

		}else {
			System.out.println("Not Anagrams");
		}

	}

	public static void main(String[] args) {

		FastReader fr = new FastReader();
		String str1 = fr.next();
		String str2 = fr.next();

		checkAnagram(str1, str2);

	}

}
