package com.demo.general;

import java.util.Scanner;

public class Day4_ClassVsInstance {
	private int age;

	public Day4_ClassVsInstance(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge > 0) {
			this.age = initialAge;
		} else {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		}
	}

	public void amIOld() {
		String result = "";
		if (age >= 18) {
			result = "You are old.";
		} else if (age >= 13) {
			result = "You are a teenager.";
		} else {
			result = "You are young.";
		}
		System.out.println(result);
	}

	public void yearPasses() {
		this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4_ClassVsInstance p = new Day4_ClassVsInstance(age); // Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}
