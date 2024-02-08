package com.edubridge.interfacedemo;
/* program to demonstrate on nested interface*/
public interface Book {
	
	void showBook();
	
	interface StoryBooks{
		
		void showStoryBooks();
	}
	
}
