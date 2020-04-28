package com.demo.algorithm.implementation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] grade = new int[n];
		for(int i=0;i<n;i++) {
			grade[i] = sc.nextInt();
		}
		sc.close();
		calculateGrade(grade);
	}

	static void calculateGrade(int[] grade) {
		int quotient = 0;
		for(int i=0;i<grade.length;i++) {
			if(grade[i]>=38) {
				quotient = grade[i]/5;
				if(((quotient+1)*5-grade[i])<3) {
					grade[i] = (quotient+1)*5;
				}
			}
		}
		IntStream.range(0,grade.length).forEach(i->System.out.println(grade[i]));
	}

}
