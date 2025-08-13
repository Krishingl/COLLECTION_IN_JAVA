package com.krush.arraylist_class;

import java.util.ArrayList;
import java.util.Collections;


public class DecendingSortingWays {

	public static void main(String[] args) {
		
		
		ArrayList<String> listOfProduct= new ArrayList<>();
		
		listOfProduct.add("Laptop");
		listOfProduct.add("Mobile");
		listOfProduct.add("Ac");
		listOfProduct.add("Tv");
		listOfProduct.add("EarPhone");
		listOfProduct.add("SmartPhone");
		
//		System.out.println("Product in Descending Order Using Comparator ");
//	    Collections.sort(listOfProduct,(p1,p2)->p2.compareTo(p1));
//		   listOfProduct.forEach((p)->System.out.println(p));
//		   System.out.println("");
		   System.out.println("Using Collections Class reverseOrder() : ");
		  Collections.sort(listOfProduct,Collections.reverseOrder());
		  listOfProduct.forEach((p)->System.out.println(p));
	}

}
