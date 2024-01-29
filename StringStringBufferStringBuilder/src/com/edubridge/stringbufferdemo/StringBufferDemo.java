package com.edubridge.stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abhi";
		StringBuffer s = new StringBuffer("Shiwani");
		StringBuffer s1 = new StringBuffer("Abhishek");
		StringBuffer s2 = new StringBuffer(str.length());
		
		//mutable start
		StringBuffer s3 = new StringBuffer("Internet of Things"); 
		System.out.println(s3.capacity());
		s3 = new StringBuffer(" ");
		System.out.println(s3.capacity());
		//end mutable

		System.out.println(s.capacity());
		System.out.println(s.capacity() + s1.capacity());
		System.out.println(s.length() + s1.length());
		System.out.println(s2.capacity());
		
		StringBuffer s4 = new StringBuffer("Internet");
		System.out.println(s4.append(" India"));
		
		/*Note you cannot 
		 * append String
		 * */
		
		StringBuffer s5 = new StringBuffer("Try");
		s5 = new StringBuffer("Jeva");
		s5.setCharAt(1, 'a');
		System.out.println(s5);
		
		
		
		//System.out.println(str.capacity());
		
		
		
		
		
	}

}
