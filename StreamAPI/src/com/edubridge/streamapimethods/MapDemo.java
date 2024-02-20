package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>obj=Arrays.asList("Abhi","Ram","Sa");
		obj.stream().map(i ->i.toLowerCase()).forEach(System.out::println);
		obj.stream().map(i ->i.toUpperCase()).forEach(i->System.out.print(i+" "));
		

	}

}
