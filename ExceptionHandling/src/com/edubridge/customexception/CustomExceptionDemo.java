package com.edubridge.customexception;

import java.util.Scanner;

public class CustomExceptionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String email_id = s.next();
		String password = s.next();
		
		try 
		{
			if(email_id.equals("abhi@gmail.com") && password.equals("abhi@12345")) 
			{
				System.out.println("login in "+"Successfully");
			}
			else 
			{
				throw new LoginCredentials("Invalid " + "Credentials");
			}
		}
		catch(LoginCredentials e) 
		{
			System.out.println(e);
		}
		
		s.close();

	}

}
