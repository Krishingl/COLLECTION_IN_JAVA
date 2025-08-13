package com.krush.arraylist_class;

import java.util.ArrayList;
import java.util.List;

public class SumOfArrayListElements
{

	public static void main(String[] args) 
	{
		
		
		ArrayList<Integer> listOfNumbers= new ArrayList<>();
		listOfNumbers.add(100);
		listOfNumbers.add(200);
		listOfNumbers.add(300);
		listOfNumbers.add(400);
		int sum= 0;
		for(int number : listOfNumbers) 
		{
			sum+=number;
		}
		 
		System.out.println("Sum Of numbers : "+sum);
		
	}
}
