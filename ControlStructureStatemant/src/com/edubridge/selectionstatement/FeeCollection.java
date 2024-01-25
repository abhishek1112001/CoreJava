package com.edubridge.selectionstatement;

import java.util.Scanner;

public class FeeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		double FeeAmount = 0;
		
		System.out.println("Enter Student Type");
		String StudentType = s.next();
		System.out.println("Enter Tuition Fee");
		float tf = s.nextFloat();
		System.out.println("Enter Bus Fee");
		float bf = s.nextFloat();
		System.out.println("Enter Hostel Fee");
		float hf = s.nextFloat();
		
		switch(StudentType) 
		{
			case "MSDS":
				FeeAmount = tf+bf;
				System.out.printf("%.2f",FeeAmount);
				break;
			case "MSH" :
				FeeAmount = tf+hf;
				System.out.printf("%.2f",FeeAmount);
				break;
			case "MGSDS" :
				FeeAmount = 1.5*tf+ bf ;
				System.out.printf("%.2f",FeeAmount);
				break;
			case "MGSH" :
				FeeAmount = 1.5*tf+hf ;
				System.out.printf("%.2f",FeeAmount);
				break;
			default :
				System.out.println("Invalid");
		}
		
		
		s.close();
	}

}
