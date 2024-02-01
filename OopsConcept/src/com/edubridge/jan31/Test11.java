package com.edubridge.jan31;
abstract class BankDetails{
	String bankName="Bank of India";
	String accountHolderName="Jhon Smith";
	String address="Mumbai";
	String emailId="Jhon.gmail.com";
	long contact=556521344;
	void disp() {
		System.out.println("Bank Name :"+bankName+"\nAccount Holder Name : "+accountHolderName+"\nAddress :"+address+"\nEmail Id : "+emailId+"\nContact Number is : "+contact);
	}
}
class Atm extends BankDetails{
	int pinNo=8942;
	int amount=50000;
	void disp1() {
		System.out.println("pin No: "+pinNo+"\nAmount is : "+amount);
	}
}
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm b1 = new Atm();
		
		b1.disp1();
		b1.disp();
	}

}
