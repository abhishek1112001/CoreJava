package com.edubridge.enumeration;

public enum Day {
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THRUSDAY(4),FRIDAY(5),SATURDAY(6);
	
	private int i;

	Day(int index) {
		i=index;
		// TODO Auto-generated constructor stub		
	}
	int displayIndex() 
	{
		return i;
	}
	public static void main(String[] args) {
		System.out.println(Day.THRUSDAY);
		System.out.println(Day.SATURDAY.displayIndex());
	}

}
