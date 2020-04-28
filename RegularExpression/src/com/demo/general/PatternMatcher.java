package com.demo.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	
	public boolean isPatternMatching(String line) {
		
		//Pattern p = Pattern.compile("gh"); 

		Pattern p = Pattern.compile("^[a-z]+$");
		Matcher m = p.matcher("aaaaa");
		if(m.find()) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		PatternMatcher pm = new PatternMatcher();
		System.out.println(pm.isPatternMatching("23222422"));
		System.out.println(pm.isPatternMatching("dfhgh56bj22jbj"));
	}

}
