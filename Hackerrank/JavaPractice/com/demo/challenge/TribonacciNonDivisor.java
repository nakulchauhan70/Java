package com.demo.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TribonacciNonDivisor {

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
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}

	}

	public static void main(String[] args) {
		//FastReader fr = new FastReader();
		int a1 = Integer.MAX_VALUE;
		System.out.println(a1);
	//	double d = fr.nextDouble();
		//int n = fr.nextInt();
		int a = 1;
		int b = 29;
		int c = 19;
		int sum = a+b+c;
		
		System.out.print(a+" "+b+" "+c);
		
		for(int i=3;i<21477;i++) {
			System.out.print(" "+sum);
			a=b;
			b=c;
			c=i;
			sum = a+b+c;
		}
		
	}

}
