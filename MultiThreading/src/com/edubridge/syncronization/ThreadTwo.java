package com.edubridge.syncronization;
//Thread 2
public class ThreadTwo extends Thread {
	/* Referance object syncronized class*/
	SyncronizedMethod m2;

	public ThreadTwo(SyncronizedMethod m2) {
		super();
		this.m2 = m2;
	}
	
	public void run() 
	{
		m2.print(8);
	}

}
