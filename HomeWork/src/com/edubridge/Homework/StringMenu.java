package com.edubridge.Homework;

import java.util.Scanner;

public class StringMenu {

	public static void main(String[] args) {
		System.out.println("Wlcome to the String Management System");
		
		String str1 ;
		String str2;
		int choise =0;
		do 
		{
			System.out.println("1.String Length  : ");
			System.out.println("2.Concatination : ");
			System.out.println("3.compare to : ");
			System.out.println("4.Exite : ");
			Scanner sc = new Scanner(System.in);
			choise = sc.nextInt();
			switch(choise) 
			{
			case 1 :
				System.out.println("Enter the string one ");
				str1 =sc.next();
				System.out.println("Enter the string Two ");
				str2 =sc.next();
				System.out.println("String Length:");
				System.out.println("String Length 1 : " + str1.length()+" String Length 2 : "+str2.length());
				break;
			case 2 :
				System.out.println("Enter the string one ");
				str1 =sc.next();
				System.out.println("Enter the string Two ");
				str2 =sc.next();
				System.out.println("String Concatination :");
				System.out.println("String Concatination :" + str1.concat(" "+str2));
				break;
			case 3:
				System.out.println("Enter the string one ");
				str1 =sc.next();
				System.out.println("Enter the string Two ");
				str2 =sc.next();
				System.out.println("compare to :");
				System.out.println("compare to :" +str1.compareTo(str2));
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
