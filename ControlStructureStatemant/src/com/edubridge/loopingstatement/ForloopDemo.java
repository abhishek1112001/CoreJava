package com.edubridge.loopingstatement;

import java.util.Scanner;

public class ForloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		/*for(int i=1;i<N;i++)
		{
			System.out.println(i+" ");
		}*/
		for(int i=N;i>0;i--)
		{
			System.out.println(i+" ");
		}
		
		s.close();
	}

}
