package com.spring.bean;

import com.spring.controller.IOutputGenerator;

public class OutputHelper {
	
		IOutputGenerator outputGenerator;
		
		public OutputHelper(IOutputGenerator outputGenerator) {
			this.outputGenerator = outputGenerator;
		}
		
		public void generateOutput(){
			outputGenerator.generateOutput();
		}
		

}
