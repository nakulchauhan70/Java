package com.demo.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class Day11_2DArrays {

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

	}

	static int[][] subArr = new int[6 / 2][6 / 2];
	static HashMap<Integer, int[][]> map = new HashMap<>();

	public static void main(String... s) {

		FastReader fr = new FastReader();
		int[][] twoDArr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				twoDArr[i][j] = fr.nextInt();
			}
		}

		for (int i = 0; i <= 6 / 2; i++) {
			for (int j = 0; j <= 6 / 2; j++) {
				gethourglasse(i, j, twoDArr);
			}
		}

		Consumer<HashMap<Integer, int[][]>> c = m -> {

			int max = Integer.MIN_VALUE;
			Set<Entry<Integer, int[][]>> set = m.entrySet();
			Iterator<Entry<Integer, int[][]>> itr = set.iterator();

			while (itr.hasNext()) {
				Entry<Integer, int[][]> e = itr.next();
				if (max < e.getKey())
					max = e.getKey();
			}

			// max hourglass
//            int[][] arr = map.get(max);
//            for(int i=0;i<arr.length;i++){
//                for(int j=0;j<arr.length;j++){
//                    if (!(1 == i && i != j)) {
//                        System.out.print(arr[i][j]);
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }

			// max hourglass sum
			System.out.println(max);

		};

		c.accept(map);

	}

	private static void gethourglasse(int rowStart, int columnStart, int[][] twoDArr) {

		int[][] subArr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				subArr[i][j] = twoDArr[rowStart + i][columnStart + j];
			}
		}
		calculateSum(subArr);

	}

	private static void calculateSum(int[][] subArr) {

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(1 == i && i != j)) {
					// sum += subArr[i][j];
					sum = sum + subArr[i][j];
				}
			}
		}

		map.put(sum, subArr);

	}

}
