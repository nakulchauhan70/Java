package com.demo.algorithm.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aliceTrplt = new int[3];
		int[] bobTrplt = new int[3];
		for(int i=0;i<3;i++) {
			aliceTrplt[i] = sc.nextInt();
		}
		for(int j=0;j<3;j++) {
			bobTrplt[j] = sc.nextInt();
		}
		sc.close();
		pointsEarned(aliceTrplt,bobTrplt);
	}

	public static void pointsEarned(int[] aliceTrplt, int[] bobTrplt) {
		int aliceErndPnt=0, bobErndpnt=0;
		for(int k=0;k<3;k++) {
			if(aliceTrplt[k]>bobTrplt[k]) {
				aliceErndPnt++;
			}else if(bobTrplt[k]>aliceTrplt[k]) {
				bobErndpnt++;
			}
		}
		System.out.println(aliceErndPnt+" "+bobErndpnt);
	}

}
