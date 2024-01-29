package com.edubridge.Homework;

import java.util.Scanner;

public class TwoDifferencePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<2*n;i=i+2) 
		{
			for(int j=i;j<2*n;j+=2) 
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		/*for(int i=0;i<=n;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		
		
		s.close();
		
	}

}
