package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String,Float>obj1=new TreeMap<>();
		obj1.put("Abhi",1.55f);
		obj1.put("Ram",2.66f);
		obj1.put("Sham",8.44f);
		obj1.put("Gita",4.44f);
		obj1.put("Sita",37.01f);
		
		for(Map.Entry<String,Float> itr:obj1.entrySet()) 
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		
	}

}
