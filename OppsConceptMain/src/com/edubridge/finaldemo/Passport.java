package com.edubridge.finaldemo;
//Child class
// we cannot inherit the final class 
public class Passport extends Card{

	private final String passportno ="IND886465452";
	private String dateOfexpiry;
	public String getDateOfexpiry() {
		return dateOfexpiry;
	}
	public void setDateOfexpiry(String dateOfexpiry) {
		this.dateOfexpiry = dateOfexpiry;
	}
	public String getPassportno() {
		return passportno;
	}
	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", dateOfexpiry=" + dateOfexpiry + ", toString()="
				+ super.toString() + "]";
	}
	
	/*We cannot override final method
	 * 
	void print() 
	{
		System.out.println("Final Method");
	}*/
	
	
}
