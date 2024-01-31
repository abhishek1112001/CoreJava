package com.edubridge.jan31;

public class Product {

	String pname ;
	int prise ;
	
	void disp(String p,int p1) 
	{
		pname=p;
		prise=p1;
		
		System.out.println("Product Name : " + pname + "\nProduct Price : " + prise);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product();
		
		p.disp("LG Tv", 20000);
		p.disp("LG Washing Machine", 50000);

	}

}
