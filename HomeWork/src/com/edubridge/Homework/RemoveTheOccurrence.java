package com.edubridge.Homework;

import java.util.Scanner;

public class RemoveTheOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println(str.replaceAll("the", ""));
		
		s.close();
		
	}

}
