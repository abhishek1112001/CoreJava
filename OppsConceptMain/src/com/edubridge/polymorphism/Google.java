package com.edubridge.polymorphism;
//parent
public class Google {
	String appName;
	String emailId;
	
	public void accept(String appName,String emailId) 
	{
		this.appName=appName;
		this.emailId=emailId;
		System.out.println(appName+" "+emailId);
	}
	
}
