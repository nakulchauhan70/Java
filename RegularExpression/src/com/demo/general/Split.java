package com.demo.general;

import java.util.regex.Pattern;

public class Split {

	public void matchPattern(String pattern, String line) {
		Pattern p = Pattern.compile(pattern);
		String[] s = p.split(line); //This is called pattern class split method //OR
		// String[] s1 =s.split("\\s"); //This is called String class split method
		System.out.println("Pattern :"+pattern+" Target String : "+line);
		for(String s1 : s) {
			System.out.println(s1);
		}
	}
	public static void main(String[] args) {
		Split p = new Split();
		p.matchPattern("\\s","Nakul Chauhan cvb");  //spit string with " " , where " "(space) doesn't come in splitted string
		p.matchPattern("a", "Nakul Chauhan"); //spit string with a , where a doesn't come in splitted string
		p.matchPattern("u", "Nakul Chauhan"); //spit string with u , where u doesn't come in splitted string
		//Most dangerous symbol "."
		/*if we use below, we'll get www.nakulchauhan.com only because "." accepts any character. 
		So, it gives complete input sting as output*/
		p.matchPattern(".", "www.nakulchauhan.com");
		
		/*if we use below, we'll get compile time exception Illegal Escape Character Exception because 
		 * compiler will consider "\." as escape character only. */
		 //p.matchPattern("\.", "www.nakulchauhan.com");
		
		//So better to use "\\." or [.] where this will consider as symbol only because of square brackets
		p.matchPattern("\\.", "www.nakulchauhan.com");
		p.matchPattern("[.]", "www.nakfjwdjjwd567ulchauhan.com");
	}

}
