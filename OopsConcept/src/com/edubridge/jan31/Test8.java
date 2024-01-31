package com.edubridge.jan31;

class shape11{
	void show(){
		System.out.println("This is This is shape");
	}
}
class Rectangle1 extends shape11{
	void show1(){
		System.out.println("This is a Rectangle shape");
	}
}
class Circle1 extends shape11{
	void show2(){
		System.out.println("This is a Circle shape");
	}
}
class Square1 extends Rectangle1{
	void show3() {
		System.out.println("Square is Rectangle ");
	}
}

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square1 s1=new Square1() ;
		Circle1 c = new Circle1();
		s1.show();
		s1.show1();
		s1.show3();
		c.show2();

	}

}
