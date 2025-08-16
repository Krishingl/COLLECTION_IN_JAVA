package com.krush.vector;

import java.util.Arrays;

public class MyVector<E>
{
   //Vector is dynamically growable class in Collection.
	
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
		
   //Adding elements to  end position
		public void add(E element) 
		{
			if(elementCount ==elements.length)
			{
				//grow();
			}
			elements[elementCount++]=element;
			
		}
   
   //Remove an elements based on the index position
		@SuppressWarnings("unchecked")
		public E remove(int index)
		{
			//verifyIndex(index);
			
		
			E removeElement = (E) elements[index];
			
			
			int numMoved = elementCount -index -1;
			
			
			if(numMoved>0) {
				System.arraycopy(elements, index+1, elements, index, numMoved);
			}
			elements[--elementCount]=null; //For GC only
			
			
			return removeElement;
		}
		
		
		//size 
		public int size() 
		{
			return this.elementCount;
		}
		//capacity
		public int capacity()
		{
			return elements.length;
		}
		
		//Vector Empty or Not
		public boolean isEmpty() {
			return elementCount==0;
		}
		
		//clear the all the elements
		public void clear()
		{
			Arrays.fill(elements, 0, elementCount, null);
			
			elementCount=0;
		}
		
		//toString()
		public String toString() {
			StringBuilder sb = new StringBuilder("[");
		}
		
		
}
