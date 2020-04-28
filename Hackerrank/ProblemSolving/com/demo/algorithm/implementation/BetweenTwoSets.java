package com.demo.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrSize = sc.nextLine().split(" ");
		int[] arrA = new int[Integer.parseInt(arrSize[0])];
		int[] arrB = new int[Integer.parseInt(arrSize[1])];
		for(int i=0;i<arrA.length;i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i=0;i<arrB.length;i++) {
			arrB[i] = sc.nextInt();
		}
		sc.close();
		getTotalX(arrA,arrB);
	}

	static void getTotalX(int[] arrA, int[] arrB) {
		List<Integer> intlist = new ArrayList<>();
		int i = arrA[0];
		while(i<=arrB[0]) {
			if(arrB[0]%i==0) {
				intlist.add(i);
			}
			i++;
		}
		intlist.forEach(item->System.out.println(item));
		
		//ListIterator<Integer> lItr= (ListIterator<Integer>) intlist.iterator();
		/*while(lItr.hasNext()) {
			if()
		}*/
	}

}
