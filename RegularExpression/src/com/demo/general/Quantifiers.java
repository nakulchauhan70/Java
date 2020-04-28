package com.demo.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public void matchPattern(String pattern, String line) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		System.out.println("Pattern :"+pattern+" Target String : "+line);
		while(m.find()) {
			System.out.println(m.start()+"......."+m.group());
		}
	}
	public static void main(String[] args) {
		Quantifiers p = new Quantifiers();
		p.matchPattern("a","abaabaaab");
		p.matchPattern("a+","abaabaaab");
		p.matchPattern("a*","abaabaaab");
		p.matchPattern("a?","abaabaaab");
	}

}
