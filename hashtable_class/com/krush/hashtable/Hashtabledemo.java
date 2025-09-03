package com.krush.hashtable;

import java.util.Hashtable;

public class Hashtabledemo {
	public static void main(String args[])
	{  
		//Hashtable is legacy class available from 1.0 version and it dose not accept null as key and null hash a value 
		//its as first class that follows the the Hashtable data Structure
		//all the methods are synchronized that reason performance is not good as compare to HashMap.
		
		Hashtable<Integer,String> map= new Hashtable<>();//11 buckets are created here
		
		map.put(1, "Java");
		map.put(2,"is");
		map.put(3,"best");
		map.put(4, "language");
		
		
		System.out.println("\u001B[36m"+map);
		
		
		
		System.out.println("\u001B[31m"+"-----------------------------------------------------------");
		
		
		
	}

}
