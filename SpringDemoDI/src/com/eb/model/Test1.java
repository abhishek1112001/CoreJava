package com.eb.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		/*Resource r=new ClassPathResource("beans.xml");
		//BeanFactory spring ioc container
		
		BeanFactory factory=new XmlBeanFactory(r);*/
		
		Student s1=(Student)context.getBean("s1");
		
		s1.disp();
		
	}

}
