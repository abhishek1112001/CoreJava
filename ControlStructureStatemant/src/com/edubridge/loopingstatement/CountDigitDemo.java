package com.edubridge.loopingstatement;

import java.util.Scanner;

public class CountDigitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		//char N = s.next().charAt(0);
		int N = s.nextInt();
		int count = 0;
		
		while(N!=0) 
		{
			count ++;
			N=N/10;
		}
		System.out.println(count+"");
		s.close();
	}

}
