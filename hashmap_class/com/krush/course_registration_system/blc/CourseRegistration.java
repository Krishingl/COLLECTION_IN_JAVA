package com.krush.course_registration_system.blc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class  CourseRegistration  {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		     //courseName   //Student Object
		HashMap<String,List<String>> map= new HashMap<>();
		
		
		 while(true) {
		  System.out.println("""
		  		--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
		  		""");
		  
		  
		  System.out.print("Enter Your Choice : ");
		  int choice = Integer.parseInt(sc.nextLine());
		  
		    switch(choice)
		    {
		    case 1: 
		    	   System.out.print("Enter course name : ");
		    	   String cName= sc.nextLine();
		    	   System.out.println("Enter student name: ");
		    	   String sName= sc.nextLine();
		    	  map.computeIfAbsent(cName,(key)-> new ArrayList<String>()).add(sName);
		    	  System.out.println(sName+" registered to "+cName);
		    	break;
		    case 2:
		    	Set<Entry<String, List<String>>> listOfStudent=  map.entrySet();
		    	  
//		    	listOfStudent.forEach(System.out::println);
	    	   System.out.println("Course → Students List:");
		    	map.forEach((key,value)->System.out.println(key+" -> "+value));
		    	break;
		    	
		    	
		    case 3:
		    	 System.out.print("Enter course name : ");
		    	   cName= sc.nextLine();
		    	   System.out.println("Enter student name: ");
		    	   sName= sc.nextLine();
		    	if(map.computeIfPresent(cName, (key,value)->value).remove(sName)) { 
		    		
		    		System.out.println(sName+" removed from course "+cName);
		    	}else {
		    		System.err.println("Student not Exist..");
		    	}
		    	break;
		    case 4:{
		    	System.out.println("Exiting Course Registration System.");
		         System.exit(0);
		    }
		    default: System.err.println("Invalid Option...!!");
		    	   
		    }
	}
	}

}
