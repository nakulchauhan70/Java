package com.spring.bean;

public class CustomerVO {
	
	private PersonVO personVo;

	public PersonVO getPersonVo() {
		return personVo;
	}

	public void setPersonVo(PersonVO personVo) {
		this.personVo = personVo;
	}

	@Override
	public String toString() {
		return "CustomerVO [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	


	
}