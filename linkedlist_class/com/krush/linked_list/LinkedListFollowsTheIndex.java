package com.krush.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFollowsTheIndex {

	public static void main(String[] args) {

                 LinkedList<Object> list= new LinkedList<>();
                 list.addFirst("Rahul");  list.add("Vishwajeet"); list.add("Nilesh");  list.add("Yash");
                 
                 list.add("Lalit");  list.add("Vijay"); list.add("Sham");  list.addLast("Sanjay");
                 
                 
                 System.out.println("Remove the elements from list first : "+list.removeFirst());
                 
                 System.out.println("Remove the elements from list last : "+list.removeLast());
                 
                 
                System.out.println("After Modification LinkedList : "+list);
                
                System.out.println("Retrive Data Based on the Index 0 : "+list.getFirst());
                System.out.println("Retrive Data Based on the Index 1 : "+list.get(1));
                
                     Iterator<Object> iterator = list.iterator();
                     
                     
                     iterator.forEachRemaining(System.out::println); //its available form JDK 1.8 version inside Iterator 
                 
                 

	}

}
