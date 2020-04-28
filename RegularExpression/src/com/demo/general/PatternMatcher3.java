package com.demo.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher3 {

	public void matchPattern(String pattern, String line) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		System.out.println("Pattern :"+pattern+" Target String : "+line);
		System.out.println("String.matches(s): "+line.matches(pattern));
		while(m.find()) {
			System.out.println(m.start()+"......."+m.group());
		}
	}
	public static void main(String[] args) {
		PatternMatcher3 p = new PatternMatcher3();
		p.matchPattern("[abc]","a7b@z#9");
		p.matchPattern("[^abc]","a7b@z#9");
		p.matchPattern("[a-z]","a7b@z#9");
		p.matchPattern("[A-Z]","a7b@z#9");
		p.matchPattern("[a-z A-Z]","a7b@z#9");
		p.matchPattern("[0-9]","a7b@z#9");
		p.matchPattern("[a-z A-Z 0-9]","a7b@z#9");  //alphanumeric
		p.matchPattern("[^ a-z A-Z 0-9]","a7b@z#9");  //not alphanumeric
	}

}
