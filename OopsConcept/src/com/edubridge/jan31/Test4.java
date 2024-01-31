package com.edubridge.jan31;

class Bank{
	String bankName ="Bank Of India";
	String address="Mumbai";
	
	void disp(String b,String a) {
		bankName =b;
		address = a;
		System.out.println("Bank Name : "+bankName+"\nbank address is : "+address);
	}
}
class Facility extends Bank{
	float roi=8.5f;
	void show() {
		System.out.println("Bank Name : "+bankName+"\nbank address is : "+address+"\nRate of intreast : "+roi);
	}
}
class Info extends Bank{
	float roi = 11.5f;
	void show1(){
		System.out.println("Bank Name : "+bankName+"\nbank address is : "+address+"\nRate of intreast : "+roi);
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facility fa = new Facility();
		Info in = new Info();
		
		fa.show();
		in.show1();
		
	}

}
