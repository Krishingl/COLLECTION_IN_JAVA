package com.krush.map_introduction;

import java.util.HashMap;
import java.util.Map;

public class MethodsOfMapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

//1)    V put(K key, V value);  --> Here now K=String object and V=String object
		map.put("Krushna123", "1234");
		map.put("ram123", "8834");
		map.put("martin", "3884");
		map.put("ravi", "123467");
		// Here 4 entry are Successfully entered in the map collection.

		 System.out.println(map.put("ravi", "123467")); //if key is already exist then
		// it return the Old Value Object.
		 System.out.println(map.put("sham", "123467")); //if Key is not Exist and its
		// unique then it will add the entry in the map collection and return null.

	//	System.out.println(map.toString());

//2)  default V putIf(K key , V value); //JDK 1.8 

		/*
		 * default V putIfAbsent(K key, V value) { V v = get(key); if (v == null) { v =
		 * put(key, value); }
		 * 
		 * return v; }
		 */

		System.out.println(map.putIfAbsent("ravi", "123")); // 123467
		// if and only if the key is not available in the map collection then only entry
		// will be inserted otherwise it will return existing key value.
		// it not modify the old key value if key not present then only it insert or add
		// the entry in the map collection.
	System.out.println("get method");	
//3)   V get(K key);
		
		  System.out.println(map.get("ram123"));//8834
		  
		  System.out.println(map.get("ram12"));//null
		  //its return the value if the key is available in the map collection
		  //if not available then its return null
		  
		  //to avoid that null return problem then java given the one method in jdk 1.8 Version 
		  
//4) default V getOrDefault( Object key , Object defaultValue);
		  
		//its return the key value if available if not available then its return the  default value we are passed as the second parameter.
		  
		   System.out.println(map.getOrDefault("ram123","Key is Not Available"));//8834
		  
		   System.out.println(map.getOrDefault("ram12","Key is Not Available"));//Key is Not Available
			  
//5)   boolean containsKey(K key);
		   
		   //its return true if key is available in the map collection, otherwise its return false.
		   
		   System.out.println(map.containsKey("ram123"));//true
		   System.out.println(map.containsKey("ram12"));//false
		   
//6) boolean containsValue(V value):
		  // its return true if the value is available in collection it will search the value forward direction if available then return true(means it check left to right fist occurrence)
		   System.out.println(map.containsValue("1234"));//true
		   System.out.println(map.containsValue("11111"));//false
		   
//7) int size():
		   
		   
		   System.out.println(map.size());//5
		   
//8) remove(Object key):
		      //it will remove the the particular entry based on the key.
		      
		   System.out.println(map.remove("ravi", "123467"));
		   
		   

	}

}
