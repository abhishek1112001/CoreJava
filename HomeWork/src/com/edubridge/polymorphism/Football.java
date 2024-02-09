package com.edubridge.polymorphism;

public class Football extends Sport{
	
	public void play(String sportName,int totalMembers ) 
	{
		this.sportName=sportName;
		this.totalMembers=totalMembers;
		System.out.println("Sport name is " +sportName+"\nTotal Number "+totalMembers);
	}

}
