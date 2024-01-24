package com.edubridge.compileinput;

import java.util.Scanner;

public class FloatingPointDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		float x = s.nextFloat();
		double y = s.nextDouble();
		boolean res = false;
		String ss = s.next(); // or String s = s2.nextLine();
		s.next();
		char w = s.next().charAt(0);
		
		System.out.println("The float value is :"+x);
		System.out.println("the double value is :"+y);
		System.out.println("The boolean value is :" +res);
		System.out.println("The String value is :"+ss);
		System.out.println("The Char Value is :"+w);
		
		s.close();
	}

}
