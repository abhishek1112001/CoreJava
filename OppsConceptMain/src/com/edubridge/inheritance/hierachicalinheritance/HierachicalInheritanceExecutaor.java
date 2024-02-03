package com.edubridge.inheritance.hierachicalinheritance;

public class HierachicalInheritanceExecutaor {
	
	public static void main(String[] args) 
	{
		SnowCone s = new SnowCone();
		Tiramisu t = new Tiramisu();
		
		s.deviceName="Realme 10 Pro Plus 5g";
		t.deviceName="Samsung";
		s.version="12";
		t.version="14";
		s.print();
		t.print();
	}

}
