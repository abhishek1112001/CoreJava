package com.edubridge.assignment;

import java.util.Scanner;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = 10; //s.nextInt();
		int i = 1;
		int count ;
		for(i=1;i<=N;i++)
		{
			for(count=i;count<N;count++) 
			{
				System.out.printf(i+" ");
			}
			System.out.printf(i+"\n");
		}
		s.close();

	}

}
