package com.edubridge.uncheckedexception;

import java.io.IOException;
import java.util.Scanner;

/* Program to demonstrate on throw and throws keywords */
public class ThrowKeywordDemo {
	/* throws keyword is used to declare a checked exception*/
	public static void donate(int age ,int weight) throws IOException 
	{
		if(age>18 && weight>45) 
		{
			System.out.println("Eligible to donate the blood");
		}
		else 
		{
			throw new IOException("Not Eligible");
			
		}
	}

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		/*One Way without using try catch output in red line*/
		ThrowKeywordDemo.donate(age, weight);
		
		/*second Way with using try catch output in blue line line*/
		
		/*try
		{
			ThrowKeywordDemo.donate(age, weight);
		}
		catch(IOException e) 
		{
			System.out.println(e);
		}*/
		
		s.close();
	}
}
