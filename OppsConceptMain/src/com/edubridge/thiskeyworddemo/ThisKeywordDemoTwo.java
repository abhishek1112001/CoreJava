package com.edubridge.thiskeyworddemo;
//This keyword is use to pass inside the method call

public class ThisKeywordDemoTwo {
	
	void display(ThisKeywordDemoTwo t) 
	{
		System.out.println("This is a method to invoked method one");
	}
	void display2() 
	{
		//method call
		display(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemoTwo t =  new ThisKeywordDemoTwo();
		t.display2();
		
	}

}
