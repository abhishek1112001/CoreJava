package com.edubridge.interfacedemo;

public class TheVibe implements Cafe {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Menu is : "+menu);
		
	}

	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub
		System.out.println("The price of " + menu + " is : "+price);
		
	}

}
