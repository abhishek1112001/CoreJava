package com.edubridge.lambdaexperssiondemo;
//implemented Functional interface with the help of lambda expression
public class ProductExecutor {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//Lambda expression 
		Product p = (price)->{
			System.out.println("Price is : "+price);
			
		};
		System.out.println(p.displayProductName());
		
		//Static method can call by interface name
		System.out.println(Product.ProductBrand());
		
		p.displayProductPrice(5000);
		
		
	}

}
