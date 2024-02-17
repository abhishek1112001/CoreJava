package com.edubridge.multithreadingdemo;
//1. Creating a thread by extending a thread class
public class ThreadDemo extends Thread {

	public void run() 
	{
		System.out.println("Thread is in the running state : "+Thread.currentThread());
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<4;i++) 
		{
			ThreadDemo t1 = new ThreadDemo();
			ThreadDemo t2 = new ThreadDemo();
			
			//to give the name for the thread
			t1.setName("Abhi");
			
			//to set the priority to the thread
			t1.setPriority(7);
			
			/*when we call the start() method , automatically
			 * it call to run method*/
			t1.start();
			t2.start();
			//System.out.println(t1.getName()+" "+t2.getName());
		}
		//System.out.println();
		
	}

}
