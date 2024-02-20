package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj = Arrays.asList(4,56,78,99);
		//obj.stream().reduce((x,y) ->x*y);
		Optional<Integer>res=obj.stream().reduce((x,y)->x*y);
		if(res.isPresent())
			System.out.println(res.get());
		else
			System.out.println("not present");

	}

}
