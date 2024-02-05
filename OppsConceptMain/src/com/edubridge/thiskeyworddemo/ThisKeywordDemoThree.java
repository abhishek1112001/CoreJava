package com.edubridge.thiskeyworddemo;
//This keyword is used to invoked current class constructor
public class ThisKeywordDemoThree {

	public int x; 
	ThisKeywordDemoThree()
	{
		this(15);
		System.out.println("This is a non-parametrize constructor ");
	}
	ThisKeywordDemoThree(int x)
	{
		//this();
		System.out.println("This is a parameterize Constructor : "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();
		//ThisKeywordDemoThree t = new ThisKeywordDemoThree();
	}

}
