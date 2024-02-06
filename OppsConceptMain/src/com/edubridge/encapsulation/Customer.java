package com.edubridge.encapsulation;

public class Customer extends HDFC {
	
	private String custname;
	private long custID;
	private int pinno;
	
	// getters and setters
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public long getCustID() {
		return custID;
	}
	public void setCustID(long custID) {
		this.custID = custID;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "Customer [custname=" + custname + ", custID=" + custID + ", pinno=" + pinno + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
