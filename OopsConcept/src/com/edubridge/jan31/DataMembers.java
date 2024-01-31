package com.edubridge.jan31;

class Members{
	String Name="Abhi";
	int Age=18;
	int PhoneNumber=985400;
	String Address="Mumbai";
	int Salary;
	void printSalary(int ss) 
	{
		System.out.println("Salary of the Members "+ss);
	}
	
}
class Employee1 extends Members{
	String specialization="Java";
	void show(){
		System.out.println("Name :"+Name+"\nAge :"+Age+"\nPhone Number :"+PhoneNumber+"\nAddress is : "+Address+"\nSpecialization is : "+specialization);
	}
}
class Manager extends Members{
	String department="Web";
	void show1(){
		System.out.println("Name :"+Name+"\nAge :"+Age+"\nPhone Number :"+PhoneNumber+"\nAddress is : "+Address+"\nDepartment is : "+department);
	}
}

public class DataMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1();
		Manager m = new Manager();
		
		e.show();
		e.printSalary(40000);
		m.show1();
		m.printSalary(80000);
		
	}

}
