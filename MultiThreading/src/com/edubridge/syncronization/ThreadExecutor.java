package com.edubridge.syncronization;

public class ThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncronizedMethod m = new SyncronizedMethod();
		ThreadOne t = new ThreadOne(m);
		ThreadTwo t1 = new ThreadTwo(m);
		t.setPriority(1);
		t1.setPriority(10);
		t.start();
		t1.start();
	}

}
