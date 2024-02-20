package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpercaseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>obj=Arrays.asList("Sham","Ram","Abhi");
		String s=obj.stream().map(i ->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(s);
		

	}

}
