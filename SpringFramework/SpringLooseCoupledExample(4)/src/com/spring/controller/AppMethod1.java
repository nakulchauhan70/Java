package com.spring.controller;

/*Method 1: Call it directly*/

public class AppMethod1 {
	public static void main(String[] args) {
		
		IOutputGenerator output = new CsvOutputGenerator();
    	output.generateOutput();	
    	
	}
}


/*Problem
 * In this way, the problem is the “output” is coupled tightly to CsvOutputGenerator, 
 * every change of output generator may involve code change. 
 * If this code is scattered all over of your project, 
 * every change of the output generator will make you suffer seriously.*/
 