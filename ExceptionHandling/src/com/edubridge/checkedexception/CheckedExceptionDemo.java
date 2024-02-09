package com.edubridge.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\lenovo\\Desktop\\hello.java");
		
		/* File is not exsits*/
		//File f2 = new File("C:\\Users\\lenovo\\Desktop\\hello.txt");
		try {
			@SuppressWarnings("resource")
			FileInputStream f1 = new FileInputStream(f);
			//FileInputStream f3 = new FileInputStream(f2);
			System.out.println("File is Found");
		} catch (FileNotFoundException e) {
			System.out.println("File not found : " +e);
		}
		
		

	}

}
