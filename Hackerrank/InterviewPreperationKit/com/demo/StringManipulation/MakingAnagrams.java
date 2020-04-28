package com.demo.StringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;

//Working
public class MakingAnagrams {

	public static void main(String[] args) {

		FastReader fr = new FastReader();

		String s1 = fr.nextLine();
		String s2 = fr.nextLine();

		ConcurrentHashMap<Character, Integer> map1 = putInMap(s1);
		ConcurrentHashMap<Character, Integer> map2 = putInMap(s2);
		
		int chToBeRemoved = 0;


		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if (map2.containsKey(entry.getKey())) {
				chToBeRemoved += Math.abs(entry.getValue() - map2.get(entry.getKey()));
				map1.remove(entry.getKey());
				map2.remove(entry.getKey());
			}
		}

		System.out.println(chToBeRemoved + calculateChToBeRemoved(map1, map2));

	}

	private static int calculateChToBeRemoved(ConcurrentHashMap<Character, Integer> map1,
			ConcurrentHashMap<Character, Integer> map2) {
		
		return calculateValues(map1)+calculateValues(map2);
		
	}

	private static int calculateValues(ConcurrentHashMap<Character, Integer> map) {

		int chToBeRemoved = 0;
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			chToBeRemoved+=entry.getValue();
		}
		
		return chToBeRemoved;
	}

	private static ConcurrentHashMap<Character, Integer> putInMap(String str) {
		ConcurrentHashMap<Character, Integer> map = new ConcurrentHashMap<>();
		int length = str.length();
		int i = 0;

		while (length != 0) {

			if (map.containsKey(str.charAt(i))) {
				int value = map.get(str.charAt(i));
				map.put(str.charAt(i), ++value);
			} else {
				map.put(str.charAt(i), 1);
			}

			i++;
			length--;
		}

		return map;
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
