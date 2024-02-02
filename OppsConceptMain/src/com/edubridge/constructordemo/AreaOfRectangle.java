package com.edubridge.constructordemo;
//program to demonstrate on non-parametrize and parameterize constructor 
class Rectangle
{
	//instance variable
	int length;
	int breadth;
	
	//parameterize constructor
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	//Non-parameterize constructor
	public Rectangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Rectangle");
	}
	//Method for calculation
	void show() 
	{
		System.out.println("Area of rectangle is : " + length*breadth);
		System.out.println("perimeter of rectangle is : "+2*(length+breadth));
	}
	
}


public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		Rectangle r3=new Rectangle();
		
		r1.show();
		r2.show();
	}

}
