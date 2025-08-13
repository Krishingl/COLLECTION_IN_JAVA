package com.krush.vector;

public class MyVector<E>
{
   //Vector is dynamically Growable class in Collection.
	
	private Object[] elements;
	private int elementCount;//Size of array will calculated
	private static final int DEFAULT_CAPACITY=10;
	
	//Default capacity is 10
	public MyVector()
	{
		elements = new Object[DEFAULT_CAPACITY];
	    elementCount =0;
	    
	}
	//Constructor With intialCapacity
		public MyVector(int initialCapacity)//its a outer world data then we need to validate the data
		{   
			if(initialCapacity < 0 ) 
			{
				throw new  IllegalArgumentException("Capacity can't be Negative");
			}
			elements = new Object[initialCapacity];
		    elementCount =0;
		    
		}
}
