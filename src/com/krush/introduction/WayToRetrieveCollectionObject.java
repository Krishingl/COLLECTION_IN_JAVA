package com.krush.introduction;

import java.util.*;

public class WayToRetrieveCollectionObject {

	public static void main(String[] args) 
  {
          Vector<String> listOfCity = new Vector<>();
          
          listOfCity.add("Hyderabad");
          listOfCity.add("Kolkata");
          listOfCity.add("Pune");
          listOfCity.add("Indore");
          listOfCity.add("Mumbai");
          listOfCity.add("Chanai");
          
          
                             long start = System.currentTimeMillis();
          
          System.out.println("1)By using toString() method : ");

          System.out.println("     "+listOfCity.toString());
                              long end = System.currentTimeMillis();
                              
               System.out.println("Total time taken by "+(end-start));               
          System.out.println("===================================================================");
          System.out.println("2)By using Ordinary For loop : ");
             start = System.currentTimeMillis();
             for(int i=0;i<listOfCity.size();i++) {
                 System.out.print(" "+listOfCity.get(i));

             }
             System.out.println(" ");
             end = System.currentTimeMillis();
             
             System.out.println("Total time taken by "+(end-start));
             System.out.println("===================================================================");

 System.out.println("3)By using  For Each loop (JDK 1.5V):  ");
 start = System.currentTimeMillis();

             for(int i=0;i<listOfCity.size();i++) {
                 System.out.println("     "+listOfCity.get(i));

             }

             end = System.currentTimeMillis();
             
             System.out.println("Total time taken by "+(end-start));
             System.out.println("===================================================================");

             System.out.println("4)By using  Enumeration Interface (JDK 1.0V) :  ");
                         
             start = System.currentTimeMillis();
                    Enumeration<String> elements = listOfCity.elements();        
                         
                   while(elements.hasMoreElements()) {
                	   
                	   System.out.print("  "+elements.nextElement());//it is cursor
                	   
                	   
                   }
                    System.out.println();
                         
            

                    end = System.currentTimeMillis();
                    
                    System.out.println("Total time taken by "+(end-start));
             
             
             
             
             
          
	}

}
