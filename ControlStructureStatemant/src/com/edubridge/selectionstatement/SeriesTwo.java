package com.edubridge.selectionstatement;

import java.util.Scanner;

public class SeriesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int res = 6;
		
		for(int i=1;i<=n;i++) 
		{
			System.out.print(res+" ");
			res+=5*i;
			
		}
		
		s.close();
	}

}
