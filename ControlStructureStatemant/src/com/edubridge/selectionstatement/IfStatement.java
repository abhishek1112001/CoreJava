package com.edubridge.selectionstatement;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a!=b) 
		{
			System.out.println("a is not equal to b");
		}
		else 
		{
			System.out.println("a is equal to b");
		}
		
		s.close();
	}

}
