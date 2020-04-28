package com.spring.controller;

public class OutputHelper {
	
		IOutputGenerator outputGenerator;
		
		public OutputHelper(){
			outputGenerator = new CsvOutputGenerator();
		}
		
		public void generateOutput(){
			outputGenerator.generateOutput();
		}
		

}
