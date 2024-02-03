package com.edubridge.inheritance.multilevelinheritance;
//Program to demonstrate on Multilevel inheritance
//Parent class 1
public class Pulser {
	public int speed;
	public int price;
	
	public Pulser(int speed,int price) 
	{
		this.speed=speed;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Pulser [speed=" + speed + ", price=" + price + "]";
	}

}
