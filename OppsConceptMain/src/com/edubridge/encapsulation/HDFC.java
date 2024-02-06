package com.edubridge.encapsulation;

//Parent class
public class HDFC {
	
	//private data members
	private String branch;
	private String ifsCode;
	
	//getters and setters
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsCode() {
		return ifsCode;
	}
	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}
	@Override
	public String toString() {
		return "HDFC [branch=" + branch + ", ifsCode=" + ifsCode + "]";
	}
	
	

}
