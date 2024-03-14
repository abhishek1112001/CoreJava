package com.spring.entity;

public class Employee {

	private String eName;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public void disp() {
		System.out.println(eName);
	}
}
