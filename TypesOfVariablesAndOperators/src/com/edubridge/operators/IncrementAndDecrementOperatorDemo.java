package com.edubridge.operators;

public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6,b=3;
		@SuppressWarnings("unused")
		int res=a++ - ++b;
		
		@SuppressWarnings("unused")
		int res2= --a + b--;
		System.out.println(a);
		System.out.println(b);

	}

}
