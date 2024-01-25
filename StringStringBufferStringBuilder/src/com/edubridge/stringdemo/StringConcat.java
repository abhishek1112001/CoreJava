package com.edubridge.stringdemo;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str1 = s.next();
		String str2 = new String(s.next());
		
		System.out.println(str1+" "+str2);
		
		System.out.println(50+20+"Hello"+80+60+20);
		System.out.println(50-20+"Hello"+80+60+20);
		System.out.println(50*2+"Hello"+80+60+20);
		System.out.println(50/10+"Hello"+80+60+20);
		
		s.close();
		
	}

}
