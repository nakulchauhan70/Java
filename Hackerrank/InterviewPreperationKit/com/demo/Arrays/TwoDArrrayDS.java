package com.demo.Arrays;

import java.util.Scanner;

public class TwoDArrrayDS {

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		int sum = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<6;i++) {			//to maintain row
			for(int j=0;j<6;j++) {      //to traverse each element of each row
				for(int k=j;k<j+3;k++) {		//to maintain column
					count++;
					int row1 = sum+arr[j][k];
					/*if(count==2) {

					}
*/					//int row1 = arr[i][j]+arr[i+1][j]+arr[i+2][j];
				}
			}
		}
		sc.close();
	}

}
