package com.edubridge.abstractclassdemo;

import java.util.Scanner;
//program to demonstract on abstract class 
public class AbstractClassExecutor {
	
	public static void main(String[] args) {
		/*we cannot create the object for 
		 * abstract class*/
		ISRO i =  new ISRO();
		Scanner s = new Scanner(System.in);
		System.out.println(i.display());
		i.displayDetails();
		//i.setAgencyName("ISRO");
		//i.setBudget(5680052);
		i.displayDetails(s.next(),s.nextLong());
		s.close();
	}

}
