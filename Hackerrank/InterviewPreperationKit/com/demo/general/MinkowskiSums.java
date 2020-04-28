package com.demo.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MinkowskiSums {

	private static void minkowskiSumsSide(int[] input) {
		Map<Integer, ArrayList<double[]>> map = new HashMap<>();

		int length = input.length;

		for (int i = 0; i < length; i++) {
			ArrayList<double[]> al = new ArrayList<>();
			for (int j = 1; j <= input[i]; j++) {
				double[] cord = new double[2];
				double x = Math.cos(getTheta(i, input[i]));
				double y = Math.sin(getTheta(i, input[i]));
				cord[0] = x;
				cord[1] = y;
				al.add(cord);
			}
			map.put(input[i], al);

			int k = 0;
			while (input[k] > 0) {

				i--;
			}

			Set<Entry<Integer, ArrayList<double[]>>> entry = map.entrySet();
			Iterator<Entry<Integer, ArrayList<double[]>>> itr = entry.iterator();
			while (itr.hasNext()) {
				Entry<Integer, ArrayList<double[]>> e = itr.next();
				System.out.print("Key: " + e.getKey() + " Value: ");
				e.getValue().forEach((j) -> {
					for (double cord : j) {
						System.out.print(cord + " ");
					}
				});
				System.out.println();
			}
		}
	}

	public static double getTheta(int k, int n) {
		return ((2 * k - 1) * (22 / 7)) / n;
	}

	public static void main(String[] args) {

		FastReader fr = new FastReader();
		int cases = fr.nextInt();
		int[] input = new int[2];
		for (int i = 0; i < 1; i++) {
			input[0] = fr.nextInt();
			input[1] = fr.nextInt();

			minkowskiSumsSide(input);

		}

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

		int nextInt() {
			return Integer.parseInt(next());
		}

	}

}
