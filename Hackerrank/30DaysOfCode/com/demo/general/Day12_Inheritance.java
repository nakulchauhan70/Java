package com.demo.general;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	public String calculate() {

		int sum = 0;

		for (int i : testScores) {
			sum += i;
		}
		int avg = sum / testScores.length;
		return (avg < 40) ? "T" : (avg < 55) ? "D" : (avg < 70) ? "P" : (avg < 80) ? "A" : (avg < 90) ? "E" : "O";
	}

}

class Day12_Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}