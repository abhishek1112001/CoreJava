package com.edubridge.packone;
/*program to demonstrate on public
 * private and default access specifier
 * */
public class AccessSpecifireDemo {
	
	//private atm_pinNo
	private int atm_pinNo;
	public String emailId;
	float percentage;
	
	// private method
	private void displayPinNo(){
		System.out.println(atm_pinNo);
	}
	
	public void displayEmailId() {
		System.out.println("The Email Id is : "+emailId);
	}
	
	void displayPercentage() {
		System.out.println(percentage);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
