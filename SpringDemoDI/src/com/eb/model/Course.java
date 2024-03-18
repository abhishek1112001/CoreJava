package com.eb.model;

public class Course {
	
	private int id;
	private String name;
	private int duration;
	private int fee ;
	
	public Course(int id, String name, int duration, int price) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fee = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", price=" + fee + "]";
	}
	
	
	
	

}
