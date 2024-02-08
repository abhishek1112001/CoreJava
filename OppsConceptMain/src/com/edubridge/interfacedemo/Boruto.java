package com.edubridge.interfacedemo;

public class Boruto implements Naruto,Hinata {
	
	
	
	@Override
	public String toString() {
		return "Boruto [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void power(int noofchildren, String position) {
		// TODO Auto-generated method stub
		System.out.println(noofchildren+" "+position);
		
	}

	@Override
	public void powerOne(int noofchildren, String clan) {
		// TODO Auto-generated method stub
		System.out.println(noofchildren+" "+clan);
	}

}
