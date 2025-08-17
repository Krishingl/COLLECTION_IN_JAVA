package com.krush.linked_list;
//Insertion_Deletion_Displaying_Elements 

import java.util.Scanner;
import java.util.LinkedList;

public class Insertion_Deletion_Displaying_Elements {

	public static void main(String[] args) {
       
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		    Scanner sc = new Scanner(System.in);
		    boolean flag = true;
		    
		    
		    
		    while(flag) {

			System.out.println("-----------------------------------");
			
		    System.out.println("Lineked List: "+ linkedList);
		    
		    System.out.println("-----------------------------------");
		     
          System.out.println("1. Insert Element ");
          System.out.println("2. Delete Element ");
          System.out.println("3. Display Elements ");
          System.out.println("4. Exit\n\n");
          
          System.out.print("Enter Your Choice : ");
          int choice = Integer.parseInt(sc.nextLine());
          
               switch(choice) {
               
               case 1: System.out.println("Enter the element to insert : ");
                    int elementToAdd= Integer.parseInt(sc.nextLine());
                      
                     linkedList.add(elementToAdd);
                     break;
               case 2:   
            	        if(linkedList.isEmpty())
            	        {
            	        	System.out.println("Linked list is empty. Nothing to delete.");
            	        }
            	        else
            	        {
            	        	System.out.println("Enter the element to delete : ");
            	        	       int elementToDelete = Integer.parseInt(sc.nextLine());
            	        	       
            	        	       
            	        	       boolean remove = linkedList.remove(Integer.valueOf(elementToDelete));
            	        	       
            	        	      if(remove) {
            	        	    	  System.out.println("Element "+elementToDelete+" is deleted Succesfully.");
            	        	      }
            	        	      else {
            	        	    	  System.out.println("Element "+elementToDelete+" is not available in LinkedList.");            	        	      }
            	        }
            	        
                            break;
                 case 3:    
                	 System.out.println("Elements in The Linked List.");
               
                    linkedList.forEach(System.out::println);
                    break;
                 case 4:
                	   System.out.println("Exiting the Program.");
                	   sc.close();
                	  flag=false;
                	  
                 break;
                 default : System.out.println("Invalid choice. Please try again.");
               }
                   
               
               
           
            	   
          
		
		    }
		
	}

}
