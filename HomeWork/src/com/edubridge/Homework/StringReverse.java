package com.edubridge.Homework;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next() ;
		
		for(int i=str.length();i>0;i--) 
		{
			System.out.print(str.charAt(i-1));
		}
		s.close();
		
	}

}
