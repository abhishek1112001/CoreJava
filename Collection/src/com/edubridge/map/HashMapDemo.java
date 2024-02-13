package com.edubridge.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String>obj=new HashMap<>();
		obj.put(1,"Abhi");
		obj.put(2, "Ram");
		obj.put(1, "Sham");
		obj.put(4, "Gita");
		obj.put(3, "Sita");
		System.out.println(obj);
		System.out.println(obj.containsKey(4));
		System.out.println(obj.containsKey(6));
		/*It removes complete 1=key and associated value
		 * or it remove entire entries of key 1  */
		obj.remove(1);
		System.out.println(obj);
		
		Map<Integer,String>obj1=new HashMap<>();
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

	}

}
