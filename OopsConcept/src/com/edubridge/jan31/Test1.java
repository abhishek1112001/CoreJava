package com.edubridge.jan31;

class Dog{
	String Color = "Black";
}

class Cat extends Dog{
	
	String Color1 = "White";
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c1 = new Cat();
		
		System.out.println("The Color of Dog is : "+c1.Color +"\nThe Color of Cat is : "+c1.Color1);
	}

}
