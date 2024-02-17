package com.edubridge.syncronization;

public class MyThread extends Thread {

	Welcome w;
	String str1;
	public MyThread(Welcome w) {
		super();
		this.w = w;
	} 
	public void run() 
	{
		// to access the static method use classname.methodname
		Welcome.display(getName());
	}
}
