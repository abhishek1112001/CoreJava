package com.edubridge.multithreadingdemo;

public class RunnableInterfaceDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) 
		{
			System.out.println("Thread "+i+" is in running state");
		}
	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		t1.start();
		t1.setName("Abhi");
		System.out.println(t1);
		System.out.println();
		
		RunnableInterfaceDemo t2 = new RunnableInterfaceDemo();
		t2.run();
		
		RunnableInterfaceDemo t3 = new RunnableInterfaceDemo();
		Thread t4 = new Thread(t3);
		System.out.println();
		
		//after 5 second it will print because we use the start method for t4 after sleep method
		try 
		{
			t4.sleep(5000);
			
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		t4.start();
	}

	
}
