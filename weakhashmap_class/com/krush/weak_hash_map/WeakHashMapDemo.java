package com.krush.weak_hash_map;

import java.util.WeakHashMap;
record Product(String name , Integer id) {
	
	@Override 
	public void finalize() {
		System.out.println("Product object is ilegible for gc "+this);
	}
}

public class WeakHashMapDemo {
	
	
	public static void main(String[] args) 
	{
		WeakHashMap< Product, String> map= new WeakHashMap<>();
		Product p1=new Product("Laptop", 121);
		
		  map.put(p1,"Pune");
		  map.put(new Product("Mobile", 122),"Mumbai");
		  
//		  p1=null;
		  System.gc();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		  System.out.println(map);
		  
		
	}

}
