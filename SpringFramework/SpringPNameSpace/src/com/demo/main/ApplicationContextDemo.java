package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.Course;
import com.demo.model.Student;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		Student student = appContext.getBean("student", Student.class);

		System.out.println(student.getClass().getSimpleName() + "\t" + student.getName() + "\t" + student.getAge());

		System.out.println("//////////////////////////////////////////////////////////////////////");

		Course course = student.getCourse();

		System.out.println(course.getClass().getSimpleName() + "\t" + course.getCourseName());
		
		((AbstractApplicationContext) appContext).close();

	}

}
