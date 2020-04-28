package com.demo.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GotAnyGrapes {

	public static void main(String[] args) {
		FastReader fr = new FastReader();

		// no of grapes Andrew, Dmitry and Michal want to eat
		int AndrewWant = fr.nextInt();
		int DmitryWant = fr.nextInt();
		int MichalWant = fr.nextInt();

		// No of grapes
		int greenGrapes = fr.nextInt();
		int purpleGrapes = fr.nextInt();
		int blackGrapes = fr.nextInt();

		int totalGrapes = greenGrapes + purpleGrapes + purpleGrapes;

		// Andrew - green
		// Dmitry - green and purple
		// Michal - any

		boolean flag = false;

		if (greenGrapes >= AndrewWant) {
			int greenRemaining = greenGrapes - AndrewWant;
			if ((greenRemaining + purpleGrapes) >= DmitryWant) {
				int grapesRemForMichal = totalGrapes - AndrewWant - DmitryWant;
				if (grapesRemForMichal >= MichalWant) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
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
