package com.edubridge.feb1;

class All{
	int x=100;
}
class B extends All{
	int x=200;
	
	void show() {
		System.out.println(super.x);
	}
}

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B();
		System.out.println(b1.x);
		b1.show();

	}

}
