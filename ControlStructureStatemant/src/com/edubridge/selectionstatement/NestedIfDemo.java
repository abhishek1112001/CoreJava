package com.edubridge.selectionstatement;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the person age and weight :");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if (age > 12) 
		{
			if(weight >= 45 && weight<=110 || weight>=110) 
			{
				System.out.println("eligible for bunjee jumping . if weight is greater then 110 the addtinoal ropes are added");
			}
			else
			{
				System.out.println("the person is not eligible ");
			}
		}
		else 
		{
			System.out.println("the person is not eligible ");
		}
	}

}
