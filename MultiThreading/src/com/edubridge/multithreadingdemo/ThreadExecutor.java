package com.edubridge.multithreadingdemo;
//Creating a thread by implementing a runnable interface
public class ThreadExecutor implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<3;i++) 
		{
			System.out.println("Thread "+i+" "+Thread.currentThread());
		}
		
	}
	public static void main(String[] args) {
		
		ThreadExecutor t1 = new ThreadExecutor();
		t1.run();
		//t1.run();

	}


}
