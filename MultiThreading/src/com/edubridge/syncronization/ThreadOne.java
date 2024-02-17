package com.edubridge.syncronization;
//Thread 1
public class ThreadOne extends Thread {
	
	SyncronizedMethod m1;

	public ThreadOne(SyncronizedMethod m1) {
		super();
		this.m1 = m1;
	}
	
	public void run() 
	{
		m1.print(4);
	}

}
