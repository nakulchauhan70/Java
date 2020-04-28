package com.spring.controller;

public class OutputHelperSpring {
	
	IOutputGenerator outputGenerator;
	
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
		
	}
	
	public void generateOutput() {
		outputGenerator.generateOutput();
	}

}
