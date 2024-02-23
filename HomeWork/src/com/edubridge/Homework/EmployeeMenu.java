package com.edubridge.Homework;

import java.util.Scanner;

public class EmployeeMenu {

	public static void main(String[] args) {
		
		System.out.println("Wlcome to the Employee Management System");
		
		int choise =0;
		
		do 
		{
			System.out.println("1.Enter the Employee Name : ");
			System.out.println("2.Enter the Employee Designation : ");
			System.out.println("3.Enter the Employee Specialization : ");
			System.out.println("4.Exite : ");
			Scanner sc = new Scanner(System.in);
			choise = sc.nextInt();
			switch(choise) 
			{
			case 1 :
				System.out.println("Enter name :");
				String name=sc.next();
				System.out.println("Employee Name :" +name);
				break;
			case 2 :
				System.out.println("Enter name :");
				String Designation=sc.next();
				System.out.println("Employee Designation :" +Designation);
				break;
			case 3:
				System.out.println("Enter name :");
				String Specialization=sc.next();
				System.out.println("Employee Specialization :" +Specialization);
				break;
			case 4:
				System.out.println("Exite");
				break;
			default:
				System.out.println("Wrong Inpit !");
				break;
			}		
		}
		while(choise!=4);

	}

}
