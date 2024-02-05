package com.edubridge.polymorphism;
//Program to demonstrate program overloading
class Stocks
{
	String shareName;
	long sharePrice;
	String shareType;
	//method overloading
	public static void displayStockDetails(String shareName,long sharePrice) 
	{
		System.out.println(shareName+" "+sharePrice);
	}	
	
	public static void displayStockDetails(String shareName,String shareType) 
	{
		System.out.println(shareName+" "+shareType);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stocks.displayStockDetails("Jio", 30000);
		Stocks.displayStockDetails("Jio", "Nifti-50");

	}

}
