package com.demo.biginteger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaPrimalityTest {

	public static void checkPrime(int n) {
		boolean flag = false;
		int range = n / 2;
		if (0 == n || 1 == n) {
			System.out.println("not prime");
		} else {
			for (int i = 2; i <= range; i++) {
				if (0 == n % i) {
					System.out.println("not prime");
					flag = true;
					break;
				}
			}
		}
		if (!flag)
			System.out.println("prime");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		FastReader fr = new FastReader();
		checkPrime(fr.nextInt());

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
				} catch (Exception e) {
					e.printStackTrace();

				}
			}

			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

	}

}
