package com.edubridge.list;

import java.util.ArrayList;
import java.util.List;

//import java.util.Collection;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we cannot create a object for collection interface*/
		//Collection <String> obj = new Collection<>();
		List<String>obj=new ArrayList<>();
		obj.add("Abhi");
		obj.add("Raju");
		obj.add("Ram");
		System.out.println(obj);
		List<Object>obj2=new ArrayList<>();
		obj2.add("Abhi");
		obj2.add(101);
		obj2.add(90.25);
		System.out.println(obj2);
		List<Object>obj3=new ArrayList<>();
		obj3.addAll(obj);
		System.out.println(obj3);
		System.out.println(obj2.get(1));
		obj3.remove(1);
		System.out.println(obj3);

	}

}
