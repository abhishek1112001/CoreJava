package com.edubridge.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Object>s = new HashSet<>();
		s.add("Akshay");
		s.add("Abhishek");
		s.add("Aftab");
		s.add("Atul");
		System.out.println(s);
		
		Set<Object>s1 = new LinkedHashSet<>();
		s1.add("Akshay");
		s1.add("Abhishek");
		s1.add("Aftab");
		s1.add("Atul");
		System.out.println(s1);
		
		SortedSet<Object>s2 = new TreeSet<>();
		s2.add("Akshay");
		s2.add("Abhishek");
		s2.add("Aftab");
		s2.add("Atul");
		System.out.println(s2);
	}

}
