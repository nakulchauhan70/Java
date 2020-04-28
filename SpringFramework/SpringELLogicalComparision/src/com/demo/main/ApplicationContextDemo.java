package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.ExaminationResult;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		ExaminationResult examinationResult = appContext.getBean("examinationResult", ExaminationResult.class);

		System.out.println(examinationResult.getResultMessage()+"\t"+examinationResult.isPassed());
		
		((AbstractApplicationContext) appContext).close();

	}

}
