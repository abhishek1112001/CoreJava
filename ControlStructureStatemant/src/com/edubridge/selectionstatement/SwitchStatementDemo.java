package com.edubridge.selectionstatement;

import java.util.Scanner;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int map_no = s.nextInt();
		
		switch(map_no) 
		{
		case 1:
			System.out.println("welcome to Erangle");
			break;
		case 2:
			System.out.println("Welcome to Miramar");
			break;
		case 3:
			System.out.println("Wclome to Sanhok");
			break;
		case 4:
			System.out.println("Welcome to Vikendi");
			break;
		default:
			System.out.println("Invalid map no");
		}
		s.close();
	}

}
