package com.demo.regex.practice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAnythingButNewline {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.checker("^.{3}\\..{3}\\..{3}\\..{3}$");      		//MatchAnythingButNewline
		//tester.checker("^\\d{2}\\D\\d{2}\\D\\d{4,}$");   			//MatchDigitsNonDigits  12 11 15, 122 23 56
		//tester.checker("^\\S{2,}\\s\\S{2}\\s\\S{2,}$"); 			//MatchWhitespaceNonWhitespaceCharacter 
		//tester.checker("^\\w{3,}\\W{1,}\\w{1,10}\\W{1,}\\w{3}$"); // Matching Word & Non-Word Character 
		//tester.checker("^\\d\\w{4}\\.$"); 						//Matching Start & End
        //tester.checker("^\\d{2,}[a-z]*[A-Z]*$");					//Matching Zero Or More Repetitions 
        //tester.checker("^\\d+[A-Z]+[a-z]+$"); 					//Matching One Or More Repetitions 
		//tester.checker("^[A-Za-z]*s$"); 							//Matching Ending Items 
        //tester.checker("hackerrank"); 							/Matching Specific String-Introduction
		//tester.checker("^\\w{3,4}\\W+\\w+\\W+\\w+$");
		
		//Character Class
		//In the context of a regular expression (RegEx), a character class is a set of characters enclosed within square brackets that allows you to match one character in the set.
		//tester.checker("^\\D[^aeiou][^bcDF]\\S[^ABCDEF][^(\\.|\\,)]$"); // Excluding Specific Characters 
        //tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z].*$"); 		// Matching Character Ranges 
		//tester.checker("^[123][120][xs0][30Aa][xsu](\\.|\\,)$");  //Matching Specific Characters 


		//Repetitions
        //tester.checker("^\\d{1,2}[A-Za-z]{3,}\\.{0,3}$"); 		// Matching {x, y} Repetitions
        //tester.checker("^[a-zA-Z02468]{40}[13579\\s]{5}$");       //Matching {x} Repetitions
		
		//Grouping and Capturing
        //tester.checker("^.*(ok){3,}.*$"); 						//Capturing & Non-Capturing Groups 
        //tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[A-Za-z]{1,}$");     //Alternative Matching
		
		//Backreferences
		//Backreferences To Failed Groups


	}
}

class Tester {

	public void checker(String pattern){

		Scanner sc = new Scanner(System.in);
		String testString = sc.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(testString);
		boolean match = m.matches();
		System.out.format("%s", match);
		sc.close();
	}   

}
