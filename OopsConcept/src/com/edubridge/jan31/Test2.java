package com.edubridge.jan31;

class A{
	void methodA() {
		System.out.println("This is class A methode");
	}
}
class B extends A{
	void methodB() {
		System.out.println("This is class B methode");
	}
}
class C extends B{
	void methodC() {
		System.out.println("This is class C methode");
	}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cc = new C();
		cc.methodA();
		cc.methodB();
		cc.methodC();

	}

}
