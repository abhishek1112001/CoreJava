package com.edubridge.feb1;

/*interface

interface is defined by interface keyword

we cant create instance of interface

interface contain abstract method(bydefault method are abstract)

u can extend more than one interface at time

it is used to acheive multiple inheritance


class to class=extend
interface to interface=extends
interface to class=implements*/

interface i1{
	void show1();
}
interface i2{
	void show2();
}
interface i3 extends i1,i2{
	void show3();
}
class i4 implements i3{

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("This is show1 method");
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("This is show2 method");
		
	}

	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("This is show3 method");
		
	}
	
}


public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i4 i=new i4();
		i.show1();
		i.show2();
		i.show3();

	}

}
