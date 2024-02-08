package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int x =15;
		System.out.println("Enter the value of y : ");
		int y=s.nextInt();
		try 
		{
			System.out.println(x/y);
			/*when we throw an exception inside a finally block 
			 * before printing the statements*/
			//System.exit(0);
		
			
		}
		catch(Exception e) 
		{
			
			System.out.println("Exception occour is : "+e);
			//System.exit(0);
			/*when we throw an exception inside a finally block 
			 * after printing the statements*/
		}
		finally 
		{
			//System.exit(0);
			System.out.println("always Excecuted");
		}
		
		s.close();

	}

}
