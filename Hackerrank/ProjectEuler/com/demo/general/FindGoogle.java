package com.demo.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class FindGoogle {

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		String input = fr.next();
		String pattern = "^[G|g]{1}[o|O|0|[()]]{2}[G|g]{1}[l|L|I]{1}[e|E|3]{1}$";
		//String pattern = "^[G|g]{1}[e|E|3]{1}$";
		System.out.println(Pattern.matches(pattern, input));
		
//		Pattern regex = Pattern.compile("^[G|g]{1}[o|O|0|(()){1,2}|(<>){1,2}|(<>){1,2}]{2}[G|g]{1}[l|L|\\\\|]{1}[e|E|3]{1}$");
//		Matcher matcher = regex.matcher("g()()gle");
//		if (matcher.find()){
//
//			System.out.println("true");
//		}	
			
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

	}

}
