package com.edubridge.statickeyworddemo;

public class StaticBlockExecutor {
	
	int x;
	static String str;
	
	static 
	{
		str ="static block";
	}
	static void display() 
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticBlockExecutor.display();
		System.out.println(StaticBlockExecutor.str);
	}

}
