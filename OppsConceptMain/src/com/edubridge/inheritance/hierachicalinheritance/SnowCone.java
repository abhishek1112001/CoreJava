package com.edubridge.inheritance.hierachicalinheritance;
//child class 1(One)
public class SnowCone extends Android{
	
	public String version;
	
	protected void print() 
	{
		super.print();
		System.out.println(version);
	}
}
