package com.edubridge.statickeyworddemo;

public class StaticVariableDemo {
	//Static keyword with variable name
	/* when any var is non static and 
	 * we are trying to access that variable 
	 * inside the main method then will we get an error
	 * so that we have to use static keyword with var name*/
	
	static float percentage= 89.25f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The percentage is : "+percentage);
	}

}
