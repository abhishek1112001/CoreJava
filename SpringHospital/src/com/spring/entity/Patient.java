package com.spring.entity;

public class Patient {

	private int pId;
	private String pName;
	private String disease ;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pName=" + pName + ", disease=" + disease + "]";
	}
	
	
	
}
