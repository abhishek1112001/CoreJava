package com.edubridge.assignment;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		for(int i=0;i<=5;i++) 
		{
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
		
	}

}
