package com.edubridge.runtimearray;

import java.util.Scanner;

public class FindLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		// array declaration
		int[] arr =new int[n];
		int max=arr[0];
		//to initialize an array elements
		for(int i=0;i<n;i++) 
		{
			//to store array elements
			arr[i]=s.nextInt();	
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>max) 
			{
				max=arr[i];
				
			}
			
		}
		System.out.println("Largest element :"+ max);
		/*System.out.println("The store Array Elements are :");
		// to print array elements
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		s.close();*/
		s.close();
	}

}
