package com.edubridge.polymorphism;

class Renault
{
	String carName;
	int noofSeater;
	String color;
	String engine;
	float price ;
	
	Renault(String carName,String color,int noofSeater)
	{
		this.carName=carName;
		this.color=color;
		this.noofSeater=noofSeater;
		System.out.println(carName+" "+color+" "+noofSeater);
	}
	Renault(String carName,String engine,float price)
	{
		this.carName=carName;
		this.engine=engine;
		this.price=price;
		System.out.println(carName+" "+engine+" "+price);
	}
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renault r = new Renault("M4A16","black",6);
		Renault r1 = new Renault("Ak-47","CNG",80000);
	}

}
