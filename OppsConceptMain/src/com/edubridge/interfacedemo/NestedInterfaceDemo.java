package com.edubridge.interfacedemo;

public class NestedInterfaceDemo implements Book,Book.StoryBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterfaceDemo n = new NestedInterfaceDemo();
		n.showBook();
		n.showStoryBooks();

	}

	@Override
	public void showStoryBooks() {
		// TODO Auto-generated method stub
		System.out.println("Half-Girlfriend");
		
	}

	@Override
	public void showBook() {
		// TODO Auto-generated method stub
		System.out.println("Java Programming- "+" By Yashwant Kanetkar");
	}

}
