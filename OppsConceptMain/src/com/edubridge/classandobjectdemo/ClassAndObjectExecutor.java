package com.edubridge.classandobjectdemo;
/* program to demonstrate on class and object*/
class Vegatables 
{
	String vegatableName ;
	int price;
	
	void print() 
	{
		System.out.println("Vegatable Name id : "+vegatableName+"\nPrice is : "+price);
	}
}
// This is my driven class or main class
public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vegatables v=new Vegatables();
		v.vegatableName="Mung";
		v.price= 1200;
		v.print();

	}

}
