package com.edubridge.polymorphism;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football f = new Football();
		f.play("Football", 12);
		Basketball b = new Basketball();
		b.play("Basketball", 5);
		Rugby r = new Rugby();
		r.play("Rugby", 15);

	}

}
