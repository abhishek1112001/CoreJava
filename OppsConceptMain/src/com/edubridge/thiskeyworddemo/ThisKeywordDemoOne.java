package com.edubridge.thiskeyworddemo;
// It can be use to refer instance variable of current class

class Account
{
	//instance variable
	public String accountType;
	public long accountNumber;
	
	public void setData(String accountType,long accountNumber)
	{
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}
	public void display() 
	{
		System.out.println("Account Type : "+accountType+"\nAccount Number is : "+accountNumber);
	}
}
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
		a.setData("Saving", 546546213);
		a.display();
		
	}

}
