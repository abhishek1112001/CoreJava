package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int x = 45;
		System.out.println("Enter the y value : ");
		int y = s.nextInt();
		int arr[]= {11,22,33};
		try 
		{
			System.out.println(arr[33]);
		}
		catch(Exception e) 
		{
			System.out.println(e);
			try 
			{
				System.out.println(x/y);
				//System.out.println(0);
			}
			catch(ArithmeticException e1) 
			{
				System.out.println(e1);
			}
		}
		finally 
		{
			System.out.println("Allways Ececuted");
		}
		s.close();
		

	}

}
