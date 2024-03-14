package com.eb.model;

public class Employee {

	private String ename;
	
	

	public Employee(String ename) {
		super();
		this.ename = ename;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(ename);
	}
}