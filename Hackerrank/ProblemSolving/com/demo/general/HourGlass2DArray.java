package com.demo.general;

import java.util.Scanner;

//Submitted
public class HourGlass2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = 0;
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum = sum + arr[i+1][j+1];
                sum = sum + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum >  max)
                    max = sum;

            }
        }

        System.out.println(max);
        
        sc.close();
    }
}
