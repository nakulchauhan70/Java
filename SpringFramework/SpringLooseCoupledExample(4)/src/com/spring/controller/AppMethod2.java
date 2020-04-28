package com.spring.controller;

/*Method 2 – Call it with helper class*/

public class AppMethod2 {
	
	 public static void main( String[] args )
	    {
	    	OutputHelper output = new OutputHelper();
	    	output.generateOutput(); 
	    }

}

/*Problem 
 * This looks more elegant, and you only need to manage a single helper class, 
 * however the helper class is still tightly coupled to CsvOutputGenerator, 
 * every change of output generator still involves minor code change.
 * */
