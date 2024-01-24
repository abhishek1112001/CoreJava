package com.edubridge.operators;

import java.util.Scanner;

public class BitwiseAndShiftingOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for a and b and c and d");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);

		System.out.println(c<<d);
		System.out.println(c>>d);
		
		s.close();
	}

}
