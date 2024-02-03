package com.edubridge.inheritance.multilevelinheritance;

public class Pulser220 extends Pluser180 {

	public int speed;
	public int price;
	
	public Pulser220(int speed, int price) {
		super(speed, price);
		this.speed = speed;
		this.price = price;
		super.speed = 80;
		super.price = 250000;
	}

	@Override
	public String toString() {
		return "Pulser220 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
}
