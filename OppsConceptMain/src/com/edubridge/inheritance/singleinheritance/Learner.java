package com.edubridge.inheritance.singleinheritance;

public class Learner extends Trainer{

	public String learnerName;
	public int rollNo;
	
	public void display() 
	{
		super.display();
		System.out.println("The learner Name is : "+learnerName+"\nThe Roll Number is : "+rollNo);
	}
}
