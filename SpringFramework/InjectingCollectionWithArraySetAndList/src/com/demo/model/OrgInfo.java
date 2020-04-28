package com.demo.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class OrgInfo {

	private String namesArr[] = new String[2];
	private List<String> empNameList;
	private Set<Integer> empIdSet;

	private Student stuArr[] = new Student[2];
	private List<Student> stuList;
	private Set<Student> stuSet;

	private Map<Integer, String> map;
	private Map<String, Student> studentMap;

	private Properties properties;

	public String[] getNamesArr() {
		return namesArr;
	}

	public void setNamesArr(String[] namesArr) {
		this.namesArr = namesArr;
	}

	public List<String> getEmpNameList() {
		return empNameList;
	}

	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}

	public Set<Integer> getEmpIdSet() {
		return empIdSet;
	}

	public void setEmpIdSet(Set<Integer> empIdSet) {
		this.empIdSet = empIdSet;
	}

	public Student[] getStuArr() {
		return stuArr;
	}

	public void setStuArr(Student[] stuArr) {
		this.stuArr = stuArr;
	}

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	public Set<Student> getStuSet() {
		return stuSet;
	}

	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public Map<String, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<String, Student> studentMap) {
		this.studentMap = studentMap;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}