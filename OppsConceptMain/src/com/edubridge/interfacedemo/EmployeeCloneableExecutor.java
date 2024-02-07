package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableExecutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Emp Name :");
		String empName =s.next();
		System.out.println("Enter the Emp ID :");
		int empID=s.nextInt();
		System.out.println("Enter the Emp Salary :");
		long salary = s.nextLong();
		
		Employee e = new Employee(empID,empName,salary);
		Employee e2 =(Employee)e.clone();
		e2.display();
		s.close();

	}

}
