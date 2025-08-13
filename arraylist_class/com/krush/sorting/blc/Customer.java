package com.krush.sorting.blc;
/*
 Assignment 02:
--------------
Write a Program to perform sorting operation on Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the instance variable of Product class.

Implement Comparable interface to write the logic to sort the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.
---------------------------------------------------------------------------------------------

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Spliterator;

public class Customer {

	public static void main(String[] args) {
		
		
		ArrayList<Product> listOfProduct = new ArrayList<>();
		
		listOfProduct.add(new Product(101, "Laptop", 100000D));
		listOfProduct.add(new Product(103, "PC", 50000D));
		listOfProduct.add(new Product(102, "Mobile", 20000D));
		listOfProduct.add(new Product(104, "AC", 70000D));
		listOfProduct.add(new Product(105, "Watch", 1000D));
		listOfProduct.add(new Product(106, "TV", 60000D));
		
		    
		      
		System.out.println("Orignal List Of Products(Before Sorting): ");
		                
		      Spliterator<Product> spliterator = listOfProduct.spliterator();
		      
		      spliterator.forEachRemaining((p1)->System.out.println(p1));
		      
		System.out.println("After Sorting  List Of Products Based on the Product name (Acending Order): ");
            
		      Collections.sort(listOfProduct);
		      
		     listOfProduct.forEach(System.out::println);
		     
		     
		     
		     //
	}

}
