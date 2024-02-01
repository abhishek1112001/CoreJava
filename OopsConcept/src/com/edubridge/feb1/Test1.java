package com.edubridge.feb1;
class Employee{
	String empName;
	int age;
	
	Employee(){
		System.out.println("This is A default constructor");
	}
	Employee(String empName,int age){
		empName=empName;
		age=age;
		System.out.println(empName+" "+age);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee("jhon",22);
	}

}
