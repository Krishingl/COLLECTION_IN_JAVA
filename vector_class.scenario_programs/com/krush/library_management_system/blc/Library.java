package com.krush.library_management_system.blc;

import java.util.*;

public class Library 
{
	
	
          public void displayAvailableBooks( Vector<Book> listOfBooks)
          {   
        	  System.out.println("Available Books in the Library :");
//        	   System.out.println(listOfBooks);
        	  
        	      Iterator<Book> iterator = listOfBooks.iterator();
        	      
        	      iterator.forEachRemaining(System.out::println);
          }
          
          public void  issueBook(Vector<Book> listOfBooks, Scanner sc)
          {
        	    System.out.print("Enter Book id which for Book issue :");
        	      int bookId= Integer.parseInt(sc.nextLine());
        	      
        	            ListIterator<Book> listIterator = listOfBooks.listIterator();
        	            boolean flag = true;
        	           while(listIterator.hasNext()) {
        	            	 
        	                Book book=   listIterator.next();
        	                if(bookId==book.id()) 
        	                {
        	                System.out.println(" Issued: "+book);
        	                
        	                          listIterator.remove();
        	                          
        	                       flag=false;
        	                        
        	                }
        	                
        	                
        	            	
        	            }
        	           if(flag) {
   	                	System.err.println("Book with ID "+bookId+" not Found");
   	                }
          }
          
          public void  searchBook(Vector<Book> listOfBook, Scanner sc)
          {
        	System.out.print("Enter keyword to search by title or author: ");
        	String authorName= sc.nextLine();
        	    boolean found = true;
        	     ListIterator<Book> listIterator = listOfBook.listIterator();
        	      while(listIterator.hasNext()){      
        	    	  Book book= listIterator.next();
        	      
                 if(book.author().equals(authorName)) {
                	 System.out.println("Found: "+book);
                	 found=false;
                 }
                
        	      }
        	      if(found) {
        	    	  
                     	 System.out.println("No matching book found");
                      
        	      }
        	      
          }
          
}
