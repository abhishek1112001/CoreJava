package com.edubridge.interfacedemo;
//interface
public interface Cafe {
	
	/* All the fields inside the interface 
	 * are by default public static final*/
	String menu ="Pav Bhaji";
	int price = 90;
	
	/* all the methods inside an interface
	 * are by default public abstract*/
	void show();
	void displayPrice();

}
