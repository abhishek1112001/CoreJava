package com.spring.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Patient p1=(Patient)context.getBean("hp");
		
		p1.disp();
	}

}