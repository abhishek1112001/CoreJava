package com.edubridge.Homework;

import java.util.ArrayList;
import java.util.Collections;

public class ProductComparable implements Comparable<ProductComparable>{
	
	private String pname;
	private int price;
	private int rating;

	@Override
	public int compareTo(ProductComparable o) {
		
		return this.price - o.price;
	}

	public ProductComparable(String pname, int price, int rating) {
		super();
		this.pname = pname;
		this.price = price;
		this.rating = rating;
	}

	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public static void main(String[] args) {
		
		ArrayList<ProductComparable>list = new ArrayList<ProductComparable>();
		list.add(new ProductComparable("speakers",100,4));
		list.add(new ProductComparable("car",50,2));
		list.add(new ProductComparable("pc",50000,1));
		list.add(new ProductComparable("mouse",50,3));
		Collections.sort(list);
		for(ProductComparable p1:list) 
		{
			System.out.println("Product Name :" + p1.getPname() +"\nProduct prive : "+p1.getPrice()+"\nProduct Rating :"+p1.getRating());
		}
		
		System.out.println("Compare Rating with 2 objects");
		RatingCompare r1 = new RatingCompare();
		Collections.sort(list,r1);
		for(ProductComparable pp:list) 
		{
			System.out.println("Product Name :" + pp.getPname() +"\nProduct prive : "+pp.getPrice()+"\nProduct Rating :"+pp.getRating());
		}
		

	}

}
