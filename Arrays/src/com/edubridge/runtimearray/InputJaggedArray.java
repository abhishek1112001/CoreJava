package com.edubridge.runtimearray;

import java.util.Scanner;

public class InputJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int arr[][] = new int[m][];
		
	
		System.out.println("Enter");
		//for storing an array elements
		
		for(int i=0;i<arr.length;i++)
		{
			int n = s.nextInt();
			arr[0+i]=new int[n];
			for(int j=0;j<arr[i].length;j++) 
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
		s.close();
	}

}
