package com.edubridge.stringdemo;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BY USING STRING LITERLS
		String S1 = "Edubridge";
		String S2 = "Edubridge";
		//BY USING NEW KEYWORD
		String S3 = new String("Edubridge");
		String S4 = new String("Edubridge");
		
		System.out.println(S1==S2);
		System.out.println(S1==S4);
		System.out.println(S2==S4);
		System.out.println(S1.equals(S4));
		System.out.println(S3.equals(S4));
	}

}
