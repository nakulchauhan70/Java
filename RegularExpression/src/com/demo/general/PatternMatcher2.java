package com.demo.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher2 {
	
	public void patternMatching(String line) {
		
		int count = 0;
		Pattern p = Pattern.compile("23"); 

		Matcher m = p.matcher(line);
		System.out.println("Line:::"+line);
		while(m.find()) {
			count++;
			System.out.println(m.start()+"........."+m.end()+"........."+m.group());
		}
		System.out.println("Total number of occurence:::"+count);
	}

	public static void main(String[] args) {
		PatternMatcher2 pm = new PatternMatcher2();
		pm.patternMatching("2322242322");
		pm.patternMatching("232323232jkj");
	}

}
