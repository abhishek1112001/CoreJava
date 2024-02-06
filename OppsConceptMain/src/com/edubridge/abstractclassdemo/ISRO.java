package com.edubridge.abstractclassdemo;
// implementable child and child class
public class ISRO extends GovernmentAgency{

	void displayDetails() 
	{
		System.out.println("Indian space research"+"Organization");
	}

	@Override
	void displayDetails(String agencyName, long budget) {
		// TODO Auto-generated method stub
		System.out.println("agencyName : "+agencyName+"\nbudget : "+budget);
		
	}	
	
	
}
