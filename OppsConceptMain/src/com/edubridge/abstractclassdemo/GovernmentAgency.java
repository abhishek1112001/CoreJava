package com.edubridge.abstractclassdemo;

/*if any class has atleast one abstract method 
 * then that class must be   */

public abstract class GovernmentAgency {
	private String agencyName;
	private long budget;
	
	abstract void displayDetails();
	abstract void displayDetails(String agencyName,long budget);
	
	String display() 
	{
		return "Concrete Method";
	}
	
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "GovernmentAgency [agencyName=" + agencyName + ", budget=" + budget + "]";
	}
	
	
	

}
