package com.krush.stack_class;

import java.util.Stack;

public class InsertionAndFetchingTheElement {

	public static void main(String[] args) 
	
	{
		Stack<Integer> stk = new Stack<>();
	      
		   //push,peek,pop,empty,search there are total five method are available in Stack class 
		try {
		
		stk.push(12);
		stk.push(15);
		stk.push(22);
        stk.push(33);
		stk.push(49);
		
		System.out.println("After Instertion elements Are : "+stk);stk.toString();//it internally call the toString method of Vector class and Vector class will call super.toSTring() means AbstarctVector class toString() inside retrieving logic(Iterator +StringBuffer) are there.

		System.out.println("Fetching the elements by using pop()method : ");
		
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		//System.out.println(stk.pop());//java.util.EmptyStackException
	
		
		
		
		
		System.out.println("After retriveing and deleting the elemenyts using Pop  Stack is having : "+stk.toString());
		System.out.println("Is Stack Empty ?  : "+stk.empty());
		}
	    catch(java.util.EmptyStackException e) {
	    	e.printStackTrace();
	    }
		
		
		
	}

}
