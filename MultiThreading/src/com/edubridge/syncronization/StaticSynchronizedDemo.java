package com.edubridge.syncronization;

public class StaticSynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcome w1 = new Welcome();
		MyThread m1 = new MyThread(w1);
		MyThread m2 = new MyThread(w1);
		m1.start();
		m2.start();
		

	}

}
