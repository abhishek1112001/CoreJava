package com.edubridge.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Object>obj1=new Hashtable<>();
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
		/* we cannot use the key and value as " Null "
		 * else we will get the null pointer Exception*/ 
		//obj1.put(null, null);
		System.out.println(obj1);

	}

}
