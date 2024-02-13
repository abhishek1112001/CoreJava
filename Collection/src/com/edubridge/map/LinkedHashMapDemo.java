package com.edubridge.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Map<Integer,Object>obj1=new LinkedHashMap<>();
		obj1.put(1,"Abhi");
		obj1.put(2, "Ram");
		obj1.put(8, "Sham");
		obj1.put(4, "Gita");
		obj1.put(3, "Sita");
		obj1.put(7,"Abhi");
		obj1.put(5, "Ram");
		obj1.put(6, "Sham");
		obj1.put(9, "Gita");
		obj1.put(10, "Sita");
		System.out.println(obj1);
		for(Map.Entry<Integer, Object> itr:obj1.entrySet()) 
		{
			System.out.println(itr.getKey() +" "+itr.getValue());
		}

	}

}
