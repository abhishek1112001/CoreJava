package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		
		//Filter
		List<String>obj=Arrays.asList("Abhi","Ram","Sa");
		obj.stream().filter(i ->i.length() > 2).forEach(System.out::println);
		//another way to print
		/*System.out.println("\nAnother way to print\n");
		obj.stream().filter(i ->i.length() > 2).forEach(i -> System.out.println(i));*/
		
		Stream<Integer>obj1 = Stream.of(11,4,67,89);
		obj1.filter(i ->i>80).forEach(System.out::println);
		
		//limit
		obj.stream().limit(2).forEach(System.out::println);
		
		obj.stream().limit(2).forEach(i ->System.out.print(i +" "));
		//skip
		obj.stream().skip(1).forEach(System.out::println);
		
		//System.out.println(obj1.count());

	}

}
