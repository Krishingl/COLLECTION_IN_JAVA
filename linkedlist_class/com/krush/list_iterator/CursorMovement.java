package com.krush.list_iterator;
import java.util.*;

public class CursorMovement 
{
	public static void main(String[] args) {
		
		LinkedList<String > list = new LinkedList<>();   //Generic
		
		//Cursor here
		list.add("A");  //index 0
		   
	     list.add("B");  //index 1
		
		  list.add("C");   //index 2
		
		list.add("D");   //index 3
		
		
		
		ListIterator<String>  it = list.listIterator();
		
		     while(it.hasNext())
		     {
		    	 int index = it.nextIndex();  //cursor after index number
		    	  String value= it.next();   //it will move the cursor forward and return the object.
		    	  
		    	  
		    	  System.out.println("Index "+index+" -> "+value);
		     
		     
		     }
		
		     while(it.hasPrevious())
		     {
		    	 int index = it.previousIndex();  //cursor after index number
		    	  String value= it.previous();   //it will move the cursor forward and return the object.
		    	  
		    	  
		    	  System.out.println("Index "+index+" -> "+value);
		     
		     
		     }
		     
		     
		     //also we can start the cursor in the middle. using    listInterator(int index)  if index is greater or equal to size then it returns the indexOutOfBoundException
		
		     
		     ListIterator<String> it2 = list.listIterator(2);
		     
		     
		     while(it2.hasNext())
		     {
		    	 System.out.println("Index : "+it2.nextIndex()+" -> "+it2.next());
		     }
	}

}
