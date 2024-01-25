package com.edubridge.loopingstatement;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		while(i<N) 
		{
			System.out.println(i+"");
			i++;
		}
		/*while(i>N)
		{
			System.out.println(i+"");
			i--;
		}*/
		
		s.close();
	}

}
