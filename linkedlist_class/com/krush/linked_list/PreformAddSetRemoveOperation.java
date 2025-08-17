package com.krush.linked_list;

//ListIterator method (add() , set() , remove())

import java.util.*;
public class PreformAddSetRemoveOperation 
{

	public static void main(String[] args)
	{
		LinkedList<String> city = new LinkedList<>();
		city.add("Kolkata");
//		
		city.add("Shegaon");
		city.add("Khamgaom");
		city.add("Pune");
		city.add("Hydrabad");
		
		System.out.println(city);
		
		
		ListIterator<String> listItr= city.listIterator();
		while(listItr.hasNext())
		{
			String cityName= listItr.next();
			
			if(cityName.equals("Khamgaon"))
			{
				listItr.remove();
			}
			else if(cityName.equals("Pune"))
			{
				listItr.set("Mumbai");
			}else if(cityName.equals("Hydrabad"))
			{
				listItr.add("Hightech City");
			}
		}
		
		
		city.forEach(System.out::println);
	}

}
/*
 Insert(add),Replace(set),and remove perform on the list by using ListIterator to Avoid the ConcurrentModifiactionException.
 */
