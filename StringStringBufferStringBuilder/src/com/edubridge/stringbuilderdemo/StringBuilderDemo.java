package com.edubridge.stringbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s = new StringBuilder("Abhishek is" + " full stack devloper");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.append(" of EduBridge"));
		System.out.println(s.capacity());
	}

}
