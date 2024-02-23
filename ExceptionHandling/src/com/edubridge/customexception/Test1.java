package com.edubridge.customexception;

public class Test1 extends Exception {
	
	void even() 
	{
		int number =10;
		
		if(number%2 == 0)
		{
			throw new ArithmeticException("");
		}
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.even();
	}

}
