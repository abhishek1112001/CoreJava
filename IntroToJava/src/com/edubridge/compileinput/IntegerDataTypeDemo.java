package com.edubridge.compileinput;

import java.util.Scanner;

public class IntegerDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		byte num = s.nextByte();
		short num1 = s.nextShort();
		int num2 = s.nextInt();
		long num3 = s.nextLong();
		
		System.out.println("The byte num value is : "+num);
		System.out.println("The Short value num1 is : "+num1);
		System.out.println("The Int num2 value is :" +num2);
		System.out.println("The long num3 value is :"+num3);
		
		s.close();
	}

}
