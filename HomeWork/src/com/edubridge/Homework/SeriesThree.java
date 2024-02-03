package com.edubridge.Homework;

import java.util.Scanner;

public class SeriesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		float res = 0.5f;
		float res1 = 1.5f;
		float res2 = 1f;
		int n = s.nextInt();
		System.out.print(res+" ");
		for(int i=1;i<n;i++) 
		{
			System.out.print(res1+" ");
			res2*=3;
			res1+=res2;
		}
		
		s.close();
		
		
	}

}
