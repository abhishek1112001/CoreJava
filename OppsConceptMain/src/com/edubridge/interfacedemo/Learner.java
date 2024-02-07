package com.edubridge.interfacedemo;
//implementable class
public class Learner implements DeleteInteface{
	
	/* It provides run time information 
	 * about the objects*/
	public boolean delete(Object o) 
	{
		if (o instanceof DeleteInteface) 
			return true;
		else
			return false;
	}

}
