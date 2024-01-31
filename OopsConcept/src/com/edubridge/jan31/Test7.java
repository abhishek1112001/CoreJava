package com.edubridge.jan31;
//overriding
class Animal{
	void eat() {
		System.out.println("Animal Behavoiur");
	}
}
class Cat1{
	void eat() {
		System.out.println("Cat Animal Behavoiur");
	}
}
class Dog1{
	void eat() {
		System.out.println("Dog Animal Behavoiur");
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Animal a1=new Animal();
		
		Cat1 c1=new Cat1();
		
		Dog1 d1=new Dog1();
		
		a1.eat();
		c1.eat();
		d1.eat();

	}

}
