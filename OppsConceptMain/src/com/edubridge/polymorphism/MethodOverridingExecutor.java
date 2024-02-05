package com.edubridge.polymorphism;

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GoogleMeet g =new GoogleMeet();
		g.accept("Gmeet", "k@gmail.com");
		g.accept();
		System.out.println(g instanceof GoogleMeet);
	}

}
