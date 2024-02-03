package com.edubridge.inheritance.multilevelinheritance;

public class Pluser180 extends Pulser {
	
	public int speed;
	public int price;
	
	public Pluser180(int speed,int price) 
	{
		// super keyword is used to call parent class constructor
		super(speed,price);
		this.speed=speed;
		this.price=price;
		super.speed = 45;
		super.price =180000;
	}

	@Override
	public String toString() {
		return "Pluser180 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
}
