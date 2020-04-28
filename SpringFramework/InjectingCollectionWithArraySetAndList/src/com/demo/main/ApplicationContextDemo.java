package com.demo.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.OrgInfo;
import com.demo.model.Student;

public class ApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("/config/Bean.xml");

		OrgInfo orgInfo = appContext.getBean("orgInfo", OrgInfo.class);

		System.out.println("/---------------------------------------------------------------------------------/");
		System.out.println("/----------------------------ArrayList Set Data Type------------------------------/");
		System.out.println("/---------------------------------------------------------------------------------/");

		String[] namesArr = orgInfo.getNamesArr();
		for (String name : namesArr) {
			System.out.print(name + " ");
		}
		System.out.println("\n");
		
		List<String> empNameList = orgInfo.getEmpNameList();
		empNameList.forEach(name -> System.out.print(name + " "));
		System.out.println("\n");

		Set<Integer> empIdSet = orgInfo.getEmpIdSet();
		empIdSet.forEach(id -> System.out.print(id + " "));
		System.out.println("\n");

		System.out.println("/---------------------------------------------------------------------------------/");
		System.out.println("/--------------------------------Custom Data Type---------------------------------/");
		System.out.println("/---------------------------------------------------------------------------------/");

		System.out.println("Student Array");
		Student[] stuArr = orgInfo.getStuArr();
		for (Student stud : stuArr) {
			System.out.println(stud.getId() + "\t" + stud.getName() + "\t" + stud.getEmail() + "\t" + stud.getGender());
		}
		System.out.println("\n");

		System.out.println("Student List");
		List<Student> stuList = orgInfo.getStuList();
		stuList.forEach(stud -> System.out
				.println(stud.getId() + "\t" + stud.getName() + "\t" + stud.getEmail() + "\t" + stud.getGender()));
		System.out.println("\n");

		System.out.println("Student Set");
		Set<Student> stuSet = orgInfo.getStuSet();
		stuSet.forEach(stud -> System.out
				.println(stud.getId() + "\t" + stud.getName() + "\t" + stud.getEmail() + "\t" + stud.getGender()));
		System.out.println("\n");

		System.out.println("/---------------------------------------------------------------------------------/");
		System.out.println("/------------------------------Map Custom Data Type-------------------------------/");
		System.out.println("/---------------------------------------------------------------------------------/");

		System.out.println("Map");
		Map<Integer, String> map = orgInfo.getMap();
		map.forEach((k, v) -> {
			System.out.println(k + "\t" + v);
		});
		System.out.println("\n");

		System.out.println("Custome Map");
		Map<String, Student> stuMAp = orgInfo.getStudentMap();
		stuMAp.forEach((k, v) -> {
			System.out.println(k + "\t" + "\t" + v.getId() + "\t" + v.getName() + "\t" + v.getEmail() + "\t" + v.getGender());
		});
		System.out.println("\n");

		System.out.println("/---------------------------------------------------------------------------------/");
		System.out.println("/------------------------------Map Custom Data Type-------------------------------/");
		System.out.println("/---------------------------------------------------------------------------------/");

		Properties properties = orgInfo.getProperties();
		properties.forEach((k, v) -> System.out.println(k + "\t" + v));
		System.out.println("\n");

		((AbstractApplicationContext) appContext).close();
	}

}
