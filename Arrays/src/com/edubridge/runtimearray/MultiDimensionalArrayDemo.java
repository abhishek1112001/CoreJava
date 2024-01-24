package com.edubridge.runtimearray;

import java.util.Scanner;

/* program to demonstrate on Multi-Dimenstional Arrays */
public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		//two-d array declaration
		int arr[][] = new int[m][n];
		//storing the array elements
		
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
