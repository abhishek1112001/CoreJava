package com.edubridge.multithreadingdemo;
//1. Creating a thread by extending a thread class
public class ThreadDemo extends Thread {

	public void run() 
	{
		System.out.println("Thread is in the running state : "+Thread.currentThread());
	}
	
	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		/*when we call the start() method , automatically
		 * it call to run method*/
		t1.start();
		t2.start();
	}

}
