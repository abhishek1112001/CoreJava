package com.edubridge.Homework;

import java.util.Scanner;

public enum DirectionExample {
	
	NORTH(0),
	SOUTH(1),
	EAST(2),
	WEST(3);
	
	int i=0;
	DirectionExample(int index)
	{
		i=index;
	}
	int displayDirection()
	{
		return i;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(DirectionExample.EAST);
		System.out.println(DirectionExample.WEST.displayDirection());
		s.close();
	}

}
