package com.edubridge.packtwo;

import com.edubridge.packone.AccessSpecifireDemo;

public class AccessSpecifireProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessSpecifireDemo a = new AccessSpecifireDemo();
		// emailId is public so we can use it
		a.emailId ="abhi@gami.com";
		a.displayEmailId();
		//System.out.println("Email Id is : "+a.emailId);
		
		/*atm_pinNo is private and we cannot access into another class
		 * obj.atm_pinNo=556565;
		 * 
		 * displayPinNo(); is private and we cannot access into another class
		 * obj.displayPinNo(); 
		 * 
		 * percentage is default and we can only access to the same package
		 * obj.percentage=55.20f;
		 * 
		 * displayPercentage(); is default and we cannot access into another class 
		 * we can only access to the same package
		 * obj.displayPercentage(); 
		 * */
		
		

	}

}
