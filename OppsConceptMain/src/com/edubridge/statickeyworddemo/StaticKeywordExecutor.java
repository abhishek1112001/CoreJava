package com.edubridge.statickeyworddemo;

class Lerner
{
	static String name ;
	static int rollNo;
	/* institute Name for all the learner are common so we can declare instituteName as static*/
	static String instituteName = "EduBridge";
	/*if any method is non static and we want inside
	 * the main method then make that 
	 * method as static*/
	static public void print() 
	{
		System.out.println("The name is : "+name+"\nRoll Number is : "+rollNo+"\nInstitute Name is : "+instituteName+"\n");
	}
	
}

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lerner.name = "Abhi";
		Lerner.rollNo = 06 ;
		Lerner.print();
		
		Lerner.name = "Raju";
		Lerner.rollNo = 07 ;
		Lerner.print();
	}

}
