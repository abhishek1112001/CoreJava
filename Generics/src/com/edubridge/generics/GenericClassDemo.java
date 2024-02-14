package com.edubridge.generics;
/* Program t demonstrate generic class by passing same type  */
class Citizen<T>
{
	//where T defines any kind of Type-values
	T str ;
	T str1;
	
	void print(T str ,T str1) 
	{
		this.str = str;
		this.str1 = str1;
		System.out.println("The value is : "+str +" "+str1);
	}
}
// driver class
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen<String> c = new Citizen<>();
		c.print("Mumbai", "Indian");
		
		

	}

}
