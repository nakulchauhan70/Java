package com.demo.algorithm.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();

		if(x2>x1 && v2>v1) {
			System.out.println("NO");
		}else if((v1-v2)>0) {
			if((x2-x1)%(v1-v2)==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			sc.close();
		}else {
			System.out.println("NO");
		}
	}
}
