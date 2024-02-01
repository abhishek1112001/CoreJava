package com.edubridge.feb1;

class A{
	A(){
		System.out.println("This is a default constructor for class A");
	}
	
	A(int i){
		this();
		System.out.println(i);
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a =new A(10);

	}

}
