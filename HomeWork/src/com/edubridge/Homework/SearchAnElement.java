package com.edubridge.Homework;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int arr[] = new int[n];
		int i =0;
		int flag =0;
		
		for(i=0;i<n;i++) 
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the value to be search in array");
		int m = s.nextInt();
		//int res =0;
		for(i=0;i<n;i++) 
		{
			if(arr[i]==m) 
			{
				flag=1;
				//res = m;
				//System.out.println(res);
				//System.out.println(m+" is present in the array.");
			}
			/*else 
			{
				System.out.println(m+" not is present in the array.");
			}*/
			
		}
		//System.out.println(res+" is present in the array.");
		if(flag==1) 
		{
			System.out.println(m + " The element is found");
		}
		else 
		{
			System.out.println(m + " The element is Not found");
		}
		//System.out.println(res+" is present in the array.");
		s.close();
	}

}
