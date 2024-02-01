package com.edubridge.feb1;

abstract class Animal{
	
	void eat() {
		System.out.println("Animal is eating");
	}
	
	abstract void bark();
}
class Dog extends Animal {

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
		
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		
		d1.bark();
		d1.eat();
	}

}
