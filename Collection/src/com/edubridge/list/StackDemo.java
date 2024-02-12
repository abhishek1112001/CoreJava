package com.edubridge.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Object>s = new Stack<>();
		s.add("Abhi");
		s.add(12);
		s.add('c');
		System.out.println(s.lastElement());
		s.push(67.4);
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}

}
