package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalZoneDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println("The Zoned Date And Time : "+z);
		
		OffsetTime o = OffsetTime.now();
		System.out.println(o);
		
		OffsetDateTime o1 = OffsetDateTime.now();
		System.out.println(o1);
		
		ZoneId i = ZoneId.of("Asia/Calcutta");
		System.out.println(i);
		
		ZoneOffset z2 = ZoneOffset.ofHoursMinutes(12, 20);
		System.out.println(z2);
		
		String str ="2022-12-04 12:30";
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime d2 = LocalDateTime.parse(str,d1);
		System.out.println(d2);
		
		
		
		

	}

}
