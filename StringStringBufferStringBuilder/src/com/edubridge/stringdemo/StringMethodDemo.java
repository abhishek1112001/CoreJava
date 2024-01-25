package com.edubridge.stringdemo;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Nia Sharma";
		String str2 = " ";
		System.out.println(str1.length());
		char []arr = new char[str1.length()];
		str1.getChars(0, str1.length(), arr, 0);
		
		System.out.println(Arrays.toString(arr));		
		System.out.println(str1.compareTo("nia shaRma"));
		System.out.println(str1.compareToIgnoreCase("nia shaRma"));
		System.out.println(str2.isEmpty());
		System.out.println(str1.charAt(4));
		System.out.println("Hey Guy's, you are awesome".startsWith("He"));
		System.out.println("Hey Guy's, you are awesome".endsWith("some"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(" the colour is Red ".trim());
		//System.out.println("Abhishek".repeat(4));
	}

}
