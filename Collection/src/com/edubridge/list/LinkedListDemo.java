package com.edubridge.list;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>obj=new LinkedList<>();
		obj.add(33);
		obj.add(22);
		obj.add(11);
		System.out.println("List is : "+obj);
		obj.add(0, 100);
		System.out.println("List is : "+obj);
		System.out.println(obj.contains(22));
		System.out.println(obj.contains(66));
		System.out.println(obj.getClass());
		//obj.clear();
		//System.out.println("List is : "+obj);
		
		//for extracting list elements 
		for(Integer itr:obj) 
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		
		Iterator<Integer>itr = obj.listIterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Collections.sort(obj);
		for (Integer itr1:obj) 
		{
			System.out.print(itr1+" ");
		}
		
	}

}
