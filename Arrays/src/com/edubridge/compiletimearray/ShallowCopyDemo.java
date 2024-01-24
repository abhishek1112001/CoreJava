package com.edubridge.compiletimearray;

public class ShallowCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = {{1,20},{22,7}};
		int arr2[][] = arr1.clone();
		
		for(int i=0;i<arr2.length;i++) 
		{
			for(int j=0;j<arr2.length;j++) 
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
