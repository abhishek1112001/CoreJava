package com.edubridge.typesofvariables;

public class TypesOfVariablesDemo {
	
	//Instance Variable
	float salary=78900.56f;
	//Static variable
	static int x=10;
	
	String display() 
	{
		//Local Variable
		@SuppressWarnings("unused")
		char res='z';
		System.out.println(res);
		return "Local Variable";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		TypesOfVariablesDemo obj = new TypesOfVariablesDemo();
		System.out.println(obj.display());
		System.out.println(obj.salary);
	}

}
