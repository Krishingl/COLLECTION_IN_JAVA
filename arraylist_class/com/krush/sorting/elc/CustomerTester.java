package com.krush.sorting.elc;

import java.util.ArrayList;

import com.krush.sorting.blc.Customer;

public class CustomerTester {
	
	public static void main(String[] args) 
	{
		ArrayList<Customer> listOfCustomer = new ArrayList<>();
		
		listOfCustomer.add(new Customer(1001, "Scott", 300d));
		listOfCustomer.add(new Customer(1002, "Allen", 900d));
		listOfCustomer.add(new Customer(1005, "Martin", 1200d));
		listOfCustomer.add(new Customer(1006, "Jhon", 1000d));
		listOfCustomer.add(new Customer(1004, "Smith", 2000d));
		listOfCustomer.add(new Customer(1003, "Gems", 200d));
		
		System.out.println("Before Sorting Customer Data: ");
		
		
	   listOfCustomer.forEach(System.out::print);
	   
	   System.out.println();
	   System.out.println();

		System.out.println("Sorting Customer Data Based on the Customer Number : ");
		
		listOfCustomer.sort((c1,c2)->c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
		listOfCustomer.forEach(System.out::print);
		   
		   System.out.println();
		System.out.println("Sorting Customer Data Based on the Customer name : ");
		
		listOfCustomer.sort((c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
		listOfCustomer.forEach(System.out::print);
		   
		   System.out.println();
			System.out.println("Sorting Customer Data Based on the Customer Bill : ");
			
			listOfCustomer.sort((c1,c2)->c1.getCustomerBill().compareTo(c2.getCustomerBill()));
			
			listOfCustomer.forEach(System.out::print);
			   
		
		
	}

}
