package com.edubridge.jan31;
abstract class Orders{
	public void show() {
		System.out.println("This is show method");
	}
}
class Demo extends Orders{
	
}
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ol = new Demo();
		
		ol.show();
	}

}
