package com.demo.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedClasses {

	public void matchPattern(String pattern, String line) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		System.out.println("Pattern :"+pattern+" Target String : "+line);
		while(m.find()) {
			System.out.println(m.start()+"......."+m.group());
		}
	}
	public static void main(String[] args) {
		PreDefinedClasses p = new PreDefinedClasses();
		p.matchPattern("\\s","a7b@ z#9");
		p.matchPattern("\\S","a7b@ **z#9");
		p.matchPattern("\\d","a7b@z!@#$%^&*#9");
		p.matchPattern("\\D","a7b@zfgfgf#9");
		p.matchPattern("\\w","a7b@z5678#9");
		p.matchPattern("\\W","a7b@!@@!#.//><{}[]()??9");
		p.matchPattern("\\.","kdnja7b@z#./?s9");  //alphanumeric
		p.matchPattern("[^ a-z A-Z 0-9]","a7b@z#9");  //not alphanumeric
	}

}
