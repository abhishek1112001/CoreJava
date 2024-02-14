package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Type-Safety
		List obj = new ArrayList<>();
		//It ensure that to add only string value
		//3. Compile time checking
		//obj.add(11);
		obj.add("11");
		obj.add("Shiwani");
		System.out.println(obj.get(0));
		
		//2. Type casting is not required
		//List obj2 = new ArrayList<>();
		List<String> obj1 = new ArrayList<>();
		obj1.add("Abhishek Gothankar");
		obj1.add("Abhi");
		//without generic type casting required
		//String sss = (String)obj1.get(0);
		String ss = obj1.get(1);
		System.out.println(ss);
	}

}
