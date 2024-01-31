package com.edubridge.jan31;

/*overloading(compile time /static)
method have same with different parameters*/
class Calculation
{
	void add(String a, String b) {
		System.out.println("Addition is:"+(a+b));
	}
	void add(int a, int b) {
		System.out.println("Addition is:"+(a+b));
	}
	void add(int a, int b,int c) {
		System.out.println("Addition is:"+(a+b+c));
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation c1=new Calculation();
		
		c1.add(10,20);
		c1.add("Hello","World");
		c1.add(10,20,30);

	}

}
