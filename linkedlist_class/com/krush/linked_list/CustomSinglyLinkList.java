package com.krush.linked_list;

public class CustomSinglyLinkList
{

	
	private static class Node
	{
		int item;
		Node next;
		
		public Node(int item) {
			this.item=item;
			next=null;
		}
		
		
		
		
	}
	public static void main(String[] args) {
	   Node n1 = new Node(100);
	   Node n2 = new Node(200);
	   Node n3 = new Node(300);
	      // System.out.println(n1.next.next);  NullPointerException
	   
	    //Singly linked list
	      n1.next =n2;
	      n2.next= n3;
	    System.out.println(n1.item);
	    System.out.println(n1.next.item);
	    System.out.println(n1.next.next.item);
	    

	}

}
