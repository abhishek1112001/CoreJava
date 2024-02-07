package com.edubridge.lambdaexperssiondemo;
@FunctionalInterface
public interface Product {
	// Abstract method
	void displayProductPrice(int price);
	
	//Default method
	default String displayProductName() 
	{
		return "Perfume";
	}
	
	//static method
	static String ProductBrand() 
	{
		return "Zara";
	}

}
