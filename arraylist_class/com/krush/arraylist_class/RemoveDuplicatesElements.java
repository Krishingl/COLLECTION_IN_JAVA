package com.krush.arraylist_class;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesElements {

	public static void main(String[] args) 
	{

     ArrayList<String> listOfFruits= new ArrayList<>();
     
     
     
     
     listOfFruits.add("Apple");
     listOfFruits.add("Apple");
     listOfFruits.add("Orange");
     listOfFruits.add("Mango");
     listOfFruits.add("Papaya");
     
     listOfFruits.forEach(System.out::println);
     
    
     System.out.println("Removing Duplicates ");
     HashSet<String> fruits= new HashSet<>(listOfFruits);
     
     fruits.forEach(System.out::println);

	}
}
