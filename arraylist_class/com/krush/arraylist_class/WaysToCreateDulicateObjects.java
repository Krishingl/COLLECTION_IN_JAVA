package com.krush.arraylist_class;

import java.util.ArrayList;

public class WaysToCreateDulicateObjects 
{
     public static void main(String[] args) 
     { 
    	   ArrayList<String> orignal = new ArrayList<>();
    	   
    	   orignal.add("BCA");
    	   orignal.add("MCA");
    	   orignal.add("BBA");
    	   orignal.add("MBA");
//  		System.out.println(orignal);
    	   
    	   
    	   
    	   System.out.println("By using clone() Method ");
    	   @SuppressWarnings("unchecked")
		ArrayList<String> cloned = (ArrayList<String>)orignal.clone();
    	   cloned.add("BTech");
   		System.out.println(cloned);

   		
   		System.out.println("By using Copy Constructor : ");
   		
   		   ArrayList<String> copy= new ArrayList<>(orignal);
   		   
   		   System.out.println(copy);
   		   
	 }
}
