package com.krush.online_car_booking_system.elc;


import com.krush.online_car_booking_system.blc.Customer;
import com.krush.online_car_booking_system.blc.CustomerService;

public class CabCustomerServiceTester 
{
      public static void main(String[] args) {
    	  

    	  try {
    	  Customer c1=new Customer(101, "Krushna", "Ameerpeth", "Nampaly", 5, "1111111111");
    	  
    	  Customer c2=new Customer(102, "SMITH", "Ameerpeth", "Nampaly", 10, "2222222222");

    	  Customer c3=new Customer(103, "JOHN", "Ameerpeth", "Nampaly", 3, "3333333333");
    	  Customer c4=new Customer(103, "JOHN", "Ameerpeth", "Nampaly", 3, "3333333333");
    	  
    	 CustomerService cs = new CustomerService();
    	
    	 cs.printBill(c1);
		cs.addCustomer(c1);
		
		    cs.printBill(c2);
			cs.addCustomer(c2);
			 cs.printBill(c4);
			cs.addCustomer(c4);
			 cs.printBill(c3);
				cs.addCustomer(c3);
				cs.printBill(c2);
				cs.printBill(c1);
    	  }catch(IllegalArgumentException e)
    	  {
    		  System.out.println(e.getMessage());
    	  }
		
	}
}
