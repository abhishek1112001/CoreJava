package com.edubridge.encapsulation;

import java.util.Scanner;

/* Program to demonstrate on encapsulation */
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Customer c =new Customer();
		c.setBranch(s.next());
		//c.setBranch("Thane");
		c.setIfsCode("HDFC120078");
		c.setCustname("Abhi");
		c.setCustID(1035);
		c.setPinno(4433);
		System.out.println(c.getBranch());
		System.out.println(c);
		s.close();
	}

}
