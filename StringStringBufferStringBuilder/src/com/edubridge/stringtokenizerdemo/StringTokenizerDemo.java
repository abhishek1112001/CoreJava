package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer s = new StringTokenizer("" + "Hey there, I am using String Tokens");
		System.out.println(s.countTokens());
		System.out.println(s.nextToken());
		
		/*while(s.hasMoreTokens()) 
		{
			System.out.println(s.nextToken());
		}*/
		
		StringTokenizer s1 = new StringTokenizer("Edu-Bridge-India","-",true);
		
		while(s1.hasMoreTokens()) 
		{
			System.out.println(s1.nextToken());
		}
	}

}
