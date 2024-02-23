package com.edubridge.Homework;

import java.util.Comparator;

public class RatingCompare implements Comparator<ProductComparable>{

	@Override
	public int compare(ProductComparable o1, ProductComparable o2) {
		if(o1.getRating()<o2.getRating()) 
		{
			return -1;
		}
		else if(o1.getRating()<o2.getRating()) 
		{
			return 1;
		}
		else
		return 0;
	}

}
