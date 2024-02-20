package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllEmptyStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>obj=Arrays.asList("","Ram","Abhi");
		
		//remove all the string
		List<String> a =obj.stream().filter(i -> i.isEmpty()).collect(Collectors.toList());
		System.out.println(a);
		
		//remove the empty string
		List<String> b =obj.stream().filter(i ->! i.isEmpty()).collect(Collectors.toList());
		System.out.println(b);
		
	}

}
