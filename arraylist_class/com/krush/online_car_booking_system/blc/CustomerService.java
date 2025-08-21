package com.krush.online_car_booking_system.blc;

import java.util.ArrayList;
import java.util.ListIterator;

public class CustomerService {
	private static ArrayList<Customer> customers;
	
	  public CustomerService(){
		    customers = new ArrayList<>();
		  
	  }
	
	  public void addCustomer(Customer customer)
	  {
		 
		 customers.add(customer);
		  }
		 
	  
	  
	  private  boolean isFirstCustomer(Customer customer) {
		      boolean isNew=true;
		 
       	ListIterator<Customer> itr = customers.listIterator();
		     while(itr.hasNext()) {
		    	Customer cust = itr.next();
		    	
		    	if(cust.phone().equals(customer.phone())){
		    		isNew=false;
		    	}
		     }
		      
		  return isNew;
	  }
	  
	  public double calculateBill(Customer customer)
	  {      
		  if(isFirstCustomer(customer)) {
			  return 0;
		  }else if(customer.distance()<=4) {
			  return 80;
			  
		  }else {
			  
			  return (80+customer.distance()*6);
		  }
	  }
		  
		  public void printBill(Customer customer) {
			  System.out.println(customer.customerName()+" Please pay your bill of "+calculateBill(customer));
		
	
		  
	  }

}
