package com.edubridge.regularexpressiondemo;

public class StringSplitMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "My, name, is, Abhishek";
		String[] out = input.split(",");
		for(String itr:out) 
		{
			System.out.print(itr+" ");
		}
		
		String input1 = "My name is 4 Abhishek";
		String out1 = "(\\d+)";
		String sss = input1.replaceAll(out1,"four");
		System.out.println("\nThis is replace method");
		System.out.println(sss);

	}

}
