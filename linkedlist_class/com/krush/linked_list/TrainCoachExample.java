package com.krush.linked_list;

import java.util.LinkedList;

public class TrainCoachExample {

	public static void main(String[] args) {
		
		LinkedList<String> train = new LinkedList<>();
		
		
		    train.add("Coach A");
		    train.add("Coach B");
		    train.add("Coach C");
		    System.out.println("Initial Train: "+train);
		    
		    train.addFirst("Engine");
		    System.out.println("After adding Engine at Front : "+train);
		    
		    train.addLast("Guard Coach");
		    System.out.println("After adding Gaurd Coach at end "+ train);
		       
		    train.add(2,"Pantry Coach");
		    System.out.println("After adding Pantry Coach in middle "+ train);
		       System.out.println("Train Started.....");
		       
		       System.out.println("running.....");
		       
		       
		       System.out.println("Reached to Destination");
		    train.removeFirst();
		    System.out.println("After removing First Coach : "+train);
		    
		    
		    train.removeLast();
		    System.out.println("After removing Last Coach : "+train);
		    
		    train.remove(1);
		    System.out.println("After removing Pantry Coach : "+train);
	}

}
