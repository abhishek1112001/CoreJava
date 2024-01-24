package com.edubridge.operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println((a==3 && b>a));
		System.out.println((a==3 || b>a));
		System.out.println(!(a<=b));
		
		s.close();
	}

}
