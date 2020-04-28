package com.demo.algorithm.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time =  sc.nextLine();
		timeConversion(time);
		sc.close();
	}

	static void timeConversion(String s) {
		int hh = Integer.parseInt(s.substring(0, 2));
		String frmt = s.substring(s.length()-2,s.length());
		if(12==hh && "AM".equals(frmt)) {
			System.out.println("00"+s.substring(2,s.length()-2));
		}else if((12>hh && "AM".equals(frmt)) || (12==hh && "PM".equals(frmt))) {
			System.out.println(s.substring(0,s.length()-2));
		}else{
			int hr = hh+12;
			System.out.println(hr+s.substring(2,s.length()-2));
		}
	}

}
