package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class MultipalCatchBlockDemo {

	public static void displayArray(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = 45;
		System.out.println("Enter the y value : ");
		int y = s.nextInt();
		try 
		{
			System.out.println(x/y);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		int arr[]= {11,22,33};
		MultipalCatchBlockDemo.displayArray(arr);
		s.close();

	}

}
