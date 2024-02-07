package com.edubridge.interfacedemo;
/* Program to demonstrate on Cloneable 
 * built in marker interface */

/* if we are not implementing a Cloneable interface 
 * and if we are invoking the clone method 
 * in a driver class we */
public class Employee implements Cloneable{
	
	public int empID;
	public String empName;
	public long salary;
	
	public Employee(int empID, String empName, long salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	void display() 
	{
		System.out.println("Emp id : "+empID);
		System.out.println("Emp Name : "+empName);
		System.out.println("Emp Salary : "+salary);
	}
	/* override a clone method inside an implementable class to use over */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
