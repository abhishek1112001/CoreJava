package com.edubridge.generics;
/*Program to demonstrate Generic method*/ 

public class GenericMethodDemo {
	
	public static<E>void accept(E[] arr)
	{
		for(E itr:arr) 
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr1 = {11,22,33,44,55,66,77,88,99,100};
		System.out.println("First array is : ");
		GenericMethodDemo.accept(arr1);
		
		String[] arr2 = {"Abhi","Raju","Sham","Ram","Aman"};
		System.out.println("Second array is : ");
		GenericMethodDemo.accept(arr2);
		
		
	}

}
