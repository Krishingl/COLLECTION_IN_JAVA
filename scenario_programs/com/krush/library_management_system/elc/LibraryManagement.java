package com.krush.library_management_system.elc;

import java.util.Scanner;
import java.util.Vector;

import com.krush.library_management_system.blc.Book;
import com.krush.library_management_system.blc.Library;

public class LibraryManagement 
{
public static void main(String[] args) {
	
	Vector<Book> listOfBook =  new Vector<>();
	
	
	
	listOfBook.add(new Book(101, "Core Java", "Mr James"));
	listOfBook.add(new Book(102, "Adc Java", "Mr Robert"));
	listOfBook.add(new Book(103, "Head First Java", "Miss KAthy Sierra"));
	listOfBook.add(new Book(104, "Programming in C", "Mr Denis"));
	
	
	Scanner sc = new Scanner(System.in);
	 
	System.out.print("Select from the Menu :\r\n"
			+ "	 1) Display Books Available in the Library :\r\n"
			+ "	 2) Search a Book in the Library :\r\n"
			+ "	 3) Issue a Book from the Library :\r\n"
			+ "	 4) Exit from the application :\r\n"
			);

	             int choice = 0;
	             Library lib= new Library();
	        	 do {
	        		 System.out.print("Please Enter your Choice : ");
	        		 choice=Integer.parseInt(sc.nextLine());
	        
	           switch(choice)
	           {  
	        	  
	           case 1:  lib.displayAvailableBooks(listOfBook);
	        	break;
	           case 2: lib.searchBook(listOfBook, sc);
	           break;
	           case 3:
	        	       lib.issueBook(listOfBook, sc);
	        	break;
	           case 4:
	        	   System.out.println("Application Exiting.. Thank You for Visting!!");
	        	        
	        break;
	            default: System.err.println("Invalid Option..!");
	           }
	          }while(choice!=4);
	          
	          
	             
	
	
}
}
