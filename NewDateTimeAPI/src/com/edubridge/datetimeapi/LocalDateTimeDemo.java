package com.edubridge.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d = LocalDate.now();
		System.out.println("The date is : "+d);
		
		LocalTime t = LocalTime.now();
		System.out.println("The time is : "+t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("The Date as well as Time is : "+dt);
		
	}

}
