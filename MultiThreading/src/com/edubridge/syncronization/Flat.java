package com.edubridge.syncronization;

public class Flat {
	
	public void  print(int num) 
	{
		//3 synchronized block
		synchronized(this) 
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println(num*i);
				try 
				{
					Thread.sleep(500);
				} 
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
